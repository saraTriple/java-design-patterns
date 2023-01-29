package src.Bridge;

public abstract class Shape {
    String color;
    String shapeName;

    public Shape(String color, String shapeName) {
        this.color = color;
        this.shapeName = shapeName;
    }

    public String toString() {
        return "The shape is: " + shapeName +  " with color " + color;
    }
}
