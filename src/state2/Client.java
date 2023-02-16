package src.state2;

public class Client {
    public static void main(String[] args) {
        AlertStateContext stateContext = new AlertStateContext();
        stateContext.alert();

        System.out.println("Changing State:");
        stateContext.setCurrentState(new Silent());
        stateContext.alert();
    }
}
