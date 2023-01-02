package repo.git.tutorials.designpatterns.examples.vending_machine;

public enum Coins {
    FIVE_CENTS(5),
    TEN_CENTS(10),
    TWENTY_CENTS(20),
    FIFTY_CENTS(50),
    HUNDRED_CENTS(100);

    private final int value;

    Coins(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
