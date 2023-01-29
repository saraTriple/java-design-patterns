package src.Bridge2;

// Abstraction
public abstract class Vehicle {
    WorkShop assembleWorkshop;
    WorkShop produceWorkshop;

    public Vehicle(WorkShop assembleWorkshop, WorkShop produceWorkshop) {
        this.assembleWorkshop = assembleWorkshop;
        this.produceWorkshop = produceWorkshop;
    }

    public abstract void manufacture();
}
