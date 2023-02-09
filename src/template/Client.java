package src.template;

public class Client {
    public static void main(String[] args) {
        HouseTemplate woodenHouse = new WoodenHouse();
        HouseTemplate glassHouse = new GlassHouse();

        System.out.println("1- Building Wooden House:");
        woodenHouse.buildHouse();
        System.out.println("2- Building Glass House:");
        glassHouse.buildHouse();


    }
}
