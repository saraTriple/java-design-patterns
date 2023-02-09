package src.Prototype2;

public class BlueColor extends Color{
    private String colorName = "Blue";

    @Override
    public void applyColor() {
        System.out.println("Applying " + colorName + " color");
    }

    @Override
    public Color clone() {
        BlueColor newColor = new BlueColor();
        newColor.setColorName("BLUE");
        newColor.applyColor();
        return newColor;
    }
}
