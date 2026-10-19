public class Main {
    public static void main(String[] args) {
        LibraryService library = new LibraryService();

        library.addBook(new Book(1, "Clean Code", "Robert Martin"));
        library.addBook(new Book(2, "Effective Java", "Joshua Bloch"));
        library.addBook(new Book(3, "Head First Java", "Kathy Sierra"));

        System.out.println("All books:");
        for (Book b : library.getAllBooks()) {
            System.out.println(b);
        }

        System.out.println("Issuing book 1: " + library.issueBook(1));
        System.out.println("Issuing book 1 again: " + library.issueBook(1));

        library.returnBook(1);
        System.out.println("After return:");
        for (Book b : library.getAllBooks()) {
            System.out.println(b);
        }
    }
}
