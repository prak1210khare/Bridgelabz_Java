/*Two Sum Problem
Problem: Given an array and a target sum, find two indices such that their values add up to the target.
Hint: Use a hash map to store the index of each element as you iterate. Check if target - current_element exists in the map.
Author: Prakhar Khare
Date: 8-10-2026
 */

package StacksQueuesHashMaps.HashMapsandHashFunctions;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    // Method to find two indices whose values
    // add up to the target
    public static int[] findTwoSum(
            int[] array, int target) {

        // Store number and its index
        Map<Integer, Integer> numberMap =
                new HashMap<>();

        // Traverse the array
        for (int i = 0; i < array.length; i++) {

            int currentElement = array[i];

            // Find the required number
            int requiredNumber =
                    target - currentElement;

            // Check if required number already exists
            if (numberMap.containsKey(requiredNumber)) {

                int previousIndex =
                        numberMap.get(requiredNumber);

                return new int[] {
                        previousIndex, i
                };
            }

            // Store current element and its index
            numberMap.put(currentElement, i);
        }

        // No pair found
        return new int[] {
                -1, -1
        };
    }

    public static void main(String[] args) {

        // Input array
        int[] array = {
                2, 7, 11, 15
        };

        // Target sum
        int target = 9;

        // Find the two indices
        int[] result =
                findTwoSum(array, target);

        if (result[0] != -1) {

            System.out.println(
                    "Indices: "
                            + result[0]
                            + " and "
                            + result[1]
            );

            System.out.println(
                    "Values: "
                            + array[result[0]]
                            + " + "
                            + array[result[1]]
                            + " = "
                            + target
            );

        } else {

            System.out.println(
                    "No two elements found."
            );
        }
    }
}
