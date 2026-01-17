/*
 * This class represents an Online Food Delivery System.
 * It uses abstraction, interface, encapsulation, and polymorphism.
 */

abstract class FoodItem {

    protected double price;
    protected int quantity;

    public FoodItem(double price, int quantity) {
        this.price = price;
        this.quantity = quantity;
    }

    abstract double calculateTotalPrice();
}

interface Discountable {
    double applyDiscount();
}

class VegItem extends FoodItem implements Discountable {

    public VegItem(double price, int quantity) {
        super(price, quantity);
    }

    double calculateTotalPrice() {
        return price * quantity;
    }

    public double applyDiscount() {
        return 50;
    }
}

public class OnlineFoodDeliverySystem {

    public static void main(String[] args) {

        FoodItem food = new VegItem(200, 2);

        double total = food.calculateTotalPrice() - ((Discountable) food).applyDiscount();
        System.out.println("Total Price: " + total);
    }
}
