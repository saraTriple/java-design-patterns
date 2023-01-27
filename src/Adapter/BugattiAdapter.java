package src.Adapter;

public class BugattiAdapter extends VehicleAdapter{

    public BugattiAdapter() {
        super("Buggati");
    }
    @Override
    public int speedKMH() {
        return (int) (240 * 1.6);
    }
}
