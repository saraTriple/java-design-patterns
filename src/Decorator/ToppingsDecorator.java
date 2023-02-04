package src.Decorator;

public abstract class ToppingsDecorator extends Pizza{

    public abstract String getDescription();

    public ToppingsDecorator(String description) {
        super(description);
    }


}
