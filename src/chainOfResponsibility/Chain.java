package src.chainOfResponsibility;

public interface Chain {
    void setNextChain(Chain nextChain);
    void calculate(Numbers request);
}
