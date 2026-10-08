/*Sliding Window Maximum
Problem: Given an array and a window size k, find the maximum element in each sliding window of size k.
Hint: Use a deque (double-ended queue) to maintain indices of useful elements in each window.
Author: Prakhar Khare
Date: 6-10-2026
 */
package StacksQueuesHashMaps.StacksandQueues;
import java.util.ArrayDeque;
import java.util.Deque;

// Main class
public class SlidingWindowMaximum {

    // Method to find maximum element in each window
    public static int[] findMaximum(int[] array, int k) {

        int n = array.length;

        // Number of windows
        int[] result = new int[n - k + 1];

        // Deque stores indices
        Deque<Integer> deque = new ArrayDeque<>();

        int resultIndex = 0;

        // Traverse the array
        for (int i = 0; i < n; i++) {

            // Remove indices that are outside
            // the current window
            while (!deque.isEmpty()
                    && deque.peekFirst() <= i - k) {

                deque.removeFirst();
            }

            // Remove elements from the back
            // that are smaller than current element
            while (!deque.isEmpty()
                    && array[deque.peekLast()] <= array[i]) {

                deque.removeLast();
            }

            // Add current index to deque
            deque.addLast(i);

            // Start storing results when
            // the first complete window is formed
            if (i >= k - 1) {

                result[resultIndex] =
                        array[deque.peekFirst()];

                resultIndex++;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        // Input array
        int[] array = {
                1, 3, -1, -3, 5, 3, 6, 7
        };

        // Window size
        int k = 3;

        // Find maximum values
        int[] result =
                findMaximum(array, k);

        System.out.println(
                "Array: "
        );

        for (int value : array) {
            System.out.print(value + " ");
        }

        System.out.println();

        System.out.println(
                "Window Size: " + k
        );

        System.out.println(
                "Maximum of each window:"
        );

        for (int value : result) {
            System.out.print(value + " ");
        }

        System.out.println();
    }
}
