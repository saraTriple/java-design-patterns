package src.Builder;

public class Sandwich {

    Meat meat;
    Sauce sauce;

    Delivery delivery;

    public void setMeat(Meat meat) {
        this.meat = meat;
    }

    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }

    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }

    public Meat getMeat() {
        return meat;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public Delivery getDelivery() {
        return delivery;
    }
}
