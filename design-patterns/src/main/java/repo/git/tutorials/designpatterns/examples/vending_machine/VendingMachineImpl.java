package repo.git.tutorials.designpatterns.examples.vending_machine;

public class VendingMachineImpl implements IVendingMachine{
    @Override
    public void displayMenu() {
        System.out.println("1. TWIX - 100");
        System.out.println("2. COKE - 50");
        System.out.println("3. WATER - 30");
        System.out.println("4. SANDWICH - 150");
    }

    @Override
    public String dispense(Integer inputProduct, CoinBundle inputCoins) {
        StringBuilder sb = new StringBuilder();
        ICalculator calculator = new CalculatorImpl();
        int inputTotal = calculator.calculateTotalInputAmount(inputCoins);
        CoinBundle change = calculator.calculateChange(inputTotal, inputProduct);
        return sb.append("change - ").append(change).toString();
    }

    @Override
    public String inputProduct(String product) {
        return product;
    }

//    @Override
//    public String inputCoins(Scanner scanner) {
//        return scanner.nextLine();
//    }
}
