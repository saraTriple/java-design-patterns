package src.mediator;
public class UserConcrete extends User{

    public UserConcrete(ChatMediator mediator, String name) {
        super(mediator, name);
    }
    @Override
    public void send(String msg) {
        System.out.println(this.name + " is sending Message " + msg);
        mediator.sendMessage(msg, this);
    }

    @Override
    public void receive(String msg) {
        System.out.println(this.name + " receiving message " + msg);
    }
}
