package src.Observer2;

public class Client {

    public static void main(String[] args) {
        NewsAgency observable = new NewsAgency();
        NewsChannel observer = new NewsChannel();
        CNKChannel observerTwo = new CNKChannel();

        observable.addObserver(observer);

        observable.setNews("Global Warming");

        observable.addObserver(observerTwo);

        observable.setNews("Happy Great New Year");
    }
}
