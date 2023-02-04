package src.Decorator;

public class Tomato extends ToppingsDecorator{

    Pizza pizza;

    public Tomato(Pizza pizza) {
        super("Tomato Topping");
        this.pizza = pizza;
    }

    @Override
    public float getCost() {
        return 3.5F + pizza.getCost();
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " ," + this.description;
    }
}
