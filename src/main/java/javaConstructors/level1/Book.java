/*Create a Book class with attributes title, author, and price. Provide both default and parameterized constructors.
Author: Prakhar Khare
Date: 1-10-2026
 */

package javaConstructors.level1;


public class Book {

    // Attributes
    String title;
    String author;
    double price;

    // Default constructor
    Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    // Parameterized constructor
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {

        // Object using default constructor
        Book book1 = new Book();

        // Object using parameterized constructor
        Book book2 = new Book("The Alchemist", "Paulo Coelho", 399);

        System.out.println("Book 1:");
        book1.displayDetails();

        System.out.println();

        System.out.println("Book 2:");
        book2.displayDetails();
    }
}