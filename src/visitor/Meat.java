package src.visitor;

public class Meat implements Pizza{

    private String name;

    public Meat() {
        this.name = "Meat Pizza";
    }
    @Override
    public String getName() {
        return this.name;
    }
}
