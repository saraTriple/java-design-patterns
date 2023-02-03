package src.Observer2;

public class NewsChannel implements Channel {

    public String news;

    @Override
    public void update(Object o) {
        System.out.println("News Channel, Breaking news: " + (String) o);
    }
}
