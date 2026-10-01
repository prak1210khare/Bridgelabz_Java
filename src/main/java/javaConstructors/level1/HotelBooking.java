/*Hotel Booking System: Create a HotelBooking class with attributes guestName, roomType, and nights. Use default, parameterized, and copy constructors to initialize bookings.
Author: Prakhar Khare
Date: 1-10-2026
 */
package javaConstructors.level1;

public class HotelBooking {

    // Attributes
    String guestName;
    String roomType;
    int nights;

    // Default constructor
    HotelBooking() {
        guestName = "Unknown";
        roomType = "Standard";
        nights = 1;
    }

    // Parameterized constructor
    HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor
    HotelBooking(HotelBooking booking) {
        guestName = booking.guestName;
        roomType = booking.roomType;
        nights = booking.nights;
    }

    // Method to display booking details
    void displayDetails() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Number of Nights: " + nights);
    }

    public static void main(String[] args) {

        // Object using default constructor
        HotelBooking booking1 = new HotelBooking();

        // Object using parameterized constructor
        HotelBooking booking2 =
                new HotelBooking("Prakhar", "Deluxe", 3);

        // Object using copy constructor
        HotelBooking booking3 =
                new HotelBooking(booking2);

        System.out.println("Booking 1:");
        booking1.displayDetails();

        System.out.println();

        System.out.println("Booking 2:");
        booking2.displayDetails();

        System.out.println();

        System.out.println("Booking 3 (Copied):");
        booking3.displayDetails();
    }
}
