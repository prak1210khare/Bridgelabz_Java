/*5. Doubly Linked List: Library Management System
Problem Statement: Design a library management system using a doubly linked list. Each node represents a book and contains the following attributes: Book Title, Author, Genre, Book ID, and Availability Status. Implement the following functionalities:
Add a new book at the beginning, end, or at a specific position.
Remove a book by Book ID.
Search for a book by Book Title or Author.
Update a book’s Availability Status.
Display all books in forward and reverse order.
Count the total number of books in the library.
        Hint:
Use a doubly linked list with two pointers (next and prev) in each node to facilitate traversal in both directions.
Ensure that when removing a book, both the next and prev pointers are correctly updated.
Displaying in reverse order will require traversal from the last node using prev pointers.
Author: Prakhar Khare
Date: 5-10-2026
 */

package LinkedList.DoubleLinkedList;
// Node class
class LibraryBookNode1 {

    String bookTitle;
    String author;
    String genre;
    int bookId;
    boolean availabilityStatus;

    LibraryBookNode1 next;
    LibraryBookNode1 prev;

    // Constructor
    LibraryBookNode1(String bookTitle, String author,
                     String genre, int bookId,
                     boolean availabilityStatus) {

        this.bookTitle = bookTitle;
        this.author = author;
        this.genre = genre;
        this.bookId = bookId;
        this.availabilityStatus = availabilityStatus;

        this.next = null;
        this.prev = null;
    }
}


// Doubly Linked List class
class LibraryLinkedList1 {

    LibraryBookNode1 head;
    LibraryBookNode1 tail;

    // 1. Add book at beginning
    public void addAtBeginning(String bookTitle,
                               String author,
                               String genre,
                               int bookId,
                               boolean availabilityStatus) {

        LibraryBookNode1 newNode =
                new LibraryBookNode1(
                        bookTitle,
                        author,
                        genre,
                        bookId,
                        availabilityStatus
                );

        // If list is empty
        if (head == null) {

            head = newNode;
            tail = newNode;

        } else {

            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }

        System.out.println("Book added at the beginning.");
    }


    // 2. Add book at end
    public void addAtEnd(String bookTitle,
                         String author,
                         String genre,
                         int bookId,
                         boolean availabilityStatus) {

        LibraryBookNode1 newNode =
                new LibraryBookNode1(
                        bookTitle,
                        author,
                        genre,
                        bookId,
                        availabilityStatus
                );

        // If list is empty
        if (head == null) {

            head = newNode;
            tail = newNode;

        } else {

            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }

        System.out.println("Book added at the end.");
    }


    // 3. Add book at a specific position
    public void addAtPosition(String bookTitle,
                              String author,
                              String genre,
                              int bookId,
                              boolean availabilityStatus,
                              int position) {

        if (position < 1) {
            System.out.println("Invalid position.");
            return;
        }

        // Position 1 means beginning
        if (position == 1) {

            addAtBeginning(
                    bookTitle,
                    author,
                    genre,
                    bookId,
                    availabilityStatus
            );

            return;
        }

        LibraryBookNode1 newNode =
                new LibraryBookNode1(
                        bookTitle,
                        author,
                        genre,
                        bookId,
                        availabilityStatus
                );

        LibraryBookNode1 current = head;

        // Move to node before required position
        for (int i = 1;
             i < position - 1 && current != null;
             i++) {

            current = current.next;
        }

        // Invalid position
        if (current == null) {
            System.out.println("Invalid position.");
            return;
        }

        newNode.next = current.next;
        newNode.prev = current;

        if (current.next != null) {
            current.next.prev = newNode;
        } else {
            tail = newNode;
        }

        current.next = newNode;

        System.out.println(
                "Book added at position " + position + "."
        );
    }


    // 4. Remove book by Book ID
    public void removeByBookId(int bookId) {

        if (head == null) {
            System.out.println("Library is empty.");
            return;
        }

        LibraryBookNode1 current = head;

        // Search for the book
        while (current != null
                && current.bookId != bookId) {

            current = current.next;
        }

        // Book not found
        if (current == null) {
            System.out.println("Book not found.");
            return;
        }

        // If removing head
        if (current == head) {

            head = current.next;

            if (head != null) {
                head.prev = null;
            }
        } else {
            current.prev.next = current.next;
        }

        // If removing tail
        if (current == tail) {

            tail = current.prev;

            if (tail != null) {
                tail.next = null;
            }
        } else if (current.next != null) {

            current.next.prev = current.prev;
        }

        System.out.println(
                "Book removed successfully."
        );
    }


