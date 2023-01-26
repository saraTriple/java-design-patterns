package src.Factory;

public class Client {

    public static void main(String[] args) {
        Factory();
    }

    public static void Factory() {
        // creating a circle
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape("circle");
        shape.drawShape();

    }

}
