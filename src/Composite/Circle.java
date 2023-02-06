package src.Composite;

public class Circle implements Shape{

    String initialColor;
    String name;

    public Circle(String name, String initialColor) {
        this.name = name;
        this.initialColor = initialColor;
    }


    @Override
    public void draw(String fillColor) {
        System.out.println("Drawing " + this.name +   " from color "
                + fillColor + " to color: " + fillColor);
    }
}
