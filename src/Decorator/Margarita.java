package src.Decorator;

public class Margarita extends Pizza{

    public Margarita() {
        super("Margarita");
    }

    @Override
    public float getCost() {
        return 20;
    }
}
