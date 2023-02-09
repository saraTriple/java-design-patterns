package src.AbstractFactory;

// Rounded Shape Production
public class RoundedShapeFactory extends AbstractFactory {
    @Override
    Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new RoundedRectangle();
        }
        if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new RoundedSquare();
        }

        return null;
    }
}
