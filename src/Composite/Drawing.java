package src.Composite;

import java.util.ArrayList;
import java.util.List;

public class Drawing implements Shape{

    // Collection of shapes
    private List<Shape> shapeList = new ArrayList<>();

    // Adding Shape to Drawing
    public void add(Shape shape) {
        this.shapeList.add(shape);
    }

    public void remove(Shape shape) {
        this.shapeList.remove(shape);
    }

    public void clear() {
        this.shapeList.clear();
        System.out.println("All shapes removed from Drawing!");
    }



    @Override
    public void draw(String fillColor) {
        for (Shape shape: shapeList) {
            shape.draw(fillColor);
        }
    }
}
