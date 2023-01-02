package repo.git.tutorials.designpatterns.examples.vending_machine;

public enum Product {
    TWIX(1,100),
    COKE(2,50),
    WATER(3,30),
    SANDWICH(4,150),
    EMPTY(0,0);

    private final int selectionNumber;
    private final int price;

    Product(int selectionNumber, int price){
        this.selectionNumber = selectionNumber;
        this.price = price;
    }

    public int getSelectionNumber(){
        return selectionNumber;
    }

    public int getPrice(){
        return this.price;
    }
}
