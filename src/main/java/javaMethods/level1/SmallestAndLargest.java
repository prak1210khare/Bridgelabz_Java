/*Write a program to find the smallest and the largest of the 3 numbers.
Hint =>
Take user input for 3 numbers
Write a single method to find the smallest and largest of the three numbers
public static int[] findSmallestAndLargest(int number1, int number2, int number3)
Author: Prakhar Khare
Date: 24-09-2026
 */

package javaMethods.level1;
import java.util.Scanner;
public class SmallestAndLargest {

    // Method to find smallest and largest number
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int smallest = number1;
        int largest = number1;

        if (number2 < smallest) {
            smallest = number2;
        }

        if (number3 < smallest) {
            smallest = number3;
        }

        if (number2 > largest) {
            largest = number2;
        }

        if (number3 > largest) {
            largest = number3;
        }

        return new int[]{smallest, largest};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input for 3 numbers
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();

        // Find smallest and largest
        int[] result = findSmallestAndLargest(number1, number2, number3);

        // Display result
        System.out.println("Smallest number = " + result[0]);
        System.out.println("Largest number = " + result[1]);

        input.close();
    }
}
