package src.Bridge2;

public class Truck extends Vehicle{

    public Truck(WorkShop assembleWorkshop, WorkShop produceWorkshop) {
        super(assembleWorkshop, produceWorkshop);
    }

    @Override
    public void manufacture() {
        System.out.println("Truck");
        assembleWorkshop.work();
        produceWorkshop.work();
    }
}
