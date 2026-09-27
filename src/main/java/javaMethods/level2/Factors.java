/*Create a program to find the factors of a number taken as user input, store the factors in an array and display the factors. Also find the sum, sum of square of factors and product of the factors and display the results
Hint =>
Take the input for a number
Write a static Method to find the factors of the number and save them in an array and return the array.
To find factors and save to array will have two loops. The first loop to find the count and initialize the array with the count. And the second loop save the factors into the array
Write a method to find the sum of the factors using factors array
Write a method to find the product of the factors using factors array
Write a method to find the sum of square of the factors using Math.pow() method
Author: Prakhar Khare
Date: 25-09-2026
 */

package javaMethods.level2;

import java.util.Scanner;

public class Factors {
    // Method to find factors and store them in an array
    public static int[] findFactors(int number) {

        // First loop to count the factors
        int count = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // Create array with exact factor count
        int[] factors = new int[count];

        // Second loop to store factors
        int index = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }

        return factors;
    }

    // Method to find sum of factors
    public static int findSum(int[] factors) {
        int sum = 0;

        for (int factor : factors) {
            sum = sum + factor;
        }

        return sum;
    }

    // Method to find product of factors
    public static long findProduct(int[] factors) {
        long product = 1;

        for (int factor : factors) {
            product = product * factor;
        }

        return product;
    }

    // Method to find sum of squares of factors
    public static double findSumOfSquares(int[] factors) {
        double sum = 0;

        for (int factor : factors) {
            sum = sum + Math.pow(factor, 2);
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input
        int number = input.nextInt();

        // Find factors
        int[] factors = findFactors(number);

        // Display factors
        System.out.println("Factors of " + number + " are:");

        for (int factor : factors) {
            System.out.print(factor + " ");
        }

        System.out.println();

        // Calculate sum
        int sum = findSum(factors);

        // Calculate product
        long product = findProduct(factors);

        // Calculate sum of squares
        double sumOfSquares = findSumOfSquares(factors);

        // Display results
        System.out.println("Sum of factors = " + sum);
        System.out.println("Product of factors = " + product);
        System.out.println("Sum of squares of factors = " + sumOfSquares);

        input.close();
    }
}
