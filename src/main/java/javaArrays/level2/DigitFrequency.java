/*Create a program to take a number as input find the frequency of each digit in the number using an array and display the frequency of each digit
Hint =>
Take the input for a number
Find the count of digits in the number
Find the digits in the number and save them in an array
Find the frequency of each digit in the number. For this define a frequency array of size 10, Loop through the digits array, and increase the frequency of each digit
Display the frequency of each digit in the number
Author: Prakhar Khare
Date: 22-09-2026
 */


package javaArrays.level2;
import java.util.Scanner;
public class DigitFrequency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take number input
        int number = input.nextInt();

        // Find the count of digits
        int tempNumber = number;
        int digitCount = 0;

        while (tempNumber != 0) {
            digitCount++;
            tempNumber = tempNumber / 10;
        }

        // Create an array to store the digits
        int[] digits = new int[digitCount];

        // Store the digits in the array
        tempNumber = number;

        for (int i = 0; i < digitCount; i++) {
            digits[i] = tempNumber % 10;
            tempNumber = tempNumber / 10;
        }

        // Create frequency array for digits 0 to 9
        int[] frequency = new int[10];

        // Find frequency of each digit
        for (int i = 0; i < digitCount; i++) {
            int digit = digits[i];
            frequency[digit]++;
        }

        // Display frequency of each digit
        System.out.println("Frequency of each digit:");

        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println(i + " occurs " + frequency[i] + " time(s)");
            }
        }

        input.close();
    }
}
