/*Write a program to create a calculator using switch...case.
Hint =>
Create two double variables named first and second and a String variable named op.
Get input values for all variables.
The input for the operator can only be one of the four values: "+", "-", "*" or "/".
Run a for loop from i = 1 to i < number.
Based on the input value of the op, perform specific operations using the switch...case statement and print the result.
If op is +, perform addition between first and second; if it is -, perform subtraction and so on.
If op is neither of those 4 values, print Invalid Operator.
Author: Prakhar Khare
Date: 22-09-2026
 */

package javaControlFlows.level3;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create variables
        double first;
        double second;
        String op;

        // Get input values
        first = input.nextDouble();
        second = input.nextDouble();
        op = input.next();

        // Perform operation using switch-case
        switch (op) {
            case "+":
                System.out.println("Result = " + (first + second));
                break;

            case "-":
                System.out.println("Result = " + (first - second));
                break;

            case "*":
                System.out.println("Result = " + (first * second));
                break;

            case "/":
                if (second != 0) {
                    System.out.println("Result = " + (first / second));
                } else {
                    System.out.println("Cannot divide by zero.");
                }
                break;

            default:
                System.out.println("Invalid Operator");
        }

        input.close();
    }
}
