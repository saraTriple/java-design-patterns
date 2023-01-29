package src.Bridge;

// Abstraction
public abstract class Shape {
    Color color; // Here For Color We use Composition instead of inheritance

    public Shape(Color color) {
        this.color = color;
    }

    public abstract void applyColorToShape();

    public String toString() {
        return "The shape is with color " + color;
    }
}
