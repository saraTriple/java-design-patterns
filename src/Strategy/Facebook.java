package src.Strategy;

public class Facebook implements SocialStrategy{
    @Override
    public void connectTo(String friendName) {
        System.out.println("Connecting to " + friendName + " through Facebook");
    }
}
