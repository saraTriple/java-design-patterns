package src.visitor;

public class Client {
    public static void main(String[] args) {
        Pizza pizza = new Cheese();
        HowTo deliveryMethod = new OnTable();

        deliveryMethod.visit(pizza);

        System.out.println(deliveryMethod.toString());

    }
}
