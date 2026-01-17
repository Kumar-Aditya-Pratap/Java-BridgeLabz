/* This class demonstrates instance and class variables */
class Product {
    String productName;
    double price;
    static int totalProducts = 0;

    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; // increments total count
    }

    void displayProductDetails() {
        System.out.println(productName + " : " + price);
    }

    static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }
}
