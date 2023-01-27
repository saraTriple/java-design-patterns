package src.Adapter2;

public class Client {

    public static void main(String[] args) {
        Shape s1 = new Circle();
        s1.draw();

        GeometricShape geometricShape = new Rhombus(2, 3);
        geometricShape.drawShape();

        Shape s2 = new GeometricShapeObjectAdapter(new Triangle(6,8,3));
        s2.draw();

        // Using 2nd approach
        Shape s3 = new TriangleAdapter(4, 8, 6);
        s3.draw();
    }
}
