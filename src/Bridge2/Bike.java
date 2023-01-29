package src.Bridge2;

public class Bike extends Vehicle{
    @Override
    public void manufacture() {
        BikeAssembleWorkshop bikeAssembleWorkshop = new BikeAssembleWorkshop();
        BikeProduceWorkshop bikeProduceWorkshop = new BikeProduceWorkshop();
        bikeAssembleWorkshop.assemble();
        bikeProduceWorkshop.produce();

    }
}
