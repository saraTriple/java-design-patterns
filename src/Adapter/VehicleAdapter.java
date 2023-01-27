package src.Adapter;

public abstract class VehicleAdapter extends Vehicle implements AdapterService {

    public VehicleAdapter(String brand) {
        super(brand);
    }

    int getSpeed() {
        return speedKMH();
    }

    public String toString() {
        return brand + " : " + getSpeed() + " KMPH";
    }
}
