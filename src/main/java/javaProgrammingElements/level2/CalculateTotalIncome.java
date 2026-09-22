/*Create a program to find the total income of a person by taking salary and bonus from user
        Hint =>
        Create a variable named salary and take user input.
        Create another variable bonus and take user input.
        Compute income by adding salary and bonus and print the result
Auhtor: Prakhar Khare
Date: 21-09-2026
 */
package javaProgrammingElements.level2;
import java.util.Scanner;
public class CalculateTotalIncome {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take user inputs
        double salary = input.nextDouble();
        double bonus = input.nextDouble();

        // Calculate total income
        double totalIncome = salary + bonus;

        // Display result
        System.out.println(
                "The salary is INR " + salary +
                        " and bonus is INR " + bonus +
                        ". Hence Total Income is INR " + totalIncome
        );

        input.close();
    }

}
