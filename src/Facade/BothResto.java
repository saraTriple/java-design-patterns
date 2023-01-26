package src.Facade;

public class BothResto {

    public Menus getMenus() {
        BothVegNon bothVegNon = new BothVegNon();
        return bothVegNon;
    }
}
