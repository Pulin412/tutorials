package repo.git.tutorials.designpatterns.examples.vending_machine;

public class Main {

    public static void main(String[] args){
        IVendingMachine vendingMachine = new VendingMachineImpl();

        vendingMachine.displayMenu();
        String inputProduct = vendingMachine.inputProduct("4");
        CoinBundle inputCoins = CoinBundle.builder()
                .number5CentsCoins(0)
                .number10CentsCoins(0)
                .number20CentsCoins(0)
                .number50CentsCoins(0)
                .number100CentsCoins(5)
                .build();

        System.out.println(vendingMachine.dispense(Integer.valueOf(inputProduct), inputCoins));
    }
}
