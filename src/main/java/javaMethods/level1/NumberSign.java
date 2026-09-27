/*Write a program to check whether a number is positive, negative, or zero.
        Hint => Get integer input from the user. Write a Method to return -1 for negative number, 1 for positive number and 0 if number is zero
Author: Prakhar Khare
Date: 23-09-2026
 */

package javaMethods.level1;
import java.util.Scanner;
public class NumberSign {
    // Method to return -1 for negative, 1 for positive, and 0 for zero
    public static int checkNumber(int number) {
        if (number < 0) {
            return -1;
        } else if (number > 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get integer input
        int number = input.nextInt();

        // Check the number
        int result = checkNumber(number);

        // Display result
        if (result == 1) {
            System.out.println("The number " + number + " is positive.");
        } else if (result == -1) {
            System.out.println("The number " + number + " is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        input.close();
    }
}
