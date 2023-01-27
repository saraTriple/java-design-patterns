package src.Adapter;

public class Client {

    public static void main(String[] args) {
        Vehicle v1 = new Masserati();
        System.out.println(v1.toString());

        Vehicle v2 = new MasseratiAdapter();
        System.out.println(v2.toString());

    }
}
