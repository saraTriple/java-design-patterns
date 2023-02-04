package src.Decorator;

public class Cheese extends ToppingsDecorator{

    // Initial Pizza
    Pizza pizza;

    public Cheese(Pizza pizza) {
        super("Cheese Toppings");
        this.pizza = pizza;
    }

    @Override
    public float getCost() {
        return 5 + pizza.getCost();
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " ," + this.description;
    }
}
