package src.visitor;

public class Cheese implements Pizza{
    private String name;

    public Cheese() {
        this.name = "Cheese Pizza";
    }
    @Override
    public String getName() {
        return this.name;
    }
}
