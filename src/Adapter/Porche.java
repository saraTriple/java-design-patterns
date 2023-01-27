package src.Adapter;

public class Porche extends Vehicle{

    public Porche() {
        super("Porche");
    }

    @Override
    int getSpeed() {
        return 220;
    }
}
