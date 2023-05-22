package src.Facade;

public class HotelKeeper {

    public VegMenu getVegMenu() {
        VegResto v = new VegResto();
        VegMenu vegMenu = (VegMenu) v.getMenus();
        return vegMenu;
    }

    public NonVegMenu getNonVegMenu() {
        NonVegResto v = new NonVegResto();
        NonVegMenu nonVegMenu = (NonVegMenu) v.getMenus();
        return nonVegMenu;
    }

    public BothVegNon getVegNonVegMenu() {
        BothResto b = new BothResto();
        BothVegNon bothVegNon = (BothVegNon) b.getMenus();
        return bothVegNon;
    }
}
