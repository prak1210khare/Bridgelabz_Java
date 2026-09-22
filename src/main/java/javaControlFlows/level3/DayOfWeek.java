/*Write a program DayOfWeek that takes a date as input and prints the day of the week that the date falls on. Your program should take three command-line arguments: m (month), d (day), and y (year). For m use 1 for January, 2 for February, and so forth. For output print 0 for Sunday, 1 for Monday, 2 for Tuesday, and so forth. Use the following formulas, for the Gregorian calendar (where / denotes integer division):
y0 = y − (14 − m) / 12
x = y0 + y0/4 − y0/100 + y0/400
m0 = m + 12 × ((14 − m) / 12) − 2
d0 = (d + x + 31m0 / 12) mod 7
Auhtor: Prakhar Khare
Date: 22-09-2026
 */
package javaControlFlows.level3;
import java.util.Scanner;
public class DayOfWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take month, day, and year as input
        int month = input.nextInt();
        int day = input.nextInt();
        int year = input.nextInt();

        // Calculate y0
        int y0 = year - (14 - month) / 12;

        // Calculate x
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;

        // Calculate m0
        int m0 = month + 12 * ((14 - month) / 12) - 2;

        // Calculate day of the week
        int d0 = (day + x + 31 * m0 / 12) % 7;

        // Display result
        System.out.println(d0);

        input.close();
    }
}
