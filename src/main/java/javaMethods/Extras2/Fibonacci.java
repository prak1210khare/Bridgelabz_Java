/*Fibonacci Sequence Generator:
○ Write a program that generates the Fibonacci sequence up to a specified number
of terms entered by the user.
○ Organize the code by creating a function that calculates and prints the Fibonacci
sequence.
Author: Prakhar Khare
Date: 30-09-2026
 */
package javaMethods.Extras2;
import java.util.Scanner;

public class Fibonacci {

    // Method to generate and print Fibonacci sequence
    public static void generateFibonacci(int numberOfTerms) {

        int first = 0;
        int second = 1;

        System.out.println("Fibonacci Sequence:");

        for (int i = 1; i <= numberOfTerms; i++) {

            System.out.print(first + " ");

            // Calculate the next term
            int next = first + second;

            // Move to the next two numbers
            first = second;
            second = next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take number of terms
        System.out.print("Enter number of terms: ");
        int numberOfTerms = input.nextInt();

        // Generate Fibonacci sequence
        generateFibonacci(numberOfTerms);

        input.close();
    }
}