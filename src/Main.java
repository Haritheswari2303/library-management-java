public class Main {
    public static void main(String[] args) {
        LibraryService library = new LibraryService();
        loadSampleBooks(library);

        System.out.println("All books:");
        printBooks(library);

        System.out.println("Issuing book 1: " + library.issueBook(1));
        System.out.println("Issuing book 1 again: " + library.issueBook(1));

        library.returnBook(1);
        System.out.println("After return:");
        printBooks(library);
    }

    private static void loadSampleBooks(LibraryService library) {
        library.addBook(new Book(1, "Clean Code", "Robert Martin"));
        library.addBook(new Book(2, "Effective Java", "Joshua Bloch"));
        library.addBook(new Book(3, "Head First Java", "Kathy Sierra"));
    }

    private static void printBooks(LibraryService library) {
        for (Book b : library.getAllBooks()) {
            System.out.println(b);
        }
    }
}
