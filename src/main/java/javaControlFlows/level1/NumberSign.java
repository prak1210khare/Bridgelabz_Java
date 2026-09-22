/*Write a program to check whether a number is positive, negative, or zero.
        Hint =>
        Get integer input from the user and store it in the number variable.
        If the number is positive, print positive.
        If the number is negative, print negative.
        If the number is zero, print zero.
Author: Prakhar Khare
Date: 22-09-2026
 */
package javaControlFlows.level1;
import java.util.Scanner;
public class NumberSign {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take number input
        int number = input.nextInt();

        // Check whether the number is positive, negative, or zero
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        // Close Scanner
        input.close();
    }}
