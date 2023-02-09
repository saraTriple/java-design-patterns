package src.AbstractFactory;

public class Client {
    public static void main(String[] args) {
        // Normal Shapes
        AbstractFactory normalShapeFactory = FactoryProducer.getFactory(false);
        Shape normalShape = normalShapeFactory.getShape("Rectangle");
        normalShape.drawShape();

        // Rounded Shape
        AbstractFactory roundShapeFactory = FactoryProducer.getFactory(true);
        Shape roundedShape = roundShapeFactory.getShape("Rectangle");
        roundedShape.drawShape();
    }
}
