import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Library {
    public static List<Book> books = new ArrayList<>();

    static {
        books.add(new Book("Война и мир. Том 1", "Толстой", 1863, true));
        books.add(new Book("Война и мир. Том 2", "Толстой", 1865, false));
        books.add(new Book("Война и мир. Том 3", "Толстой", 1869, true));
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void printAvailableBooks() {
        for (Book book : books) {
            if (book.isAvailable()) {
                book.displayInfo();
            }
        }
    }

    public List<Book> findBooksByAuthor(String author) {
        if (author == null || author.isBlank()) {
            return Collections.emptyList();
        }
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (author.equals(book.getAuthor())) {
                result.add(book);
            }
        }
        return result;
    }
}
