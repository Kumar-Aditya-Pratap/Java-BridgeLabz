
/* This class represents a Library that aggregates multiple Book objects */
import java.util.ArrayList;

class Library {
    ArrayList<Book> books = new ArrayList<>();

    void addBook(Book book) {
        books.add(book); // adds book to library
    }

    void showBooks() {
        for (Book b : books) {
            System.out.println(b.title + " by " + b.author);
        }
    }
}
