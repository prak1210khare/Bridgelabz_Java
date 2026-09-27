/*Create a program to divide N number of chocolates among M children. Print the number of chocolates each child will get and also the remaining chocolates
Hint =>
Get an integer value from user for the numberOfchocolates and numberOfChildren.
Write the method to find the number of chocolates each child gets and number of remaining chocolates
public static int[] findRemainderAndQuotient(int number, int divisor)
Auhtor: Prakhar Khare
Date: 24-09-2026
 */
package javaMethods.level1;
import java.util.Scanner;
public class DivideChocolates {
    // Method to find chocolates per child and remaining chocolates
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;

        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get number of chocolates and children
        int numberOfChocolates = input.nextInt();
        int numberOfChildren = input.nextInt();

        // Find chocolates per child and remaining chocolates
        int[] result = findRemainderAndQuotient(
                numberOfChocolates, numberOfChildren
        );

        // Display result
        System.out.println("Chocolates each child gets = " + result[0]);
        System.out.println("Remaining Chocolates = " + result[1]);

        input.close();
    }
}
