/*Maximum of Three Numbers:
○ Write a program that takes three integer inputs from the user and finds the
        maximum of the three numbers. ○ Ensure your program follows best practices for organizing code into modular
        functions, such as separate functions for taking input and calculating the
        maximum value.
Auhtor: Prakhar Khare
Date: 30-09-2026
 */
package javaMethods.Extras2;
import java.util.Scanner;

public class MaxOfThreeNumbers {

    // Method to take three integer inputs
    public static int[] takeInput(Scanner input) {

        int[] numbers = new int[3];

        System.out.print("Enter three numbers: ");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        return numbers;
    }

    // Method to find the maximum number
    public static int findMaximum(int[] numbers) {

        int maximum = numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] > maximum) {
                maximum = numbers[i];
            }
        }

        return maximum;
    }

    // Method to display the result
    public static void displayResult(int maximum) {
        System.out.println("The maximum number is: " + maximum);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take input
        int[] numbers = takeInput(input);

        // Find maximum
        int maximum = findMaximum(numbers);

        // Display result
        displayResult(maximum);

        input.close();
    }
}