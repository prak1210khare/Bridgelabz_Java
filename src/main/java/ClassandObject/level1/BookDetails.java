/*Program to Handle Book Details
Problem Statement: Write a program to create a Book class with attributes title, author, and price. Add a method to display the book details.
Author: Prakhar Khare
Date: 1-10-2026
 */
package ClassandObject.level1;
class Book {
    // Attributes
    String title;
    String author;
    double price;

    // Constructor
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    void displayDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

public class BookDetails {
    public static void main(String[] args) {

        // Create Book object
        Book book = new Book("The Alchemist", "Paulo Coelho", 399);

        // Display book details
        book.displayDetails();
    }
}
