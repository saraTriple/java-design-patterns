package src.Prototype;

public class Client {

    public static void main(String[] args) {
        Shape shape = new Point(1, 3);

        // Cloning shape
        Shape shape1 = shape.clone();

        System.out.println(shape.getTx());
        System.out.println(shape1.getTx());
        System.out.println(shape.getTy());
        System.out.println(shape1.getTy());
    }
}
