package src.Composite;

public class Triangle implements Shape{
    String initialColor;
    String name;

    public Triangle(String name, String initialColor) {
        this.name = name;
        this.initialColor = initialColor;
    }
    @Override
    public void draw(String fillColor) {
        System.out.println("Drawing " + this.name +   " from color "
                + fillColor + " to color: " + fillColor);
    }
}
