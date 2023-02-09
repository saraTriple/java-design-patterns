package src.AbstractFactory;

// The factory of factories
public abstract class AbstractFactory {
    abstract Shape getShape(String shapeType);
}
