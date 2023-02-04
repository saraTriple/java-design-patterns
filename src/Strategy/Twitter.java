package src.Strategy;

public class Twitter implements SocialStrategy{
    @Override
    public void connectTo(String friendName) {
        System.out.println("Connecting to " + friendName + " through Twitter");
    }
}
