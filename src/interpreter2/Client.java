package src.interpreter2;

import java.util.List;

public class Client {

    public static void main(String[] args) {
        Expression query = new Select("*", new From("people"));
        Context context = new Context();
        List<String> result = query.interpret(context);
        System.out.println(result);

        Expression query2= new Select("name", new From("people"));
        Context context2 = new Context();
        List<String> result2 = query2.interpret(context2);
        System.out.println(result2);

        Expression query3 = new Select("name",
                new From("people" ,
                        new Where(name -> name.toLowerCase().startsWith("l"))));

        Context context3 = new Context();
        List<String> result3 = query3.interpret(context3);
        System.out.println(result3);
    }
}
