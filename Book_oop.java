// . Write a Java program to create a class called "Book" with attributes for title, author, and ISBN, and methods to add and remove books from a collection.
import java.util.ArrayList;
import java.util.List;

public class Book_oop {
    private String title;
    private String author;
    private String ISBN;
    private static List<Book_oop> bookCollection = new ArrayList<>();

    // Constructor
    public Book_oop(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    // Method to add a book to the collection
    public static void addBook(Book_oop book) {
        bookCollection.add(book);
        System.out.println("Book added to the collection: " + book.getTitle());
    }

    // Method to remove a book from the collection
    public static void removeBook(Book_oop book) {
        if (bookCollection.contains(book)) {
            bookCollection.remove(book);
            System.out.println("Book removed from the collection: " + book.getTitle());
        } else {
            System.out.println("Book not found in the collection");
        }
    }

    // Getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public static void main(String[] args) {
        // Create some Book objects
        Book_oop book1 = new Book_oop("Java Programming", "John Doe", "1234567890");
        Book_oop book2 = new Book_oop("Data Structures and Algorithms", "Jane Smith", "0987654321");

        // Add books to the collection
        addBook(book1);
        addBook(book2);

        // Remove a book from the collection
        removeBook(book1);
    }
}
