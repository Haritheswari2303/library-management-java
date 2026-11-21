# Library Management System (Java)

A simple console-based Library Management System written in core Java. It demonstrates object-oriented design with a clear separation between the data model, business logic and the application entry point.

## Features

- Add books to the library catalogue
- View all books with their current status (`Available` / `Issued`)
- Search for a book by its ID
- Issue a book (blocked if it is already issued)
- Return a book

## Tech Stack

- **Language:** Java (JDK 8 or higher)
- **Concepts:** OOP, encapsulation, collections (`ArrayList`), `toString()` overriding

## Project Structure

```
library-management-java/
├── src/
│   ├── Book.java            # Model: id, title, author, availability
│   ├── LibraryService.java  # Business logic: add, find, issue, return
│   └── Main.java            # Entry point / demo run
└── README.md
```

| Class | Responsibility |
|-------|----------------|
| `Book` | Represents a book and its availability status |
| `LibraryService` | Stores books in memory and handles add / find / issue / return operations |
| `Main` | Creates sample books and demonstrates the issue and return flow |

## How to Run

```bash
# Clone the repository
git clone https://github.com/Haritheswari2303/library-management-java.git
cd library-management-java/src

# Compile
javac *.java

# Run
java Main
```

## Sample Output

```
All books:
1 | Clean Code by Robert Martin [Available]
2 | Effective Java by Joshua Bloch [Available]
3 | Head First Java by Kathy Sierra [Available]
Issuing book 1: true
Issuing book 1 again: false
After return:
1 | Clean Code by Robert Martin [Available]
2 | Effective Java by Joshua Bloch [Available]
3 | Head First Java by Kathy Sierra [Available]
```

## Future Improvements

- [ ] Handle invalid book IDs gracefully (currently `issueBook` / `returnBook` assume the book exists)
- [ ] Interactive menu using `Scanner`
- [ ] Member management and issue/return history with due dates
- [ ] Persistent storage using JDBC + MySQL
- [ ] Unit tests with JUnit
- [ ] Build with Maven

## Author

**Haritheswari** — [GitHub](https://github.com/Haritheswari2303)
