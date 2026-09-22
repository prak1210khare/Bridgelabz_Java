/*Create a program to find all the multiple of a number taken as user input below 100.
Hint =>
Get input value for a variable named number.
Run a for loop backward: from i = 100 to i = 1.
Inside the loop, check if i perfectly divide the number.
        If true, print the number and continue the loop.
Author: Prakhar Khare
Date: 22-09-2026
 */
package javaControlFlows.level2;
import java.util.Scanner;
public class Multiples {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take number input
        int number = input.nextInt();

        // Find multiples below 100
        for (int i = 100; i >= 1; i--) {

            // Check if i is divisible by the given number
            if (i % number == 0) {
                System.out.println(i);
                continue;
            }
        }

        // Close Scanner
        input.close();
    }

}
