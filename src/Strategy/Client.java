package src.Strategy;

public class Client {

    public static void main(String[] args) {
        SocialMediaContext socialMediaContext = new SocialMediaContext();
        socialMediaContext.setSocialStrategy(new Twitter());
        socialMediaContext.connect("Jimmy");
    }
}
