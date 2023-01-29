package src.Bridge;

public class Client {

    public static void main(String[] args) {
        Shape shape = new Circle(new BlueColor());
        shape.applyColorToShape();

        Shape shape1 = new Circle(new RedColor());
        shape1.applyColorToShape();
    }
}
