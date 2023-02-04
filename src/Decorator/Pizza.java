package src.Decorator;

public abstract class Pizza {

    String description = "Basic Pizza";

    public Pizza(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public abstract float getCost();
}
