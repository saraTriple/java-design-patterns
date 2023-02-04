package src.Decorator;

public class Pepperoni extends Pizza{
    public Pepperoni() {
        super("Pepperoni");
    }

    @Override
    public float getCost() {
        return 23.5F;
    }
}
