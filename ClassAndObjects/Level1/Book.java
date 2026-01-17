/*
 This class represents a Book.
 It stores book details and displays them.
*/
class Book {

    private String title; // book title
    private String author; // book author
    private double price; // book price

    Book(String title, String author, double price) { // constructor
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display() { // displays book details
        System.out.println(title + " by " + author + " - Rs." + price);
    }

    public static void main(String[] args) {
        Book book = new Book("Java Basics", "James", 499); // creating book object
        book.display(); // displaying details
    }
}
