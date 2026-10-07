/*9. Circular Linked List: Online Ticket Reservation System
Problem Statement: Design an online ticket reservation system using a circular linked list, where each node represents a booked ticket. Each node will store the following information: Ticket ID, Customer Name, Movie Name, Seat Number, and Booking Time. Implement the following functionalities:
Add a new ticket reservation at the end of the circular list.
Remove a ticket by Ticket ID.
Display the current tickets in the list.
        Search for a ticket by Customer Name or Movie Name.
Calculate the total number of booked tickets.

        Hint:
Use a circular linked list to represent the ticket reservations, with the last node’s next pointer pointing to the first node.
When removing a ticket, update the circular pointers accordingly.
For displaying all tickets, traverse the list starting from the first node, looping back after reaching the last node.
Author: Prakhar Khare
Date: 5-10-2026
 */

package LinkedList.CircularLinkedList;
// Node representing a booked ticket
class TicketNode1 {

    int ticketId;
    String customerName;
    String movieName;
    String seatNumber;
    String bookingTime;

    TicketNode1 next;

    TicketNode1(int ticketId, String customerName,
                String movieName, String seatNumber,
                String bookingTime) {

        this.ticketId = ticketId;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;

        this.next = null;
    }
}

// Circular linked list for ticket reservations
class TicketCircularList1 {

    TicketNode1 head;
    TicketNode1 tail;

    // Add a new ticket at the end
    public void addTicket(int ticketId,
                          String customerName,
                          String movieName,
                          String seatNumber,
                          String bookingTime) {

        TicketNode1 newTicket =
                new TicketNode1(
                        ticketId,
                        customerName,
                        movieName,
                        seatNumber,
                        bookingTime
                );

        // If the list is empty
        if (head == null) {

            head = newTicket;
            tail = newTicket;

            // Make the list circular
            tail.next = head;

        } else {

            // Add new ticket after tail
            tail.next = newTicket;

            // Update tail
            tail = newTicket;

            // Maintain circular connection
            tail.next = head;
        }
    }

    // Remove a ticket by Ticket ID
    public void removeTicket(int ticketId) {

        if (head == null) {

            System.out.println(
                    "No tickets are booked."
            );

            return;
        }

        TicketNode1 current = head;
        TicketNode1 previous = tail;

        do {

            if (current.ticketId == ticketId) {

                // Only one ticket exists
                if (head == tail) {

                    head = null;
                    tail = null;

                } else {

                    // Removing the first ticket
                    if (current == head) {

                        head = head.next;
                        tail.next = head;

                    } else {

                        // Connect previous node to next node
                        previous.next = current.next;

                        // Removing the last ticket
                        if (current == tail) {

                            tail = previous;
                            tail.next = head;
                        }
                    }
                }

                System.out.println(
                        "Ticket " + ticketId
                                + " removed successfully."
                );

                return;
            }

            previous = current;
            current = current.next;

        } while (current != head);

        System.out.println(
                "Ticket ID " + ticketId
                        + " not found."
        );
    }

    // Display all booked tickets
    public void displayTickets() {

        if (head == null) {

            System.out.println(
                    "No tickets are booked."
            );

            return;
        }

        TicketNode1 current = head;

        System.out.println(
                "\n===== Booked Tickets ====="
        );

        do {

            displayTicket(current);

            current = current.next;

        } while (current != head);

        System.out.println();
    }

    // Search tickets by customer name
    public void searchByCustomerName(
            String customerName) {

        if (head == null) {

            System.out.println(
                    "No tickets are booked."
            );

            return;
        }

        TicketNode1 current = head;
        boolean found = false;

        System.out.println(
                "\nTickets booked by " + customerName + ":"
        );

        do {

            if (current.customerName
                    .equalsIgnoreCase(customerName)) {

                displayTicket(current);
                found = true;
            }

            current = current.next;

        } while (current != head);

        if (!found) {

            System.out.println(
                    "No ticket found for customer: "
                            + customerName
            );
        }

        System.out.println();
    }

    // Search tickets by movie name
    public void searchByMovieName(
            String movieName) {

        if (head == null) {

            System.out.println(
                    "No tickets are booked."
            );

            return;
        }

        TicketNode1 current = head;
        boolean found = false;

        System.out.println(
                "\nTickets booked for movie: "
                        + movieName
        );

        do {

            if (current.movieName
                    .equalsIgnoreCase(movieName)) {

                displayTicket(current);
                found = true;
            }

            current = current.next;

        } while (current != head);

        if (!found) {

            System.out.println(
                    "No tickets found for movie: "
                            + movieName
            );
        }

        System.out.println();
    }

    // Count total booked tickets
    public void countTickets() {

        if (head == null) {

            System.out.println(
                    "Total Booked Tickets: 0"
            );

            return;
        }

        int count = 0;
        TicketNode1 current = head;

        do {

            count++;
            current = current.next;

        } while (current != head);

        System.out.println(
                "Total Booked Tickets: " + count
        );
    }

    // Display details of one ticket
    private void displayTicket(TicketNode1 ticket) {

        System.out.println(
                "Ticket ID: " + ticket.ticketId
                        + ", Customer: " + ticket.customerName
                        + ", Movie: " + ticket.movieName
                        + ", Seat: " + ticket.seatNumber
                        + ", Booking Time: " + ticket.bookingTime
        );
    }
}

// Main class
public class OnlineTicketReservation {

    public static void main(String[] args) {

        TicketCircularList1 reservation =
                new TicketCircularList1();

        // Add ticket reservations
        reservation.addTicket(
                101,
                "Prakhar",
                "Avengers",
                "A10",
                "10:00 AM"
        );

        reservation.addTicket(
                102,
                "Rahul",
                "Inception",
                "B12",
                "10:15 AM"
        );

        reservation.addTicket(
                103,
                "Amit",
                "Avengers",
                "A11",
                "10:30 AM"
        );

        reservation.addTicket(
                104,
                "Neha",
                "Dangal",
                "C05",
                "10:45 AM"
        );

        // Display all tickets
        reservation.displayTickets();

        // Search by customer name
        reservation.searchByCustomerName("Prakhar");

        // Search by movie name
        reservation.searchByMovieName("Avengers");

        // Count total tickets
        reservation.countTickets();

        // Remove a ticket
        reservation.removeTicket(102);

        // Display updated list
        reservation.displayTickets();

        // Display updated count
        reservation.countTickets();
    }
}
