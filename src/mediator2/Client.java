package src.mediator2;

public class Client {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        Fan fan = new Fan();
        PowerSupplier powerSupplier = new PowerSupplier();
        Button button = new Button(mediator);

        mediator.setButton(button);
        mediator.setFan(fan);
        mediator.setPowerSupplier(powerSupplier);



        button.press();
        button.press();
        button.press();
        assert fan.isOn();

    }
}
