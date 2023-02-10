package src.chainOfResponsibility2;

public class Dollar20 implements MoneyDistributor{
    private MoneyDistributor nextChain;

    @Override
    public void setNextChain(MoneyDistributor nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void distribute(Currency currency) {

        if (currency.getAmount() < 20) {
            this.nextChain.distribute(currency);
            return;
        }

        int num = currency.getAmount() / 20;
        int remainder = currency.getAmount() % 20;
        System.out.println("Distributing " + num + " 20$ note");
        if (remainder != 0) {
            this.nextChain.distribute(new Currency(remainder));
        }
    }
}
