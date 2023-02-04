package src.Decorator2;

public class SportCar extends CarDecorator{
    public SportCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Sports Car Features added :)");
    }
}
