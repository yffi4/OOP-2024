package Task1.B;

import java.util.ArrayList;

public class Tester {
    public static void main(String[] args){
        Book book1 = Book.addBook("Преступление и наказание", "Фёдор Достоевский", 1866, 671, true, "ISBN-67890");
        Book book2 = Book.addBook("Война и мир", "Лев Толстой", 1869, 1225, true, "ISBN-12345");
        Book book3 = Book.addBook("Мастер и Маргарита", "Михаил Булгаков", 1967, 480, false, "ISBN-54321");


        ArrayList<LibraryItem> libraryItems = new ArrayList<>();


        libraryItems.add(book1);
        libraryItems.add(book2);
        libraryItems.add(book3);


        System.out.println("Список книг в библиотеке:");
        for (LibraryItem item : libraryItems) {
            System.out.println(item.toString());
        }


        System.out.println("\nПроверка доступности:");
        for (LibraryItem item : libraryItems) {
            String availability = item.isAvailable() ? "доступна" : "недоступна";
            System.out.println("Книга \"" + item.getTitle() + "\" " + availability + " для выдачи.");
        }


        System.out.println("\nИдентификаторы книг:");
        for (LibraryItem item : libraryItems) {
            System.out.println("Книга \"" + item.getTitle() + "\" имеет идентификатор: " + item.getIdentifier());
        }
    }
}
