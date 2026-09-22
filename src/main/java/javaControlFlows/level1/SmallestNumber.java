/*Write a program to check
 if the first is the smallest of the 3 numbers.
 Author: Prakhar Khare
 Date: 22-09-2026
 */
package javaControlFlows.level1;
import java.util.Scanner;
public class SmallestNumber {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take user inputs
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();

        // Check if the first number is the smallest
        boolean isFirstSmallest = number1 < number2 && number1 < number3;

        // Display result
        System.out.println(
                "Is the first number the smallest? " + isFirstSmallest
        );

        // Close Scanner
        input.close();
    }
}
