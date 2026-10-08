/*Longest Consecutive Sequence
Problem: Given an unsorted array, find the length of the longest consecutive elements sequence.
Hint: Use a hash map to store elements and check for consecutive elements efficiently.
Author: Prakhar Khare
Date: 7-10-2026
*/

package StacksQueuesHashMaps.HashMapsandHashFunctions;
import java.util.HashMap;
import java.util.Map;

public class LongestConsecutiveSequence {

    // Method to find the longest consecutive sequence
    public static int findLongestSequence(int[] array) {

        // HashMap to store all elements
        Map<Integer, Boolean> elements =
                new HashMap<>();

        // Store all elements in HashMap
        for (int value : array) {
            elements.put(value, true);
        }

        int longestLength = 0;

        // Check every element
        for (int value : array) {

            // Check whether this is the beginning
            // of a consecutive sequence
            if (!elements.containsKey(value - 1)) {

                int currentNumber = value;
                int currentLength = 1;

                // Find consecutive numbers
                while (elements.containsKey(
                        currentNumber + 1)) {

                    currentNumber++;
                    currentLength++;
                }

                // Update longest sequence
                if (currentLength > longestLength) {
                    longestLength = currentLength;
                }
            }
        }

        return longestLength;
    }

    public static void main(String[] args) {

        // Unsorted array
        int[] array = {
                100, 4, 200, 1, 3, 2
        };

        System.out.println("Array:");

        for (int value : array) {
            System.out.print(value + " ");
        }

        System.out.println();

        // Find longest consecutive sequence
        int longestLength =
                findLongestSequence(array);

        System.out.println(
                "Length of Longest Consecutive Sequence: "
                        + longestLength
        );
    }
}
