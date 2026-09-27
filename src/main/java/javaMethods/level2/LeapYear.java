/*Write a program that takes a year as input and outputs the Year is a Leap Year or not
Hint =>
The LeapYear program only works for year >= 1582, corresponding to a year in the Gregorian calendar.
Also Leap year is divisible by 4 and not divisible by 100 or divisible by 400
Write a method to check for Leap Year using the conditions a and b
Author: Prakhar Khare
Date: 25-09-2026
 */

package javaMethods.level2;
import java.util.Scanner;
public class LeapYear {
    // Method to check whether the year is a Leap Year
    public static boolean isLeapYear(int year) {
        return year >= 1582 &&
                (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get year from user
        int year = input.nextInt();

        // Check Leap Year
        boolean leapYear = isLeapYear(year);

        // Display result
        if (leapYear) {
            System.out.println("The year " + year + " is a Leap Year.");
        } else {
            System.out.println("The year " + year + " is not a Leap Year.");
        }

        input.close();
    }
}
