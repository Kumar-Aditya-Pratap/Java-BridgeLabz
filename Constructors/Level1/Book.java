/* This class demonstrates default and parameterized constructors for a Book */
class Book {
    String title;
    String author;
    double price;

    // Default constructor
    Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    // Parameterized constructor
    Book(String title, String author, double price) {
        this.title = title; // assigns book title
        this.author = author; // assigns author name
        this.price = price; // assigns price
    }
}
