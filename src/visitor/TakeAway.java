package src.visitor;

public class TakeAway implements HowTo{
    private String name;
    private final String method = "Take away";
    @Override
    public void visit(Pizza pizza) {
        pizza.getName();
    }

    @Override
    public String toString() {
        return "TakeAway{" +
                "name='" + name + '\'' +
                ", method='" + method + '\'' +
                '}';
    }
}
