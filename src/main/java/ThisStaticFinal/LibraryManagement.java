/*Sample Program 2: Library Management System
Create a Book class to manage library books with the following features:
Static:
A static variable libraryName shared across all books.
A static method displayLibraryName() to print the library name.
This:
Use this to initialize title, author, and isbn in the constructor.
        Final:
Use a final variable isbn to ensure the unique identifier of a book cannot be changed.
        Instanceof:
Verify if an object is an instance of the Book class before displaying its details.
Author: Prakhar Khare
Date: 1-10-2026
 */
package ThisStaticFinal;
class Book {

    // Static variable shared by all books
    static String libraryName = "SRM Central Library";

    // Instance variables
    String title;
    String author;

    // Final variable
    final String isbn;

    // Constructor
    Book(String title, String author, String isbn) {

        // 'this' refers to the current object's variables
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Static method to display library name
    static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    // Method to display book details
    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }
}

public class LibraryManagement {

    public static void main(String[] args) {

        // Create Book objects
        Book book1 = new Book(
                "The Alchemist",
                "Paulo Coelho",
                "978-0061122415"
        );

        Book book2 = new Book(
                "Clean Code",
                "Robert C. Martin",
                "978-0132350884"
        );

        // Display library name using static method
        Book.displayLibraryName();

        System.out.println();

        // Check if book1 is an instance of Book
        if (book1 instanceof Book) {
            System.out.println("Book 1 is an instance of Book.");
            book1.displayDetails();
        }

        System.out.println();

        // Check if book2 is an instance of Book
        if (book2 instanceof Book) {
            System.out.println("Book 2 is an instance of Book.");
            book2.displayDetails();
        }
    }
}
