/*Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods
Hint =>
Method to Find the count of digits in the number
Method to Store the digits of the number in a digits array
Method to Check if a number is a duck number using the digits array. A duck number is a number that has a non-zero digit present in it
Method to check if the number is a armstrong number using the digits array. ​​Armstrong number is a number that is equal to the sum of its own digits raised to the power of the number of digits. Eg: 153 = 1^3 + 5^3 + 3^3
Method to find the largest and second largest elements in the digits array. Use Integer.MIN_VALUE to initialize the variable.
Method to find the the smallest and second smallest elements in the digits array. Use Integer.MAX_VALUE to initialize the variable.
Author: Prakhar Khare
Date: 25-09-2026
 */

package javaMethods.level3;
import java.util.Scanner;
public class NumberChecker {
    // Method to find the count of digits
    public static int countDigits(int number) {
        int count = 0;

        if (number == 0) {
            return 1;
        }

        while (number != 0) {
            number = number / 10;
            count++;
        }

        return count;
    }

    // Method to store the digits in an array
    public static int[] storeDigits(int number) {
        int digitCount = countDigits(number);
        int[] digits = new int[digitCount];

        int index = digitCount - 1;

        if (number == 0) {
            digits[0] = 0;
            return digits;
        }

        while (number != 0) {
            digits[index] = number % 10;
            number = number / 10;
            index--;
        }

        return digits;
    }

    // Method to check whether the number is a Duck Number
    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit == 0) {
                return true;
            }
        }

        return false;
    }

    // Method to check whether the number is an Armstrong Number
    public static boolean isArmstrongNumber(int number, int[] digits) {
        int sum = 0;
        int numberOfDigits = digits.length;

        for (int digit : digits) {
            sum = sum + (int) Math.pow(digit, numberOfDigits);
        }

        return sum == number;
    }

    // Method to find largest and second largest digits
    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }

        return new int[]{largest, secondLargest};
    }

    // Method to find smallest and second smallest digits
    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }

        return new int[]{smallest, secondSmallest};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take number input
        int number = input.nextInt();

        // Find number of digits
        int digitCount = countDigits(number);

        // Store digits in an array
        int[] digits = storeDigits(number);

        // Check Duck Number
        boolean duckNumber = isDuckNumber(digits);

        // Check Armstrong Number
        boolean armstrongNumber = isArmstrongNumber(number, digits);

        // Find largest and second largest
        int[] largestValues = findLargestAndSecondLargest(digits);

        // Find smallest and second smallest
        int[] smallestValues = findSmallestAndSecondSmallest(digits);

        // Display results
        System.out.println("Number of digits = " + digitCount);

        System.out.print("Digits = ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
        System.out.println();

        System.out.println("Is Duck Number? " + duckNumber);
        System.out.println("Is Armstrong Number? " + armstrongNumber);

        System.out.println("Largest digit = " + largestValues[0]);
        System.out.println("Second largest digit = " + largestValues[1]);

        System.out.println("Smallest digit = " + smallestValues[0]);
        System.out.println("Second smallest digit = " + smallestValues[1]);

        input.close();
    }
}
