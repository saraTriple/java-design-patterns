package src.state;

import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        PluginFan fanButton = new PluginFan();

        while (true) {
            System.out.println("Press Enter");
            Scanner scanner = new Scanner(System.in);
            String k = scanner.nextLine();

            if (k.isEmpty()) {
                fanButton.push();
            }
        }
    }
}
