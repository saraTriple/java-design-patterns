package src.Bridge2;

public class Bike extends  Vehicle{

    public Bike(WorkShop assembleWorkshop, WorkShop produceWorkshop) {
        super(assembleWorkshop, produceWorkshop);
    }

    @Override
    public void manufacture() {
        System.out.println("Bike");
        assembleWorkshop.work();
        produceWorkshop.work();
    }
}