/*Problem 4: Date Comparison Write a program that:
        ➢ Takes two date inputs and compares them to check if the first date is before, after,
or the same as the second date.
        Hint: Use isBefore(), isAfter(), and isEqual() methods from the LocalDate
Author: Prakhar Khare
Date: 30-09-2026
 */
package javaMethods.Extras1;
import java.time.LocalDate;
import java.util.Scanner;

public class DateComparison {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take two date inputs
        System.out.print("Enter first date (yyyy-MM-dd): ");
        String firstDateInput = input.nextLine();

        System.out.print("Enter second date (yyyy-MM-dd): ");
        String secondDateInput = input.nextLine();

        // Convert String to LocalDate
        LocalDate firstDate = LocalDate.parse(firstDateInput.trim());
        LocalDate secondDate = LocalDate.parse(secondDateInput.trim());

        // Compare the dates
        if (firstDate.isBefore(secondDate)) {
            System.out.println("The first date is before the second date.");
        } else if (firstDate.isAfter(secondDate)) {
            System.out.println("The first date is after the second date.");
        } else if (firstDate.isEqual(secondDate)) {
            System.out.println("Both dates are the same.");
        }

        input.close();
    }
}
