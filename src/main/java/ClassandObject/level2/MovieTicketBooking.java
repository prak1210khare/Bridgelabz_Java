/*Program to Model a Movie Ticket Booking System
Problem Statement: Create a MovieTicket class with attributes movieName, seatNumber, and price. Add methods to:
Book a ticket (assign seat and update price).
Display ticket details.
Explanation: The MovieTicket class organizes ticket information with attributes. The methods handle booking logic and display ticket details.
Author: Prakhar Khare
Date: 1-10-2026
 */

package ClassandObject.level2;
class MovieTicket {
    // Attributes
    String movieName;
    String seatNumber;
    double price;

    // Constructor
    MovieTicket(String movieName) {
        this.movieName = movieName;
        this.seatNumber = "Not Booked";
        this.price = 0;
    }

    // Method to book a ticket
    void bookTicket(String seatNumber, double price) {
        this.seatNumber = seatNumber;
        this.price = price;

        System.out.println("Ticket booked successfully.");
    }

    // Method to display ticket details
    void displayDetails() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Ticket Price: " + price);
    }
}

public class MovieTicketBooking {
    public static void main(String[] args) {

        // Create MovieTicket object
        MovieTicket ticket = new MovieTicket("Avengers");

        // Book the ticket
        ticket.bookTicket("A12", 250);

        // Display ticket details
        ticket.displayDetails();
    }
}