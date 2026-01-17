/* This class demonstrates static registration fee */
class Vehicle {
    String ownerName;
    String vehicleType;
    static double registrationFee = 5000;

    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    void displayVehicleDetails() {
        System.out.println(ownerName + " owns " + vehicleType);
    }

    static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }
}
