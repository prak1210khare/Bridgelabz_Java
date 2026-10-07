/*2. Doubly Linked List: Movie Management System
Problem Statement: Implement a movie management system using a doubly linked list. Each node will represent a movie and contain Movie Title, Director, Year of Release, and Rating. Implement the following functionalities:
Add a movie record at the beginning, end, or at a specific position.
Remove a movie record by Movie Title.
        Search for a movie record by Director or Rating.
Display all movie records in both forward and reverse order.
Update a movie's Rating based on the Movie Title.
Hint:
Use a doubly linked list where each node has two pointers: one pointing to the next node and the other to the previous node.
Maintain pointers to both the head and tail for easier insertion and deletion at both ends.
For reverse display, start from the tail and traverse backward using the prev pointers.
Author: Prakhar Khare
Date: 5-10-2026
 */

package LinkedList.DoubleLinkedList;
// Node class
class MovieNode1 {

    String movieTitle;
    String director;
    int yearOfRelease;
    double rating;

    MovieNode1 next;
    MovieNode1 prev;

    // Constructor
    MovieNode1(String movieTitle, String director,
               int yearOfRelease, double rating) {

        this.movieTitle = movieTitle;
        this.director = director;
        this.yearOfRelease = yearOfRelease;
        this.rating = rating;

        this.next = null;
        this.prev = null;
    }
}


// Doubly Linked List class
class MovieLinkedList1 {

    MovieNode1 head;
    MovieNode1 tail;

    // 1. Add movie at the beginning
    public void addAtBeginning(String movieTitle,
                               String director,
                               int yearOfRelease,
                               double rating) {

        MovieNode1 newNode =
                new MovieNode1(
                        movieTitle,
                        director,
                        yearOfRelease,
                        rating
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

        System.out.println("Movie added at the beginning.");
    }


    // 2. Add movie at the end
    public void addAtEnd(String movieTitle,
                         String director,
                         int yearOfRelease,
                         double rating) {

        MovieNode1 newNode =
                new MovieNode1(
                        movieTitle,
                        director,
                        yearOfRelease,
                        rating
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

        System.out.println("Movie added at the end.");
    }


    // 3. Add movie at a specific position
    public void addAtPosition(String movieTitle,
                              String director,
                              int yearOfRelease,
                              double rating,
                              int position) {

        if (position < 1) {
            System.out.println("Invalid position.");
            return;
        }

        // Position 1 means beginning
        if (position == 1) {
            addAtBeginning(
                    movieTitle,
                    director,
                    yearOfRelease,
                    rating
            );
            return;
        }

        MovieNode1 newNode =
                new MovieNode1(
                        movieTitle,
                        director,
                        yearOfRelease,
                        rating
                );

        MovieNode1 current = head;

        // Move to the node before the required position
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

        // Insert new node
        newNode.next = current.next;
        newNode.prev = current;

        if (current.next != null) {
            current.next.prev = newNode;
        } else {
            // New node becomes tail
            tail = newNode;
        }

        current.next = newNode;

        System.out.println(
                "Movie added at position " + position + "."
        );
    }


    // 4. Remove movie by title
    public void removeByTitle(String movieTitle) {

        if (head == null) {
            System.out.println("Movie list is empty.");
            return;
        }

        MovieNode1 current = head;

        // Search for movie
        while (current != null
                && !current.movieTitle.equalsIgnoreCase(movieTitle)) {

            current = current.next;
        }

        // Movie not found
        if (current == null) {
            System.out.println("Movie not found.");
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

        System.out.println("Movie removed successfully.");
    }


    // 5. Search by Director
    public void searchByDirector(String director) {

        MovieNode1 current = head;
        boolean found = false;

        while (current != null) {

            if (current.director.equalsIgnoreCase(director)) {

                displayMovie(current);
                found = true;
            }

            current = current.next;
        }

        if (!found) {
            System.out.println(
                    "No movie found for director: " + director
            );
        }
    }


    // 6. Search by Rating
    public void searchByRating(double rating) {

        MovieNode1 current = head;
        boolean found = false;

        while (current != null) {

            if (current.rating == rating) {

                displayMovie(current);
                found = true;
            }

            current = current.next;
        }

        if (!found) {
            System.out.println(
                    "No movie found with rating: " + rating
            );
        }
    }


    // 7. Display movies in forward order
    public void displayForward() {

        if (head == null) {
            System.out.println("Movie list is empty.");
            return;
        }

        MovieNode1 current = head;

        System.out.println("Movies - Forward Order");
        System.out.println("----------------------");

        while (current != null) {

            displayMovie(current);

            current = current.next;
        }
    }


    // 8. Display movies in reverse order
    public void displayReverse() {

        if (tail == null) {
            System.out.println("Movie list is empty.");
            return;
        }

        MovieNode1 current = tail;

        System.out.println("Movies - Reverse Order");
        System.out.println("----------------------");

        while (current != null) {

            displayMovie(current);

            current = current.prev;
        }
    }


    // 9. Update rating by movie title
    public void updateRating(String movieTitle,
                             double newRating) {

        MovieNode1 current = head;

        while (current != null) {

            if (current.movieTitle.equalsIgnoreCase(movieTitle)) {

                current.rating = newRating;

                System.out.println(
                        "Rating updated successfully."
                );

                return;
            }

            current = current.next;
        }

        System.out.println("Movie not found.");
    }


    // Display individual movie
    private void displayMovie(MovieNode1 movie) {

        System.out.println("Movie Title: " + movie.movieTitle);
        System.out.println("Director: " + movie.director);
        System.out.println(
                "Year of Release: " + movie.yearOfRelease
        );
        System.out.println("Rating: " + movie.rating);
        System.out.println();
    }
}


// Main class
public class MovieManagementSystem {

    public static void main(String[] args) {

        MovieLinkedList1 movieList =
                new MovieLinkedList1();

        // Add movie at beginning
        movieList.addAtBeginning(
                "Inception",
                "Christopher Nolan",
                2010,
                8.8
        );

        // Add movie at end
        movieList.addAtEnd(
                "Interstellar",
                "Christopher Nolan",
                2014,
                8.7
        );

        // Add another movie at end
        movieList.addAtEnd(
                "3 Idiots",
                "Rajkumar Hirani",
                2009,
                8.4
        );

        // Add movie at position 2
        movieList.addAtPosition(
                "Dangal",
                "Nitesh Tiwari",
                2016,
                8.3,
                2
        );

        // Display movies forward
        System.out.println();
        movieList.displayForward();

        // Display movies reverse
        System.out.println();
        movieList.displayReverse();

        // Search by director
        System.out.println();
        System.out.println("Search by Director");
        System.out.println("==================");

        movieList.searchByDirector(
                "Christopher Nolan"
        );

        // Search by rating
        System.out.println("Search by Rating");
        System.out.println("================");

        movieList.searchByRating(8.4);

        // Update rating
        System.out.println("Update Movie Rating");
        System.out.println("===================");

        movieList.updateRating(
                "Dangal",
                8.5
        );

        // Remove movie
        System.out.println();
        System.out.println("Remove Movie");
        System.out.println("============");

        movieList.removeByTitle("3 Idiots");

        // Display final list
        System.out.println();
        movieList.displayForward();
    }
}
