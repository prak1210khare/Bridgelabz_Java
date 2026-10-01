/*Problem 2: Book Library System
Design a Book class with:
ISBN (public).
title (protected).
author (private).
Write methods to:
Set and get the author name.
Create a subclass EBook to access ISBN and title and demonstrate access modifiers.
Author: Prakhar Khare
Date: 1-10-2026
 */

package javaConstructors.AccessModifiers;
class Book {

    // Public variable
    public String ISBN;

    // Protected variable
    protected String title;

    // Private variable
    private String author;

    // Constructor
    Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Public method to get private author
    public String getAuthor() {
        return author;
    }

    // Public method to set private author
    public void setAuthor(String author) {
        this.author = author;
    }
}

// Subclass
class EBook extends Book {

    EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    // Demonstrate access to public and protected members
    void displayDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
    }
}

public class BookLibrary {
    public static void main(String[] args) {

        // Create Book object
        Book book = new Book(
                "978-0135166307",
                "Java Programming",
                "James Gosling"
        );

        // Access public ISBN directly
        System.out.println("ISBN: " + book.ISBN);

        // Access private author using getter
        System.out.println("Author: " + book.getAuthor());

        // Modify private author using setter
        book.setAuthor("Herbert Schildt");

        System.out.println("Updated Author: " + book.getAuthor());

        System.out.println();

        // Create EBook object
        EBook ebook = new EBook(
                "978-0135166307",
                "Java Programming",
                "James Gosling"
        );

        // EBook can access ISBN and title
        ebook.displayDetails();
    }}
