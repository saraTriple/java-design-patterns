package src.Prototype;

public class Point extends Shape {

    public Point(int x, int y) {
        super(x, y);
    }

    // Cloning the object
    @Override
    public Shape clone() {
        return new Point(this.x, this.y);
    }
}
