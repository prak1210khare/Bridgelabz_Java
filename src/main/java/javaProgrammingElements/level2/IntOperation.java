/*Write an IntOperation program by taking a, b, and c as input values and print the following integer operations a + b *c, a * b + c, c + a / b, and a % b + c. Please also understand the precedence of the operators.
        Hint =>
        Create variables a, b, c of int data type.
        Take user input for a, b, and c.
        Compute 3 integer operations and assign result to a variable
        Finally print the result and try to understand operator precedence.
Auhtor: Prakhar Khare
Date: 21-09-2026
 */
package javaProgrammingElements.level2;
import java.util.Scanner;
public class IntOperation {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take user inputs
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        // Perform integer operations
        int operation1 = a + b * c;
        int operation2 = a * b + c;
        int operation3 = c + a / b;
        int operation4 = a % b + c;

        // Display results
        System.out.println(
                "The results of Int Operations are " +
                        operation1 + ", " +
                        operation2 + ", " +
                        operation3 + ", and " +
                        operation4
        );

        input.close();
    }

}
