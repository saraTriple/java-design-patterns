package src.chainOfResponsibility2;

// Base Interface
public interface MoneyDistributor {
    void setNextChain(MoneyDistributor moneyDistributor);
    void distribute(Currency currency);
}
