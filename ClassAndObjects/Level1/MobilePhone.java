/*
 This class represents a Mobile Phone.
 It stores phone details and displays them.
*/
class MobilePhone {

    private String brand; // phone brand
    private String model; // phone model
    private double price; // phone price

    MobilePhone(String brand, String model, double price) { // constructor
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void displayDetails() { // displays phone details
        System.out.println(brand + " " + model + " - Rs." + price);
    }

    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone("Samsung", "S23", 70000); // creating object
        phone.displayDetails(); // displaying details
    }
}
