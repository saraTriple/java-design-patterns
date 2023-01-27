package src.Adapter2;

public class TriangleAdapter extends Triangle implements Shape{

    public TriangleAdapter(double a, double b, double c) {
        super(a, b, c);
    }

    @Override
    public void draw() {
        this.drawShape();
    }

    @Override
    public void resize() {
        System.out.println("Triangle can not be resized");
    }

    @Override
    public String description() {
        return "Triangle Object";
    }

    @Override
    public boolean isHide() {
        return false;
    }
}
