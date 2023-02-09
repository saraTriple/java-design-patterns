package src.Prototype;

public abstract class Shape {
    int x;
    int y;

    int tx;
    int ty;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
        this.tx = 3 + x;
        this.ty = 1 + y;
    }

    public int getTx() {
        return tx;
    }

    public int getTy() {
        return ty;
    }

    public abstract Shape clone();
}
