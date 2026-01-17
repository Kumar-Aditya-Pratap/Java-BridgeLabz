/*
 * This class demonstrates a Library Management System.
 * It uses abstraction, interface, encapsulation, and polymorphism.
 */

abstract class LibraryItem {

    private int itemId;
    private String title;

    public LibraryItem(int id, String title) {
        itemId = id;
        this.title = title;
    }

    abstract int getLoanDuration();
}

interface Reservable {
    void reserveItem();
}

class Book extends LibraryItem implements Reservable {

    public Book(int id, String title) {
        super(id, title);
    }

    int getLoanDuration() {
        return 14;
    }

    public void reserveItem() {
        System.out.println("Book reserved");
    }
}

public class LibraryManagementSystem {

    public static void main(String[] args) {

        LibraryItem item = new Book(1, "Java Basics");
        System.out.println("Loan Days: " + item.getLoanDuration());
        ((Reservable) item).reserveItem();
    }
}
