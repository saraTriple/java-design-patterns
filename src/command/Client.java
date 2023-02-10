package src.command;

public class Client {
    public static void main(String[] args) {
        TextFileOpsInvoker opsInvoker = new TextFileOpsInvoker();
        TextFile textFile = new TextFile("file.txt");


        // Opening Operation
        System.out.println(opsInvoker.executeOperation(new OpenTextFileOps(textFile)));

        // Saving Operation
        System.out.println(opsInvoker.executeOperation(new SaveTextFileOps(textFile)));
    }
}
