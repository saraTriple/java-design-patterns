package src.chainOfResponsibility2;

import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        MoneyDistributor chain1 = new Dollar50();
        MoneyDistributor chain2 = new Dollar20();
        MoneyDistributor chain3 = new Dollar10();

        // set the chain of responsibility
        chain1.setNextChain(chain2);
        chain2.setNextChain(chain3);

        Scanner scanner = new Scanner(System.in);
        int amount = -1;
        while (!isExit(amount = printAmountMessage(scanner))) {

            if (amount % 10 != 0) {
                System.out.println("Please enter amount that is multiple of 10");
                continue;
            }

            // Processing the withdrawal
            chain1.distribute(new Currency(amount));
        }

        System.out.println("Vielen Guluk :)");
    }

    private static int printAmountMessage(Scanner scanner) {
        System.out.print("Please enter amount to withdraw(-1 for exit): ");
        return scanner.nextInt();
    }

    public static boolean isExit(int input) {
        return input == -1;
    }
}
