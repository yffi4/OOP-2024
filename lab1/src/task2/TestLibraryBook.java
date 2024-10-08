package task2;

public class TestLibraryBook{
    public static void main(String[] args) {

        LibraryBook book1 = new LibraryBook("978-0134685991", "Effective Java", LibraryBook.Genre.SCIENCE);
        LibraryBook book2 = new LibraryBook("978-0321356680", "Clean Code");


        book1.displayBookInfo();
        book2.displayBookInfo();


        book1.borrowBook();
        book2.borrowBook(10);


        book2.borrowBook(20);


        book1.returnBook();
        book2.returnBook();


        System.out.println("Total books in the library: " + LibraryBook.getTotalBooks());


        System.out.println("Book 1 ISBN: " + book1.getIsbn());
    }
}

