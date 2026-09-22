/*Write a program to check if a number is divisible by 5
I/P => number
O/P => Is the number ___ divisible by 5? ___
Author: Prakhar Khare
Date: 22-09-2026
*/

package javaControlFlows.level1;
import java.util.Scanner;
public class DivisibleBy5 {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take number input
        int number = input.nextInt();

        // Check if the number is divisible by 5
        boolean isDivisible = number % 5 == 0;

        // Display result
        System.out.println(
                "Is the number " + number + " divisible by 5? " + isDivisible
        );

        // Close Scanner
        input.close();
    }
}
