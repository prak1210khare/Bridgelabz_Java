/*Library Book System: Create a Book class with attributes title, author, price, and availability. Implement a method to borrow
 a book.
 Author: Prakhar Khare
 Date: 1-10-2026
 */

package javaConstructors.level2;

public class Book1 {

    // Attributes
    String title;
    String author;
    double price;
    boolean availability;

    // Constructor
    Book1(String title, String author, double price, boolean availability) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }

    // Method to borrow the book
    void borrowBook() {
        if (availability) {
            availability = false;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book is not available.");
        }
    }

    // Method to display book details
    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Available: " + availability);
    }

    public static void main(String[] args) {

        // Create Book object
        Book1 book = new Book1(
                "The Alchemist",
                "Paulo Coelho",
                399,
                true
        );

        // Display book details before borrowing
        System.out.println("Before Borrowing:");
        book.displayDetails();

        System.out.println();

        // Borrow the book
        book.borrowBook();

        System.out.println();

        // Display book details after borrowing
        System.out.println("After Borrowing:");
        book.displayDetails();
    }
}
