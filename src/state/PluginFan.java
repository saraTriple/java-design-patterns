package src.state;

public class PluginFan {
    private int currentState;

    public PluginFan() {
        this.currentState = 0;
    }

    public void push() {
        if (currentState == 0) {
            currentState = 1;
            System.out.println("Low Speed");
        } else if (currentState == 1) {
            currentState = 2;
            System.out.println("Medium Speed");
        } else if (currentState == 2) {
            System.out.println("High Speed");
        } else {
            currentState = 0;
            System.out.println("Fan is OFF");
        }



    }
}
