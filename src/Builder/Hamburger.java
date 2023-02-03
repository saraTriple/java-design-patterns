package src.Builder;

public class Hamburger extends SandwichBuilder{
    @Override
    public void buildMeat() {
        sandwich.setMeat(new Beef());
    }

    @Override
    public void buildSauce() {
        sandwich.setSauce(new Barbeque());
    }

    @Override
    public void buildDelivery() {
        sandwich.setDelivery(new OnTable());
    }


}
