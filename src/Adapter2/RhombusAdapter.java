package src.Adapter2;

public class RhombusAdapter extends Rhombus implements Shape{

    public RhombusAdapter(double a, double b) {
        super(a, b);
    }

    @Override
    public void draw() {
        this.drawShape();
    }

    @Override
    public void resize() {
        System.out.println("Rhombus is not able to resize!");
    }

    @Override
    public String description() {
        return "Rhombus Object";
    }

    @Override
    public boolean isHide() {
        return false;
    }
}
