package src.mediator2;

public class Fan {

    private Mediator mediator;
    private boolean isOn = false;

    public Fan(Mediator mediator, boolean isOn) {
        this.mediator = mediator;
        this.isOn = isOn;
    }

    public Fan() {

    }


    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public boolean isOn() {
        return isOn;
    }

    public void turnOn() {
        mediator.start();
        isOn = true;
        System.out.println("Fan On");
    }

    public void turnOff() {
        mediator.stop();
        isOn = false;
        System.out.println("Fan OFF");
    }
}
