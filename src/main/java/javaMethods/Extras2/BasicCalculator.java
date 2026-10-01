/*Basic Calculator:
Write a program that performs basic mathematical operations (addition,
                                                                       subtraction, multiplication, division) based on user input.
Each operation should be performed in its own function, and the program should
prompt the user to choose which operation to perform.
Author: Prakhar Khare
Date: 30-09-2026
 */
package javaMethods.Extras2;
import java.util.Scanner;

public class BasicCalculator {

    // Method for addition
    public static double add(double number1, double number2) {
        return number1 + number2;
    }

    // Method for subtraction
    public static double subtract(double number1, double number2) {
        return number1 - number2;
    }

    // Method for multiplication
    public static double multiply(double number1, double number2) {
        return number1 * number2;
    }

    // Method for division
    public static double divide(double number1, double number2) {
        return number1 / number2;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take two numbers
        System.out.print("Enter first number: ");
        double number1 = input.nextDouble();

        System.out.print("Enter second number: ");
        double number2 = input.nextDouble();

        // Display operation menu
        System.out.println("Choose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Enter your choice: ");
        int choice = input.nextInt();

        double result;

        // Perform selected operation
        switch (choice) {

            case 1:
                result = add(number1, number2);
                System.out.println("Result = " + result);
                break;

            case 2:
                result = subtract(number1, number2);
                System.out.println("Result = " + result);
                break;

            case 3:
                result = multiply(number1, number2);
                System.out.println("Result = " + result);
                break;

            case 4:
                if (number2 == 0) {
                    System.out.println("Cannot divide by zero.");
                } else {
                    result = divide(number1, number2);
                    System.out.println("Result = " + result);
                }
                break;

            default:
                System.out.println("Invalid choice.");
        }

        input.close();
    }
}
