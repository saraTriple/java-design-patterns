package src.Proxy2;

public class Client {

    public static void main(String[] args) {
        Proxy2();
    }

    public static void Proxy2() {
        ProxyInternetAccess internetAccess = new ProxyInternetAccess(5);
        internetAccess.grantInternetAccess();

        ProxyInternetAccess internetAccess1 = new ProxyInternetAccess(3);
        internetAccess1.grantInternetAccess();
    }
}
