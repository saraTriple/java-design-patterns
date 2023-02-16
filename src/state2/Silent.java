package src.state2;

public class Silent implements MobileState{
    @Override
    public void alert(AlertStateContext context) {
        System.out.println("Silent Mode");
    }
}
