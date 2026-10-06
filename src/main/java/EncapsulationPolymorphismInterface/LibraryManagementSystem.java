/*5. Library Management System
Description: Develop a library management system:
Use an abstract class LibraryItem with fields like itemId, title, and author.
Add an abstract method getLoanDuration() and a concrete method getItemDetails().
Create subclasses Book, Magazine, and DVD, overriding getLoanDuration() with specific logic.
Implement an interface Reservable with methods reserveItem() and checkAvailability().
Apply encapsulation to secure details like the borrower’s personal data.
Use polymorphism to allow a general LibraryItem reference to manage all items, regardless of type.
Author: Prakhar Khare
Date: 5-10-2026
 */
package EncapsulationPolymorphismInterface;
import java.util.ArrayList;
import java.util.List;

// Interface
interface Reservable {

    void reserveItem();

    boolean checkAvailability();
}

// Abstract class
abstract class LibraryItem {

    // Common item fields
    private int itemId;
    private String title;
    private String author;

    // Constructor
    LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Getters
    public int getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // Setters
    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // Abstract method
    abstract int getLoanDuration();

    // Concrete method
    void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println(
                "Loan Duration: " + getLoanDuration() + " days"
        );
    }
}

// Book subclass
class Book extends LibraryItem implements Reservable {

    // Encapsulated borrower information
    private String borrowerName;
    private boolean available;

    // Constructor
    Book(int itemId, String title, String author) {
        super(itemId, title, author);
        this.available = true;
    }

    // Loan duration for book
    @Override
    int getLoanDuration() {
        return 14;
    }

    // Reserve book
    @Override
    public void reserveItem() {

        if (available) {
            available = false;
            System.out.println("Book reserved successfully.");
        } else {
            System.out.println("Book is not available.");
        }
    }

    // Check availability
    @Override
    public boolean checkAvailability() {
        return available;
    }

    // Setter for borrower name
    public void setBorrowerName(String borrowerName) {
        this.borrowerName = borrowerName;
    }

    // Getter for borrower name
    public String getBorrowerName() {
        return borrowerName;
    }
}

// Magazine subclass
class Magazine extends LibraryItem implements Reservable {

    private boolean available;

    // Constructor
    Magazine(int itemId, String title, String author) {
        super(itemId, title, author);
        this.available = true;
    }

    // Loan duration for magazine
    @Override
    int getLoanDuration() {
        return 7;
    }

    // Reserve magazine
    @Override
    public void reserveItem() {

        if (available) {
            available = false;
            System.out.println("Magazine reserved successfully.");
        } else {
            System.out.println("Magazine is not available.");
        }
    }

    // Check availability
    @Override
    public boolean checkAvailability() {
        return available;
    }
}

// DVD subclass
class DVD extends LibraryItem implements Reservable {

    private boolean available;

    // Constructor
    DVD(int itemId, String title, String author) {
        super(itemId, title, author);
        this.available = true;
    }

    // Loan duration for DVD
    @Override
    int getLoanDuration() {
        return 3;
    }

    // Reserve DVD
    @Override
    public void reserveItem() {

        if (available) {
            available = false;
            System.out.println("DVD reserved successfully.");
        } else {
            System.out.println("DVD is not available.");
        }
    }

    // Check availability
    @Override
    public boolean checkAvailability() {
        return available;
    }
}

// Main class
public class LibraryManagementSystem {

    public static void main(String[] args) {

        // Create library items
        Book book = new Book(
                101,
                "The Alchemist",
                "Paulo Coelho"
        );

        Magazine magazine = new Magazine(
                102,
                "India Today",
                "Various Authors"
        );

        DVD dvd = new DVD(
                103,
                "Inception",
                "Christopher Nolan"
        );

        // Store different objects using LibraryItem reference
        List<LibraryItem> items = new ArrayList<>();

        items.add(book);
        items.add(magazine);
        items.add(dvd);

        // Polymorphism
        for (LibraryItem item : items) {

            item.getItemDetails();

            System.out.println();
        }

        // Reserve items
        book.reserveItem();
        magazine.reserveItem();

        System.out.println();

        // Check availability
        System.out.println(
                "Book Available: " + book.checkAvailability()
        );

        System.out.println(
                "Magazine Available: " + magazine.checkAvailability()
        );

        System.out.println(
                "DVD Available: " + dvd.checkAvailability()
        );

        // Encapsulation example
        book.setBorrowerName("Prakhar");

        System.out.println(
                "Borrower Name: " + book.getBorrowerName()
        );
    }
}