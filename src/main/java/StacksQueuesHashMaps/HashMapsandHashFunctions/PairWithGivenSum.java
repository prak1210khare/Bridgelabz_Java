/*Check for a Pair with Given Sum in an Array
Problem: Given an array and a target sum, find if there exists a pair of elements whose sum is equal to the target.
        Hint: Store visited numbers in a hash map and check if target - current_number exists in the map
Author: Prakhar Khare
Date: 7-10-2026
 */

package StacksQueuesHashMaps.HashMapsandHashFunctions;
import java.util.HashMap;
import java.util.Map;

// Main class
public class PairWithGivenSum {

    // Method to find a pair with the given sum
    public static void findPair(int[] array, int targetSum) {

        // HashMap stores numbers that have already
        // been visited along with their indices
        Map<Integer, Integer> visitedNumbers =
                new HashMap<>();

        boolean pairFound = false;

        // Traverse the array
        for (int i = 0; i < array.length; i++) {

            int currentNumber = array[i];

            // Find the number required to reach target
            int requiredNumber =
                    targetSum - currentNumber;

            // Check whether required number
            // was already visited
            if (visitedNumbers.containsKey(requiredNumber)) {

                int previousIndex =
                        visitedNumbers.get(requiredNumber);

                System.out.println(
                        "Pair found: "
                                + requiredNumber
                                + " + "
                                + currentNumber
                                + " = "
                                + targetSum
                );

                System.out.println(
                        "Indices: "
                                + previousIndex
                                + " and "
                                + i
                );

                pairFound = true;

                // Stop after finding the first pair
                break;
            }

            // Store current number and its index
            visitedNumbers.put(
                    currentNumber,
                    i
            );
        }

        if (!pairFound) {

            System.out.println(
                    "No pair found with sum "
                            + targetSum
            );
        }
    }

    public static void main(String[] args) {

        // Input array
        int[] array = {
                10, 15, 3, 7, 8, 12
        };

        // Target sum
        int targetSum = 18;

        System.out.println("Array:");

        for (int value : array) {
            System.out.print(value + " ");
        }

        System.out.println();

        System.out.println(
                "Target Sum: " + targetSum
        );

        // Find pair
        findPair(array, targetSum);
    }
}
