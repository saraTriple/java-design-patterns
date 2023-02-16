package src.Interpretor;

public class Client {

    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        System.out.println("Jack is Male? " + isMale.interpret("Jack"));
        System.out.println("Is Sara married? " + isMarriedWoman.interpret("Married sara"));
    }

    public static Expression getMaleExpression() {
        // Rule: Jack & John are male
        Expression jack = new TerminalExpression("Jack");
        Expression john = new TerminalExpression("John");
        return new OrExpression(jack, john);
    }

    public static Expression getMarriedWomanExpression() {
        Expression sara = new TerminalExpression("Sara");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(sara, married);
    }
}
