package src.Facade;

public class Client {

    public static void main(String[] args) {
        Facade();
    }

    public static void Facade() {
        HotelKeeper hotelKeeper = new HotelKeeper();

        // Requesting the veg menu
        VegMenu v = hotelKeeper.getVegMenu();
        System.out.println("Veg Menu: ");
        System.out.println(v.getMenu());

        // Requesting non veg menu
        NonVegMenu nonVegMenu = new NonVegMenu();
        System.out.println("Non Veg Menu: ");
        System.out.println(nonVegMenu.getMenu());

        // Requesting all menus
        BothVegNon bVN = new BothVegNon();
        System.out.println("Both Veg and NonVeg: ");
        System.out.println(bVN.getMenu());
    }
}
