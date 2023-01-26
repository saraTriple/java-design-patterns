package src.Facade;

public class VegResto implements  Hotel{

    @Override
    public Menus getMenus() {
        VegMenu v = new VegMenu();
        return v;
    }
}
