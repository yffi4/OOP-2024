package Task1.B;

import java.util.ArrayList;

public class Book extends LibraryItem{
    private int numberOfPages;
    private boolean available;
    private String identifier;
    private ArrayList<LibraryItem> items;
    public Book(String title, String author, int publicationYear, int numberOfPages, boolean available, String identifier) {
        super(title, author, publicationYear);
        this.numberOfPages = numberOfPages;
        this.available = available;
        this.identifier = identifier;
        this.items = new ArrayList<>();
    }

    public Book() {
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public boolean isAvailable() {
        return this.available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String getIdentifier() {
        return this.identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }
    public static Book addBook(String title, String author, int publicationYear, int numberOfPages, boolean available, String identifier) {
        Book newBook = new Book(title, author, publicationYear, numberOfPages, available, identifier);
        return newBook;
    }

    @Override
    public String toString() {
        return "Book{" +
                "numberOfPages=" + numberOfPages +
                ", available=" + available +
                ", identifier='" + identifier + '\'' +
                ", items=" + items +
                "} " + super.toString();
    }
}
