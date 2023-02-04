package src.Decorator;

public class Veggi extends Pizza{

    public Veggi() {
        super("Veggi");
    }

    @Override
    public float getCost() {
        return 31.3F;
    }
}
