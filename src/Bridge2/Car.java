package src.Bridge2;

public class Car extends Vehicle{
    @Override
    public void manufacture() {
        CarAssembleWorkshop carAssembleWorkshop = new CarAssembleWorkshop();
        CarProduceWorkshop carProduceWorkshop =new CarProduceWorkshop();
        carAssembleWorkshop.assemble();
        carProduceWorkshop.produce();
    }
}
