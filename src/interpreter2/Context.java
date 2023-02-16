package src.interpreter2;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Context {

    private static Map<String, List<Row>> tables= new HashMap<>();

    private String table;
    private String column;

    static  {
        List<Row> list = new ArrayList<>();
        list.add(new Row("Cena", "Carry"));
        list.add(new Row("John", "Travolta"));
        list.add(new Row("Liam", "Neeson"));

        tables.put("people", list);
    }

    private int colIndex = -1;

    private static final Predicate<String> matchAnyString = s -> s.length() > 0;
    private static final Function<String, Stream<? extends String>>  matchAllColumns = Stream::of;

    private Predicate<String> whereFilter = matchAnyString;
    private Function<String, Stream<? extends String>> columnMapper = matchAllColumns;

    public void setColumn(String column) {
        this.column = column;
        setColumnMapper();
    }

    void setTable(String table) {
        this.table = table;
    }

    void setFilter(Predicate<String> filter) {
        whereFilter = filter;
    }

    void clear() {
        column = "";
        columnMapper = matchAllColumns;
        whereFilter = matchAnyString;
    }

    List<String> search() {
        List<String> result = tables.entrySet()
                .stream()
                .filter(entry -> entry.getKey().equalsIgnoreCase(table))
                .flatMap(entry -> Stream.of(entry.getValue()))
                .flatMap(Collection::stream)
                .map(Row::toString)
                .flatMap(columnMapper)
                .filter(whereFilter)
                .collect(Collectors.toList());
        clear();
        return result;
    }

    private void setColumnMapper() {
        switch (column) {
            case "*":
                colIndex = -1;
                break;
            case "name":
                colIndex = 0;
                break;
            case "lastName":
                colIndex = 1;
                break;
        }

        if (colIndex != -1) {
            columnMapper = s -> Stream.of(s.split(" ")[colIndex]);
        }
    }
}
