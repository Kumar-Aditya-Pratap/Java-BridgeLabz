/*
 * This class represents a Hospital Patient Management System.
 * It demonstrates abstraction, interface, encapsulation, and polymorphism.
 */

abstract class Patient {

    private int patientId;
    private String name;

    public Patient(int id, String name) {
        patientId = id;
        this.name = name;
    }

    abstract double calculateBill();
}

interface MedicalRecord {
    void addRecord();
}

class InPatient extends Patient implements MedicalRecord {

    public InPatient(int id, String name) {
        super(id, name);
    }

    double calculateBill() {
        return 15000;
    }

    public void addRecord() {
        System.out.println("Medical record added");
    }
}

public class HospitalPatientManagement {

    public static void main(String[] args) {

        Patient patient = new InPatient(101, "Ravi");

        System.out.println("Bill Amount: " + patient.calculateBill());
        ((MedicalRecord) patient).addRecord();
    }
}
