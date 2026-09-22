/*Create a program to find the multiplication table of a number entered by the user from 6 to 9.
        Hint =>
        Take integer input and store it in the variable number
        Using a for loop, find the multiplication table of number from 6 to 9 and print it in the format number * i = ___
Auhtor: Prakhar Khare
Date: 22-09-2026
 */

package javaControlFlows.level1;
import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take number input
        int number = input.nextInt();

        // Print multiplication table from 6 to 9
        for (int i = 6; i <= 9; i++) {
            int result = number * i;

            // Display result
            System.out.println(number + " * " + i + " = " + result);
        }

        // Close Scanner
        input.close();
    }
}
