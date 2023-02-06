package src.Composite;

public class Client {

    public static void main(String[] args) {
        // Here the drawing is the composite.
        // Composite is sth like the container of other classes

        Shape shape = new Triangle("Tri 0", "Red");
        Shape shape1 = new Triangle("Tri 1", "Orange");
        Shape shape2 = new Circle("Cir 0", "Green");

        Drawing drawing = new Drawing();
        drawing.add(shape);
        drawing.add(shape1);
        drawing.add(shape2);

        // Applying the Red color to all of my shapes
        drawing.draw("Blue");
    }
}
