/*
 * This class represents a simplified E-Commerce Platform.
 * It demonstrates abstraction, interface, encapsulation, and polymorphism.
 */

abstract class Product {

    // Encapsulated product details
    private int productId;
    private String name;
    protected double price;

    public Product(int id, String name, double price) {
        this.productId = id;
        this.name = name;
        this.price = price;
    }

    // Abstract discount calculation
    abstract double calculateDiscount();

    public double getPrice() {
        return price;
    }
}

// Interface for tax calculation
interface Taxable {
    double calculateTax();
}

class Electronics extends Product implements Taxable {

    public Electronics(int id, String name, double price) {
        super(id, name, price);
    }

    double calculateDiscount() {
        return price * 0.10;
    }

    public double calculateTax() {
        return price * 0.18;
    }
}

public class ECommercePlatform {

    public static void main(String[] args) {

        // Polymorphic product reference
        Product product = new Electronics(101, "Laptop", 60000);

        // Calculating final price
        double finalPrice = product.getPrice()
                + ((Taxable) product).calculateTax()
                - product.calculateDiscount();

        System.out.println("Final Price: " + finalPrice);
    }
}
