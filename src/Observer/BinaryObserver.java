package src.Observer;

public class BinaryObserver extends Observery{

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.subscribeToList(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String: " +  Integer.toBinaryString(subject.getState()));
    }

}
