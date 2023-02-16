package src.memento;

public class Client {

    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("hello my friends");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("hello Jack");

        careTaker.add(originator.saveStateToMemento());

        System.out.println("Initial State: " + originator.getState());

        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("First Saved State: " + originator.getState());

    }
}
