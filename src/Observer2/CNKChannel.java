package src.Observer2;

public class CNKChannel implements Channel{
    @Override
    public void update(Object o) {
        System.out.println("CNK Channel, Breaking News: " + (String) o);
    }
}
