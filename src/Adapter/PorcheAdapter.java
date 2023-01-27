package src.Adapter;

public class PorcheAdapter extends VehicleAdapter{

    public PorcheAdapter() {
        super("Porche");
    }

    @Override
    public int speedKMH() {
        return (int) (220 * 1.6);
    }
}
