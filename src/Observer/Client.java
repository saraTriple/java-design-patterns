package src.Observer;

public class Client {

    public static void main(String[] args) {
        Subject subject = new Subject();

        // Creating Observers
        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("Initial State: 20");
        subject.setState(20);

        System.out.println("Changing state from 20 to 30");
        subject.setState(30);

    }

}
