package src.Prototype2;

public class Client {
    public static void main(String[] args) {
        ColorStore colorStore = new ColorStore();
        colorStore.duplicate(new RedColor());
        colorStore.duplicate(new BlueColor());

        System.out.println(colorStore.colorMap);
    }
}
