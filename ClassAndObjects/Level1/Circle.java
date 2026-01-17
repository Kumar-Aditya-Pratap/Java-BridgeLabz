/*
 This class represents a Circle.
 It calculates and displays the area and circumference of the circle.
*/
class Circle {

    private double radius; // radius of the circle

    Circle(double radius) { // constructor
        this.radius = radius;
    }

    void calculate() { // calculates area and circumference
        System.out.println("Area: " + (Math.PI * radius * radius));
        System.out.println("Circumference: " + (2 * Math.PI * radius));
    }

    public static void main(String[] args) {
        Circle c = new Circle(5); // creating circle object
        c.calculate(); // performing calculations
    }
}
