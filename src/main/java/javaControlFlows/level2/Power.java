/*Create a program to find the power of a number.
Hint =>
Get integer input for two variables named number and power.
Create a result variable with an initial value of 1.
Run a for loop from i = 1 to i <= power.
In each iteration of the loop, multiply the result with the number and assign the value to the result.
Finally, print the result
Author: Prakhar Khare
Date: 22-09-2026
 */

package javaControlFlows.level2;
import java.util.Scanner;
public class Power {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take number and power as input
        int number = input.nextInt();
        int power = input.nextInt();

        // Initialize result
        int result = 1;

        // Calculate power using for loop
        for (int i = 1; i <= power; i++) {
            result = result * number;
        }

        // Display result
        System.out.println(
                "The result of " + number + " raised to the power "
                        + power + " is " + result
        );

        // Close Scanner
        input.close();
    }
}
