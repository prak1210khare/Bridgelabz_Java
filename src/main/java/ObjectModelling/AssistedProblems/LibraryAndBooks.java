/*Problem 1: Library and Books (Aggregation)
Description: Create a Library class that contains multiple Book objects. Model the relationship such that a library can have many books, but a book can exist independently (outside of a specific library).
Tasks:
Define a Library class with an ArrayList of Book objects.
Define a Book class with attributes such as title and author.
Demonstrate the aggregation relationship by creating books and adding them to different libraries.
Author:Prakhar Khare
Date: 5-10-2026
 */

package ObjectModelling.AssistedProblems;

import java.util.ArrayList;

// Book class
class Book1 {

    private String title;
    private String author;

    // Constructor
    Book1(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Display book details
    public void displayDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
    }
}

        // Library class
        class Library1 {

            private String libraryName;

            // ArrayList containing Book objects
            private ArrayList<Book1> books;

            // Constructor
            Library1(String libraryName) {
                this.libraryName = libraryName;
                books = new ArrayList<>();
            }

            // Add book to library
            public void addBook(Book1 book) {
                books.add(book);
            }

            // Display library details
            public void displayLibraryDetails() {

                System.out.println("Library Name: " + libraryName);
                System.out.println("Books in Library:");

                for (Book1 book : books) {
                    book.displayDetails();
                    System.out.println();
                }
            }
        }

        // Main class
        public class LibraryAndBooks {

            public static void main(String[] args) {

                // Create Book objects independently
                Book1 book1 = new Book1(
                        "The Alchemist",
                        "Paulo Coelho"
                );

                Book1 book2 = new Book1(
                        "Harry Potter",
                        "J.K. Rowling"
                );

                Book1 book3 = new Book1(
                        "Atomic Habits",
                        "James Clear"
                );

                // Create two libraries
                Library1 library1 = new Library1("SRM Central Library");
                Library1 library2 = new Library1("City Library");

                // Add books to different libraries
                library1.addBook(book1);
                library1.addBook(book2);

                library2.addBook(book2);
                library2.addBook(book3);

                // Display library details
                System.out.println("Library 1");
                System.out.println("---------");
                library1.displayLibraryDetails();

                System.out.println("Library 2");
                System.out.println("---------");
                library2.displayLibraryDetails();

                // Book still exists independently
                System.out.println("Independent Book");
                System.out.println("----------------");
                book2.displayDetails();
            }
        }


