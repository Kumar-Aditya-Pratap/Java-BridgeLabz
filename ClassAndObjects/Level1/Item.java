/*
 This class represents an inventory Item.
 It calculates the total cost based on quantity.
*/
class Item {

    private int itemCode; // item code
    private String itemName; // item name
    private double price; // item price

    Item(int itemCode, String itemName, double price) { // constructor
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    void calculateTotal(int quantity) { // calculates total cost
        System.out.println("Total Cost: " + (price * quantity));
    }

    public static void main(String[] args) {
        Item item = new Item(101, "Pen", 10); // creating item object
        item.calculateTotal(5); // calculating total cost
    }
}
