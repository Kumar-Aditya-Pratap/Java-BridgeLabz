/*
 This class represents a Student.
 It calculates grade and displays student details.
*/
class Student {

    private String name;       // student name
    private int rollNumber;    // roll number
    private int marks;         // marks obtained

    Student(String name, int rollNumber, int marks) { // constructor
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    char calculateGrade() { // determines grade based on marks
        if (marks >= 75) return 'A';
        else if (marks >= 60) return 'B';
        else return 'C';
    }

    void display() { // displays student details
        System.out.println(name + " | Grade: " + calculateGrade());
    }

    public static void main(String[] args) {
        Student s = new Student("Amit", 1, 78); // creating student object
        s.display(); // displaying result
    }
}
