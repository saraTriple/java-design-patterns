package src.Bridge2;

public class Client {

    public static void main(String[] args) {
        Vehicle car = new Car(new Produce(), new Assemble());
        car.manufacture();

        Vehicle truck = new Truck(new Produce(), new Assemble());
        truck.manufacture();

        Vehicle bike =  new Bike(new Paint(), new Assemble());
        bike.manufacture();
    }
}
