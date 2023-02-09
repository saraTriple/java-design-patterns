package src.template2;

public class Client {

    public static void main(String[] args) {
        System.out.println("1- Building Standard Computer :)");
        ComputerTemplate standardComputer = new StandardComputer();
        standardComputer.buildComputer();

        System.out.println("2- Building Super Computer :)");
        ComputerTemplate superComputer = new SuperComputer();
        superComputer.buildComputer();

    }
}
