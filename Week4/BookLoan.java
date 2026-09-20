class Book {
    private String title;
    private String author;
    private String bookCode;
    private boolean loaned;

    public Book(String title, String author, String bookCode) {
        if (title == null || title.isBlank() ||
            author == null || author.isBlank() ||
            bookCode == null || bookCode.isBlank()) {
            throw new IllegalArgumentException("Text cannot be blank");
        }

        this.title = title;
        this.author = author;
        this.bookCode = bookCode;
        loaned = false;
    }

    public boolean borrowBook() {
        if (loaned) {
            return false;
        }

        loaned = true;
        return true;
    }

    public boolean returnBook() {
        if (!loaned) {
            return false;
        }

        loaned = false;
        return true;
    }

    public boolean isAvailable() {
        return !loaned;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getBookCode() {
        return bookCode;
    }

    public String toString() {
        return bookCode + ": " + title + " by " + author +
               " - Available: " + isAvailable();
    }
}

public class BookLoan {
    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "John Smith", "B001");
        Book b2 = new Book("Python Basics", "Jane Smith", "B002");

        System.out.println(b1);
        System.out.println(b2);

        System.out.println("Borrow b1: " + b1.borrowBook());
        System.out.println("Borrow b1 again: " + b1.borrowBook());

        System.out.println("Return b1: " + b1.returnBook());
        System.out.println("Return b1 again: " + b1.returnBook());

        System.out.println(b1);
        System.out.println(b2);
    }
}