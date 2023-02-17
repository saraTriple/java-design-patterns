package src.visitor;

public class OnTable implements HowTo{
    private String name;
    private final String method = "On Table" ;
    @Override
    public void visit(Pizza pizza) {
        this.name = pizza.getName();
    }

    @Override
    public String toString() {
        return "OnTable{" +
                "name='" + name + '\'' +
                ", method='" + method + '\'' +
                '}';
    }
}
