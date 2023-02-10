package src.chainOfResponsibility2;

public class Dollar50 implements MoneyDistributor{
    private MoneyDistributor nextChain;

    @Override
    public void setNextChain(MoneyDistributor nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void distribute(Currency currency) {
        if (currency.getAmount() < 50) {
            this.nextChain.distribute(currency);
            return;
        }

        int num = currency.getAmount() / 50;
        int remainder = currency.getAmount() % 50;
        System.out.println("Distributing " + num + " 50$ note");
        if (remainder != 0) {
            this.nextChain.distribute(new Currency(remainder));
        }

    }
}
