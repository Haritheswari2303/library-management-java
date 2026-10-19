import java.util.ArrayList;
import java.util.List;

public class LibraryService {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        if (book == null) {
            throw new IllegalArgumentException("Book cannot be null");
        }
        books.add(book);
    }

    public List<Book> getAllBooks() {
        return books;
    }

    public Book findById(int id) {
        for (Book b : books) {
            if (b.getId() == id) {
                return b;
            }
        }
        return null;
    }

    public boolean issueBook(int id) {
        Book book = findById(id);
        if (book == null) {
            return false;
        }
        if (book.isAvailable()) {
            book.setAvailable(false);
            return true;
        }
        return false;
    }

    public boolean returnBook(int id) {
        Book book = findById(id);
        if (book == null) {
            return false;
        }
        book.setAvailable(true);
        return true;
    }
}
