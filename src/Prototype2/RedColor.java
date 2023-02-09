package src.Prototype2;

public class RedColor extends Color {
    private String colorName = "Red";

    @Override
    public void applyColor() {
        System.out.println("Applying " + colorName + " color");
    }

    @Override
    public Color clone() {
        RedColor newColor = new RedColor();
        newColor.setColorName("RED");
        newColor.applyColor();
        return newColor;
    }
}
