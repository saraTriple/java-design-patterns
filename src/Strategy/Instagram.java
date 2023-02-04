package src.Strategy;

public class Instagram implements SocialStrategy{
    @Override
    public void connectTo(String friendName) {
        System.out.println("Connecting to " + friendName + " through Instagram");
    }
}
