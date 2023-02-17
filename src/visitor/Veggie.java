package src.visitor;

public class Veggie implements Pizza{
    private String name;

    public Veggie() {
        this.name = "Veggie Pizza";
    }
    @Override
    public String getName() {
        return this.name;
    }




}
