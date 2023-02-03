package src.Builder;

public abstract class SandwichBuilder {
    Sandwich sandwich;

    public void createSandwich() {
        sandwich = new Sandwich();
        buildMeat();
        buildSauce();
        buildDelivery();
        System.out.println("Sandwich created. Meat: "
                + sandwich.getMeat()
                + ";Sauce: " + sandwich.getSauce()
                + ";Delivery: " + sandwich.getDelivery() + " :)");
    }

    public abstract void buildMeat();
    public abstract void buildSauce();

    public abstract void buildDelivery();
}
