/*
 This class represents a Shopping Cart item.
 It calculates and displays total cost.
*/
class CartItem {

    private String itemName; // item name
    private double price; // item price
    private int quantity; // quantity selected

    void addItem(String name, double price, int quantity) { // adds item to cart
        this.itemName = name;
        this.price = price;
        this.quantity = quantity;
    }

    void displayTotal() { // calculates total cost
        System.out.println("Total Cost: " + (price * quantity));
    }

    public static void main(String[] args) {
        CartItem cart = new CartItem(); // creating cart object
        cart.addItem("Shoes", 2000, 2); // adding item
        cart.displayTotal(); // displaying total cost
    }
}
