package src.chainOfResponsibility2;

public class Dollar10 implements MoneyDistributor {
    private MoneyDistributor nextChain;

    @Override
    public void setNextChain(MoneyDistributor nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void distribute(Currency currency) {
        if (currency.getAmount() < 10) {
            System.out.println("No bills less than 10 dollars!");
        }

        int num = currency.getAmount() / 10;
        int remainder = currency.getAmount() % 10;
        System.out.println("Distributing " + num + " 10$ note");
        if (remainder != 0) {
            this.nextChain.distribute(new Currency(remainder));
        }
    }
}
