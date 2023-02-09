package src.Prototype2;

public abstract class Color {
    private String colorName;

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    abstract void applyColor();


    public abstract Color clone();

    @Override
    public String toString() {
        return "Color Class {" +
                "colorName='" + colorName + '\'' +
                '}';
    }
}
