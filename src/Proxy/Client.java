package src.Proxy;

public class Client {

    public static void main(String[] args) {
        Image i = new ProxyImage("MyPic.png");
        i.display();
        i.display();
        i.display();
    }

}
