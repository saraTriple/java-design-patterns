package src.Decorator2;

public class Client {

    public static void main(String[] args) {
        System.out.println("Building Basic Car:");
        Car car = new BasicCar();
        car.assemble();

        System.out.println("Adding Luxury Car features:");
        car = new LuxuryCar(car);
        car.assemble();

        System.out.println("Adding Sports car features");
        car = new SportCar(car);
        car.assemble();

    }
}
