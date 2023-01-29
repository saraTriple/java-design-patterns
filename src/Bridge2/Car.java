package src.Bridge2;

public class Car extends Vehicle{

    public Car(WorkShop assembleWorkshop, WorkShop produceWorkshop) {
        super(assembleWorkshop, produceWorkshop);
    }

    @Override
    public void manufacture() {
        System.out.println("Car");
        assembleWorkshop.work();
        produceWorkshop.work();
    }
}
