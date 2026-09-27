/*Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods
Hint =>
Method to find factors of a number and return them as an array. Note there are 2 for loops one for the count and another for finding the factor and storing in the array
Method to find the greates factor of a Number using the factors array
Method to find the sum of the factors using factors array and return the sum
Method to find the product of the factors using factors array and return the product
Method to find product of cube of the factors using the factors array. Use Math.pow()
Method to Check if a number is a perfect number. Perfect numbers are positive integers that are equal to the sum of their proper divisors
Method to find the number is a abundant number. A number is called an abundant number if the sum of its proper divisors is greater than the number itself
Method to find the number is a deficient number. A number is called a deficient number if the sum of its proper divisors is less than the number itself
Method to Check if a number is a strong number. A number is called a strong number if the sum of the factorial of its digits is equal to the number itself
Author: Prakhar Khare
Date: 25-09-2026
 */

package javaMethods.level3;
import java.util.Scanner;
public class NumberCheck5 {
    // Method to find factors and store them in an array
    public static int[] findFactors(int number) {

        // First loop to count the number of factors
        int count = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // Create array based on the number of factors
        int[] factors = new int[count];

        // Second loop to find and store the factors
        int index = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }

        return factors;
    }

    // Method to find the greatest factor
    public static int findGreatestFactor(int[] factors) {
        return factors[factors.length - 1];
    }

    // Method to find the sum of factors
    public static int findSumOfFactors(int[] factors) {
        int sum = 0;

        for (int factor : factors) {
            sum = sum + factor;
        }

        return sum;
    }

    // Method to find the product of factors
    public static long findProductOfFactors(int[] factors) {
        long product = 1;

        for (int factor : factors) {
            product = product * factor;
        }

        return product;
    }

    // Method to find the product of cube of factors
    public static double findProductOfCubeOfFactors(int[] factors) {
        double product = 1;

        for (int factor : factors) {
            product = product * Math.pow(factor, 3);
        }

        return product;
    }

    // Method to check if a number is a Perfect Number
    public static boolean isPerfectNumber(int number, int[] factors) {
        int sum = 0;

        for (int factor : factors) {
            if (factor != number) {
                sum = sum + factor;
            }
        }

        return sum == number;
    }

    // Method to check if a number is an Abundant Number
    public static boolean isAbundantNumber(int number, int[] factors) {
        int sum = 0;

        for (int factor : factors) {
            if (factor != number) {
                sum = sum + factor;
            }
        }

        return sum > number;
    }

    // Method to check if a number is a Deficient Number
    public static boolean isDeficientNumber(int number, int[] factors) {
        int sum = 0;

        for (int factor : factors) {
            if (factor != number) {
                sum = sum + factor;
            }
        }

        return sum < number;
    }

    // Method to calculate factorial of a digit
    public static int factorial(int number) {
        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }

        return factorial;
    }

    // Method to check if a number is a Strong Number
    public static boolean isStrongNumber(int number) {
        int originalNumber = number;
        int sum = 0;

        while (number != 0) {
            int digit = number % 10;
            sum = sum + factorial(digit);
            number = number / 10;
        }

        return sum == originalNumber;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take number input
        int number = input.nextInt();

        // Find factors
        int[] factors = findFactors(number);

        // Display factors
        System.out.print("Factors of " + number + " are: ");

        for (int factor : factors) {
            System.out.print(factor + " ");
        }

        System.out.println();

        // Find greatest factor
        int greatestFactor = findGreatestFactor(factors);

        // Find sum of factors
        int sumOfFactors = findSumOfFactors(factors);

        // Find product of factors
        long productOfFactors = findProductOfFactors(factors);

        // Find product of cube of factors
        double productOfCube = findProductOfCubeOfFactors(factors);

        // Check Perfect Number
        boolean perfectNumber = isPerfectNumber(number, factors);

        // Check Abundant Number
        boolean abundantNumber = isAbundantNumber(number, factors);

        // Check Deficient Number
        boolean deficientNumber = isDeficientNumber(number, factors);

        // Check Strong Number
        boolean strongNumber = isStrongNumber(number);

        // Display results
        System.out.println("Greatest Factor = " + greatestFactor);
        System.out.println("Sum of Factors = " + sumOfFactors);
        System.out.println("Product of Factors = " + productOfFactors);
        System.out.println("Product of Cube of Factors = " + productOfCube);
        System.out.println("Is Perfect Number? " + perfectNumber);
        System.out.println("Is Abundant Number? " + abundantNumber);
        System.out.println("Is Deficient Number? " + deficientNumber);
        System.out.println("Is Strong Number? " + strongNumber);

        input.close();
    }
}
