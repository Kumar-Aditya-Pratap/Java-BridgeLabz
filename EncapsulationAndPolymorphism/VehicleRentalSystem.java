/*
 * This class represents a Vehicle Rental System.
 * It uses abstraction, interface, encapsulation, and polymorphism.
 */

abstract class Vehicle {

    // Encapsulated vehicle details
    private String vehicleNumber;
    protected double rentalRate;

    public Vehicle(String number, double rate) {
        vehicleNumber = number;
        rentalRate = rate;
    }

    abstract double calculateRentalCost(int days);
}

// Insurance interface
interface Insurable {
    double calculateInsurance();
}

class Car extends Vehicle implements Insurable {

    public Car(String number, double rate) {
        super(number, rate);
    }

    double calculateRentalCost(int days) {
        return rentalRate * days;
    }

    public double calculateInsurance() {
        return 500;
    }
}

public class VehicleRentalSystem {

    public static void main(String[] args) {

        // Polymorphic vehicle reference
        Vehicle v = new Car("TN01AB1234", 2000);

        System.out.println("Rental Cost: " + v.calculateRentalCost(3));
        System.out.println("Insurance: " + ((Insurable) v).calculateInsurance());
    }
}
