/*Create a program to divide N number of chocolates among M children.
        Hint =>
        Get an integer value from user for the numberOfchocolates and numberOfChildren.
        Find the number of chocolates each child gets and number of remaining chocolates
        Display the results
Author: Prakhar Khare
Date: 21-09-2026
 */
package javaProgrammingElements.level2;
import java.util.Scanner;
public class DivideChocolates {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take user inputs
        int numberOfChocolates = input.nextInt();
        int numberOfChildren = input.nextInt();

        // Calculate chocolates each child gets
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;

        // Calculate remaining chocolates
        int remainingChocolates = numberOfChocolates % numberOfChildren;

        // Display results
        System.out.println(
                "The number of chocolates each child gets is "
                        + chocolatesPerChild
                        + " and the number of remaining chocolates are "
                        + remainingChocolates
        );

        // Close Scanner
        input.close();
    }
}
