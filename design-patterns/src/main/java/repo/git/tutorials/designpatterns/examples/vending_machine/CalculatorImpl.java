package repo.git.tutorials.designpatterns.examples.vending_machine;

public class CalculatorImpl implements ICalculator{
    @Override
    public int calculateTotalInputAmount(CoinBundle inputCoins) {

        int total = 0;
        total += inputCoins.getNumber5CentsCoins() * Coins.FIVE_CENTS.getValue();
        total += inputCoins.getNumber10CentsCoins() * Coins.TEN_CENTS.getValue();
        total += inputCoins.getNumber20CentsCoins() * Coins.TWENTY_CENTS.getValue();
        total += inputCoins.getNumber50CentsCoins() * Coins.FIFTY_CENTS.getValue();
        total += inputCoins.getNumber100CentsCoins() * Coins.HUNDRED_CENTS.getValue();
        return total;
    }

    @Override
    public CoinBundle calculateChange(int inputTotal, Integer inputProduct) {

        int selectedProductPrice = getProductPriceFromProductEnum(inputProduct);
        int change = inputTotal - selectedProductPrice;

        return buildCoinBundleForChange(change);
    }

    private CoinBundle buildCoinBundleForChange(int change) {
        int remainingChange = change;

        int hundredCoins = 0;
        hundredCoins = remainingChange / Coins.HUNDRED_CENTS.getValue();
        remainingChange = remainingChange % Coins.HUNDRED_CENTS.getValue();

        int fiftyCoins = 0;
        fiftyCoins = remainingChange / Coins.FIFTY_CENTS.getValue();
        remainingChange = remainingChange % Coins.FIFTY_CENTS.getValue();

        int twentyCoins = 0;
        twentyCoins = remainingChange / Coins.TWENTY_CENTS.getValue();
        remainingChange = remainingChange % Coins.TWENTY_CENTS.getValue();

        int tenCoins = 0;
        tenCoins = remainingChange / Coins.TEN_CENTS.getValue();
        remainingChange = remainingChange % Coins.TEN_CENTS.getValue();

        int fiveCoins = 0;
        fiveCoins = remainingChange / Coins.FIVE_CENTS.getValue();

        return CoinBundle.builder()
                .number5CentsCoins(fiveCoins)
                .number10CentsCoins(tenCoins)
                .number20CentsCoins(twentyCoins)
                .number50CentsCoins(fiftyCoins)
                .number100CentsCoins(hundredCoins)
                .build();
    }

    private int getProductPriceFromProductEnum(Integer inputProduct) {
        for (Product product : Product.values()) {
            if(inputProduct == product.getSelectionNumber()){
                return product.getPrice();
            }
        }
        return 0;
    }
}
