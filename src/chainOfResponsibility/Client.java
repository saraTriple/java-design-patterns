package src.chainOfResponsibility;

public class Client {

    public static void main(String[] args) {
        // Define all chains
        Chain add = new AddNumbers();
        Chain sub = new SubtractNumbers();
        Chain mul = new MultiplyNumbers();
        Chain div = new DivideNumbers();

        // Setting next chains
        add.setNextChain(sub);
        sub.setNextChain(mul);
        mul.setNextChain(div);

        // Testing equation
        Numbers equation1 = new Numbers(5, 6, "mul");

        // starting from first chain
        add.calculate(equation1);
    }
}
