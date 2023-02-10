package src.chainOfResponsibility;

public class DivideNumbers implements Chain{
    private Chain nextChain;

    @Override
    public void setNextChain(Chain nextChain) {
        this.nextChain = nextChain;
        System.out.println("Passing to next chain :)");
    }

    @Override
    public void calculate(Numbers request) {
        if (request.getOperationName().equals("div")) {
            System.out.println(request.getNum1() + " / " + request.getNum2()
                + " = " + (request.getNum1() / request.getNum2()));
        } else {
            System.out.println("No Next Operation! :)");
        }
    }
}
