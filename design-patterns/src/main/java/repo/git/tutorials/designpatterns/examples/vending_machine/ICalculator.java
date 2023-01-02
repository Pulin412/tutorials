package repo.git.tutorials.designpatterns.examples.vending_machine;

public interface ICalculator {
    int calculateTotalInputAmount(CoinBundle coinBundle);

    CoinBundle calculateChange(int inputTotal, Integer inputProduct);
}
