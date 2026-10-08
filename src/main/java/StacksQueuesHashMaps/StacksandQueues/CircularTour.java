/*Circular Tour Problem
Problem: Given a set of petrol pumps with petrol and distance to the next pump, determine the starting point for completing a circular tour.
Hint: Use a queue to simulate the tour, keeping track of surplus petrol at each pump.
Author: Prakhar Khare
Date: 6-10-2026
 */
package StacksQueuesHashMaps.StacksandQueues;
import java.util.LinkedList;
import java.util.Queue;

// Represents one petrol pump
class PetrolPump1 {

    int petrol;
    int distance;

    PetrolPump1(int petrol, int distance) {
        this.petrol = petrol;
        this.distance = distance;
    }
}

// Main class
public class CircularTour {

    // Find the starting petrol pump
    public static int findStartingPoint(
            Queue<PetrolPump1> pumps) {

        if (pumps.isEmpty()) {
            return -1;
        }

        // Store all pumps in an array so that
        // we can easily check their indices
        PetrolPump1[] pumpArray =
                pumps.toArray(new PetrolPump1[0]);

        int n = pumpArray.length;

        // Starting pump
        int start = 0;

        // Current petrol available
        int currentPetrol = 0;

        // Total petrol surplus
        int totalPetrol = 0;

        for (int i = 0; i < n; i++) {

            // Calculate petrol gained/lost
            int surplus =
                    pumpArray[i].petrol
                            - pumpArray[i].distance;

            currentPetrol += surplus;
            totalPetrol += surplus;

            // If petrol becomes negative,
            // current starting point cannot work
            if (currentPetrol < 0) {

                start = i + 1;

                currentPetrol = 0;
            }
        }

        // If total petrol is negative,
        // completing the tour is impossible
        if (totalPetrol < 0) {
            return -1;
        }

        return start;
    }

    public static void main(String[] args) {

        Queue<PetrolPump1> pumps =
                new LinkedList<>();

        // Add petrol pumps
        pumps.add(new PetrolPump1(6, 4));
        pumps.add(new PetrolPump1(3, 6));
        pumps.add(new PetrolPump1(7, 3));
        pumps.add(new PetrolPump1(4, 5));
        pumps.add(new PetrolPump1(8, 2));

        // Find starting point
        int startingPoint =
                findStartingPoint(pumps);

        if (startingPoint == -1) {

            System.out.println(
                    "Circular tour cannot be completed."
            );

        } else {

            System.out.println(
                    "Starting Petrol Pump: "
                            + startingPoint
            );
        }
    }
}
