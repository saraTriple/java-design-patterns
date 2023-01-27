package src.Adapter2;

public class GeometricShapeObjectAdapter implements Shape{
    public GeometricShape adpatee;

    public GeometricShapeObjectAdapter(GeometricShape adapatee) {
        this.adpatee = adapatee;
    }

    @Override
    public void draw() {
        adpatee.drawShape();
    }

    @Override
    public void resize() {
        System.out.println(description() + " can't be resized now");
    }

    @Override
    public String description() {
        if (adpatee instanceof Triangle) {
            return "Triangle Object";
        } else if (adpatee instanceof Rhombus) {
            return "Rhombus Object";
        } else {
            return "Unknown Object";
        }
    }

    @Override
    public boolean isHide() {
        return false;
    }
}
