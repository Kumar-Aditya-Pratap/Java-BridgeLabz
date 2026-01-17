/* This class demonstrates constructor chaining */
class Circle {
    double radius;

    // Default constructor
    Circle() {
        this(1.0); // calls parameterized constructor
    }

    // Parameterized constructor
    Circle(double radius) {
        this.radius = radius; // sets radius
    }
}
