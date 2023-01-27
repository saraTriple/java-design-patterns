package src.Adapter2;

public class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("Drawing rectangle");
    }

    @Override
    public void resize() {
        System.out.println("Resizing rectangle");
    }

    @Override
    public String description() {
        return "Rectangle description";
    }

    @Override
    public boolean isHide() {
        return false;
    }
}
