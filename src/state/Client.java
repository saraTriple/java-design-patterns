package src.state;

import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        PullingFan fan = new PullingFan();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Press Enter");
            String k = scanner.nextLine();

            if (k.isEmpty()) {
                fan.push();
            }

        }
    }
}
