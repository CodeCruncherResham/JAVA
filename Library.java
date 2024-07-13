// Write a Java program to create a class called "Library" with a collection of books and methods to add and remove books
import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}

class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle() + " by " + book.getAuthor());
    }

    public void removeBook(Book book) {
        if (books.remove(book)) {
            System.out.println("Book removed: " + book.getTitle() + " by " + book.getAuthor());
        } else {
            System.out.println("Book not found: " + book.getTitle() + " by " + book.getAuthor());
        }
    }

    public void displayBooks() {
        System.out.println("Library Books:");
        for (Book book : books) {
            System.out.println(book.getTitle() + " by " + book.getAuthor());
        }
    }

    public static void main(String[] args) {
        Library library = new Library();

        // Adding books
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee");
        Book book2 = new Book("1984", "George Orwell");
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Displaying books
        library.displayBooks();

        // Removing a book
        library.removeBook(book2);

        // Displaying books after removal
        library.displayBooks();
    }
}
