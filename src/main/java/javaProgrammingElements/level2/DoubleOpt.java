/*Similarly, write the DoubleOpt program by taking double values
and doing the same operations.
Author: Prakhar Khare
Date: 21-09-2026
 */

package javaProgrammingElements.level2;
import java.util.Scanner;
public class DoubleOpt {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take user inputs
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        // Perform double operations
        double operation1 = a + b * c;
        double operation2 = a * b + c;
        double operation3 = c + a / b;
        double operation4 = a % b + c;

        // Display results
        System.out.println(
                "The results of Double Operations are " +
                        operation1 + ", " +
                        operation2 + ", " +
                        operation3 + ", and " +
                        operation4
        );

        input.close();
    }
}
