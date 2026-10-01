/*Problem 2: Date Arithmetic Create a program that:
        ➢ Takes a date input and adds 7 days, 1 month, and 2 years to it.
➢ Then subtracts 3 weeks from the result.
Hint: Use LocalDate.plusDays(), plusMonths(), plusYears(), and
minusWeeks() methods.
Author: Prakhar Khare
Date: 30-09-2026
 */
package javaMethods.Extras1;
import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmetic {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take date input
        System.out.print("Enter date (yyyy-MM-dd): ");
        String dateInput = input.nextLine();

        // Convert String to LocalDate
        LocalDate date = LocalDate.parse(dateInput);

        // Add 7 days
        LocalDate after7Days = date.plusDays(7);

        // Add 1 month
        LocalDate after1Month = after7Days.plusMonths(1);

        // Add 2 years
        LocalDate after2Years = after1Month.plusYears(2);

        // Subtract 3 weeks
        LocalDate finalDate = after2Years.minusWeeks(3);

        // Display results
        System.out.println("Original Date = " + date);
        System.out.println("After adding 7 days = " + after7Days);
        System.out.println("After adding 1 month = " + after1Month);
        System.out.println("After adding 2 years = " + after2Years);
        System.out.println("After subtracting 3 weeks = " + finalDate);

        input.close();
    }
}
