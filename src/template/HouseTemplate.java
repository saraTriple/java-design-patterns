package src.template;

public abstract class HouseTemplate {

    // Template Method
    // final, so subclasses can't override
    public final void buildHouse() {
        buildFoundation();
        buildPillars();
        buildWalls();
        buildWindows();

        System.out.println("Congradulations. House is built and it's beautiful :)");
    }

    // Common Steps between all the houses
    private void buildWindows() {
        System.out.println("Building Glass Windows");
    }

    private void buildFoundation() {
        System.out.println("Building Foundation (Cement, Iron Rods, sand)");
    }

    // Different Steps among the houses
    public abstract void buildWalls();
    public abstract void buildPillars();


}
