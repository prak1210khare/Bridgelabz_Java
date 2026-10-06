/*Single Inheritance
Sample Problem 1: Library Management with Books and Authors
Description: Model a Book system where Book is the superclass, and Author is a subclass.
        Tasks:
Define a superclass Book with attributes like title and publicationYear.
Define a subclass Author with additional attributes like name and bio.
Create a method displayInfo() to show details of the book and its author.
Author: Prakhar Khare
Date: 4-10-2026
 */
package Inheritance.SingleInheritance;
// Superclass
class Book {

    // Book attributes
    String title;
    int publicationYear;

    // Constructor
    Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    // Method to display book information
    void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}

// Subclass
class Author extends Book {

    // Author attributes
    String name;
    String bio;

    // Constructor
    Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    // Overriding displayInfo()
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Author Name: " + name);
        System.out.println("Author Bio: " + bio);
    }
}

// Main class
public class LibraryManagement {

    public static void main(String[] args) {

        // Create Author object
        Author author = new Author(
                "The Alchemist",
                1988,
                "Paulo Coelho",
                "Brazilian author known for inspirational novels."
        );

        // Display book and author information
        author.displayInfo();
    }
}
