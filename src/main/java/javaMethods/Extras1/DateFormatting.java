/*Problem 3: Date Formatting Write a program that:
        ➢ Displays the current date in three different formats:
        ■ dd/MM/yyyy
        ■ yyyy-MM-dd
        ■ EEE, MMM dd, yyyy

        Hint: Use DateTimeFormatter with custom patterns for date formatting.
Auhtor: Prakhar Khare
Date: 30-09-2026
 */
package javaMethods.Extras1;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatting {

    public static void main(String[] args) {

        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Create formatters
        DateTimeFormatter format1 =
                DateTimeFormatter.ofPattern("dd/MM/yyyy");

        DateTimeFormatter format2 =
                DateTimeFormatter.ofPattern("yyyy-MM-dd");

        DateTimeFormatter format3 =
                DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        // Format the current date
        String date1 = currentDate.format(format1);
        String date2 = currentDate.format(format2);
        String date3 = currentDate.format(format3);

        // Display the dates
        System.out.println("Format 1: " + date1);
        System.out.println("Format 2: " + date2);
        System.out.println("Format 3: " + date3);
    }
}
