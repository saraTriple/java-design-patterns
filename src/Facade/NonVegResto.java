package src.Facade;

public class NonVegResto implements Hotel{

    @Override
    public Menus getMenus() {
        NonVegMenu nv = new NonVegMenu();
        return nv;
    }
}
