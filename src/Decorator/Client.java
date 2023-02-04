package src.Decorator;

public class Client {

    public static void main(String[] args) {
        Pizza pizza = new Veggi(); // Initial Pizza
        System.out.println(pizza.getDescription() +
                            " Cost: " + pizza.getCost());

        // Decorate it with Cheese
        System.out.println("After decoration with cheese");
        pizza = new Cheese(pizza);
        System.out.println(pizza.getDescription() +
                    " Cost: " + pizza.getCost());

        System.out.println("Decorate it with Tomato");
        pizza = new Tomato(pizza);
        System.out.println(pizza.getDescription() +
                " Cost: " + pizza.getCost());

        System.out.println("Decorate it with Barbeque");
        pizza = new Barbeque(pizza);
        System.out.println(pizza.getDescription() +
                " Cost: " + pizza.getCost());

        System.out.println("Create New Pizza: Pepperoni + Barbeque");
        Pizza pizza1 = new Pepperoni();

        pizza1 = new Barbeque(pizza1);

        System.out.println("Your pizza is ready. " + pizza1.getDescription() +
                            " Cost: " + pizza1.getCost());

    }
}
