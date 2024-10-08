package task2;

public class LibraryBook {
    enum Genre {
        FICTION, NONFICTION, MYSTERY, FANTASY, SCIENCE
    }


    private static final int MAX_BORROW_DAYS = 14;
    private static int totalBooks = 0;


    private final String isbn;


    private String title;
    private Genre genre;
    private boolean isBorrowed;


    {
        this.isBorrowed = false;
    }


    public LibraryBook(String isbn, String title, Genre genre) {
        this.isbn = isbn;
        this.title = title;
        this.genre = genre;
        totalBooks++;
    }


    public LibraryBook(String isbn, String title) {
        this(isbn, title, Genre.FICTION);
    }


    public static int getTotalBooks() {
        return totalBooks;
    }


    public void borrowBook() {
        if (!this.isBorrowed) {
            this.isBorrowed = true;
            System.out.println(this.title + " has been borrowed.");
        } else {
            System.out.println(this.title + " is already borrowed.");
        }
    }

    public void borrowBook(int days) {
        if (!this.isBorrowed) {
            if (days <= MAX_BORROW_DAYS) {
                this.isBorrowed = true;
                System.out.println(this.title + " has been borrowed for " + days + " days.");
            } else {
                System.out.println("Cannot borrow for more than " + MAX_BORROW_DAYS + " days!");
            }
        } else {
            System.out.println(this.title + " is already borrowed.");
        }
    }


    public final String getIsbn() {
        return this.isbn;
    }


    @Override
    public String toString() {
        return "LibraryBook [ISBN=" + this.isbn + ", Title=" + this.title + ", Genre=" + this.genre + ", Borrowed=" + this.isBorrowed + "]";
    }


    static {
        System.out.println("Library system is initialized! Maximum borrow time is: " + MAX_BORROW_DAYS + " days.");
    }


    public void displayBookInfo() {
        System.out.println(this);
    }


    public void returnBook() {
        if (this.isBorrowed) {
            this.isBorrowed = false;
            System.out.println(this.title + " has been returned.");
        } else {
            System.out.println(this.title + " was not borrowed.");
        }
    }
}
