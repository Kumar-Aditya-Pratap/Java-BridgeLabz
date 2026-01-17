/*
 * This class demonstrates an Employee Management System.
 * It uses abstraction, inheritance, encapsulation, interface, and polymorphism.
 */

abstract class Employee {

    // Encapsulated employee details
    private int employeeId;
    private String name;
    protected double baseSalary;

    // Constructor to initialize employee details
    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Getter methods
    public int getEmployeeId() { return employeeId; }
    public String getName() { return name; }

    // Abstract salary calculation
    abstract double calculateSalary();

    // Concrete method to display details
    public void displayDetails() {
        System.out.println(employeeId + " - " + name + " Salary: " + calculateSalary());
    }
}

// Interface for department handling
interface Department {
    void assignDepartment(String dept);
    String getDepartmentDetails();
}

// Full-time employee implementation
class FullTimeEmployee extends Employee implements Department {

    private String department;

    public FullTimeEmployee(int id, String name, double salary) {
        super(id, name, salary);
    }

    public double calculateSalary() {
        return baseSalary;
    }

    public void assignDepartment(String dept) {
        department = dept;
    }

    public String getDepartmentDetails() {
        return department;
    }
}

// Part-time employee implementation
class PartTimeEmployee extends Employee {

    private int hoursWorked;

    public PartTimeEmployee(int id, String name, double rate, int hours) {
        super(id, name, rate);
        hoursWorked = hours;
    }

    public double calculateSalary() {
        return baseSalary * hoursWorked;
    }
}

public class EmployeeManagementSystem {

    public static void main(String[] args) {

        // Polymorphic employee references
        Employee e1 = new FullTimeEmployee(1, "Aditya", 50000);
        Employee e2 = new PartTimeEmployee(2, "Rahul", 500, 40);

        // Displaying employee details
        e1.displayDetails();
        e2.displayDetails();
    }
}
