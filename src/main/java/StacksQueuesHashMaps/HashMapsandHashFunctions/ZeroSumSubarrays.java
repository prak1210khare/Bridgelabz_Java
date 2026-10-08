/*Find All Subarrays with Zero Sum
Problem: Given an array, find all subarrays whose elements sum up to zero.
Hint: Use a hash map to store the cumulative sum and its frequency. If a sum repeats, a zero-sum subarray exists
Author: Prakhar Khare
Date: 7-10-2026
*/

package StacksQueuesHashMaps.HashMapsandHashFunctions;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Main class
public class ZeroSumSubarrays {

    // Find all subarrays having zero sum
    public static void findZeroSumSubarrays(int[] array) {

        // HashMap stores cumulative sum
        // and the list of indices where it occurred
        Map<Integer, List<Integer>> sumMap =
                new HashMap<>();

        int cumulativeSum = 0;

        // Sum 0 exists before the first element
        // at index -1
        sumMap.put(-0, new ArrayList<>());
        sumMap.get(0).add(-1);

        System.out.println("Zero Sum Subarrays:");

        boolean found = false;

        // Traverse the array
        for (int i = 0; i < array.length; i++) {

            // Calculate cumulative sum
            cumulativeSum += array[i];

            // Check whether cumulative sum
            // has appeared before
            if (sumMap.containsKey(cumulativeSum)) {

                List<Integer> previousIndices =
                        sumMap.get(cumulativeSum);

                // Every previous occurrence gives
                // one zero-sum subarray
                for (int startIndex : previousIndices) {

                    System.out.print("[ ");

                    for (int j = startIndex + 1;
                         j <= i;
                         j++) {

                        System.out.print(
                                array[j] + " "
                        );
                    }

                    System.out.println("]");

                    found = true;
                }
            }

            // Store current index
            if (!sumMap.containsKey(cumulativeSum)) {

                sumMap.put(
                        cumulativeSum,
                        new ArrayList<>()
                );
            }

            sumMap.get(cumulativeSum).add(i);
        }

        if (!found) {
            System.out.println(
                    "No zero-sum subarrays found."
            );
        }
    }

    public static void main(String[] args) {

        // Input array
        int[] array = {
                6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7
        };

        System.out.println("Given Array:");

        for (int value : array) {
            System.out.print(value + " ");
        }

        System.out.println("\n");

        // Find zero-sum subarrays
        findZeroSumSubarrays(array);
    }
}
