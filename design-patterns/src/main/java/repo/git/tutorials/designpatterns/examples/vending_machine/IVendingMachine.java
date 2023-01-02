package repo.git.tutorials.designpatterns.examples.vending_machine;

public interface IVendingMachine {
    void displayMenu();
    String dispense(Integer inputProduct, CoinBundle inputCoins);

    String inputProduct(String product);

//    String inputCoins(Scanner scanner);
}
