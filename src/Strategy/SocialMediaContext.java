package src.Strategy;

public class SocialMediaContext {
    SocialStrategy socialStrategy;

    public void setSocialStrategy(SocialStrategy socialStrategy) {
        this.socialStrategy = socialStrategy;
    }

    public void connect(String name) {
        socialStrategy.connectTo(name);
    }
}
