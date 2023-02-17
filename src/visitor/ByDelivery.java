package src.visitor;

public class ByDelivery implements HowTo{
    private String name;
    private final String method = "By Delivery";
    @Override
    public void visit(Pizza pizza) {
        pizza.getName();
    }

    @Override
    public String toString() {
        return "ByDelivery{" +
                "name='" + name + '\'' +
                ", method='" + method + '\'' +
                '}';
    }
}
