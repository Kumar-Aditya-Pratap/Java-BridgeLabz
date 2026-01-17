/*
 This class represents an Employee and stores basic employee details.
 It provides functionality to display employee information.
*/
class Employee {

    private String name;     // employee name
    private int id;          // employee id
    private double salary;   // employee salary

    Employee(String name, int id, double salary) { // constructor to initialize values
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayDetails() { // displays employee details
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) { // program execution starts here
        Employee emp = new Employee("Rahul", 101, 45000); // creating employee object
        emp.displayDetails(); // calling display method
    }
}
