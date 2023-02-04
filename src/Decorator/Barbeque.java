package src.Decorator;

public class Barbeque extends ToppingsDecorator{
    Pizza pizza;

    public Barbeque(Pizza pizza) {
        super("Barbeque");
        this.pizza = pizza;
    }


    @Override
    public float getCost() {
        return 10 + pizza.getCost();
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " ," + this.description;
    }
}