    // 5. Search book by title
    public void searchByTitle(String bookTitle) {

        LibraryBookNode1 current = head;
        boolean found = false;

        while (current != null) {

            if (current.bookTitle.equalsIgnoreCase(bookTitle)) {

                displayBook(current);
                found = true;
            }

            current = current.next;
        }

        if (!found) {
            System.out.println("Book not found.");
        }
    }


    // 6. Search book by author
    public void searchByAuthor(String author) {

        LibraryBookNode1 current = head;
        boolean found = false;

        while (current != null) {

            if (current.author.equalsIgnoreCase(author)) {

                displayBook(current);
                found = true;
            }

            current = current.next;
        }

        if (!found) {
            System.out.println("Book not found.");
        }
    }


    // 7. Update availability status
    public void updateAvailability(int bookId,
                                   boolean availabilityStatus) {

        LibraryBookNode1 current = head;

        while (current != null) {

            if (current.bookId == bookId) {

                current.availabilityStatus =
                        availabilityStatus;

                System.out.println(
                        "Availability status updated successfully."
                );

                return;
            }

            current = current.next;
        }

        System.out.println("Book not found.");
    }


    // 8. Display books in forward order
    public void displayForward() {

        if (head == null) {
            System.out.println("Library is empty.");
            return;
        }

        LibraryBookNode1 current = head;

        System.out.println("Books - Forward Order");
        System.out.println("---------------------");

        while (current != null) {

            displayBook(current);

            current = current.next;
        }
    }


    // 9. Display books in reverse order
    public void displayReverse() {

        if (tail == null) {
            System.out.println("Library is empty.");
            return;
        }

        LibraryBookNode1 current = tail;

        System.out.println("Books - Reverse Order");
        System.out.println("---------------------");

        while (current != null) {

            displayBook(current);

            current = current.prev;
        }
    }


    // 10. Count total books
    public void countBooks() {

        int count = 0;

        LibraryBookNode1 current = head;

        while (current != null) {

            count++;
            current = current.next;
        }

        System.out.println(
                "Total Number of Books: " + count
        );
    }


    // Display one book
    private void displayBook(LibraryBookNode1 book) {

        System.out.println("Book Title: " + book.bookTitle);
        System.out.println("Author: " + book.author);
        System.out.println("Genre: " + book.genre);
        System.out.println("Book ID: " + book.bookId);

        System.out.println(
                "Availability: "
                        + (book.availabilityStatus
                        ? "Available"
                        : "Not Available")
        );

        System.out.println();
    }
}


// Main class
public class LibraryManagementSystem {

    public static void main(String[] args) {

        LibraryLinkedList1 library =
                new LibraryLinkedList1();

        // Add book at beginning
        library.addAtBeginning(
                "The Alchemist",
                "Paulo Coelho",
                "Fiction",
                101,
                true
        );

        // Add book at end
        library.addAtEnd(
                "Atomic Habits",
                "James Clear",
                "Self Help",
                102,
                true
        );

        // Add another book at end
        library.addAtEnd(
                "Harry Potter",
                "J.K. Rowling",
                "Fantasy",
                103,
                false
        );

        // Add book at position 2
        library.addAtPosition(
                "The Hobbit",
                "J.R.R. Tolkien",
                "Fantasy",
                104,
                true,
                2
        );

        // Display forward
        System.out.println();
        library.displayForward();

        // Display reverse
        System.out.println();
        library.displayReverse();

        // Search by title
        System.out.println("Search By Book Title");
        System.out.println("====================");

        library.searchByTitle("The Alchemist");

        // Search by author
        System.out.println("Search By Author");
        System.out.println("================");

        library.searchByAuthor("J.K. Rowling");

        // Update availability
        System.out.println("Update Availability");
        System.out.println("===================");

        library.updateAvailability(103, true);

        // Count books
        System.out.println();
        library.countBooks();

        // Remove book
        System.out.println();
        System.out.println("Remove Book");
        System.out.println("===========");

        library.removeByBookId(102);

        // Display final library
        System.out.println();
        library.displayForward();

        // Count books again
        library.countBooks();
    }
}
