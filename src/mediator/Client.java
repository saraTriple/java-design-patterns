package src.mediator;

public class Client {
    public static void main(String[] args) {
        ChatMediator chatMediator = new ChatMediatorConcrete();

        User user1 = new UserConcrete(chatMediator, "Jack");
        User user2 = new UserConcrete(chatMediator, "John");
        User user3 = new UserConcrete(chatMediator, "Sara");

        chatMediator.addUser(user1);
        chatMediator.addUser(user2);
        chatMediator.addUser(user3);

        System.out.println("First: ");
        user1.send("Hello World!");

        System.out.println("\nSecond: ");
        user2.send("Hello Jack");

        System.out.println("\nThird: ");
        user3.send("Hi, Jack. How are you ?");
    }
}
