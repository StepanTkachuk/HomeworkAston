import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void returnBook(Book book) {
        book.setAvailable(true);
        if (!books.contains(book)) {
            books.add(book);
        }
    }

    public void borrowBook(Book book) {
        book.setAvailable(false);
        books.remove(book);
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
            if (author.equalsIgnoreCase(book.getAuthor())) {
                result.add(book);
            }
        }
        return result;
    }
}
