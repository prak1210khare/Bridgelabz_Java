/*Level 2 Practice Programs
Write a LeapYear program that takes a year as input and outputs the Year is a Leap Year or not a Leap Year.
        Hint =>
The LeapYear program only works for year >= 1582, corresponding to a year in the Gregorian calendar. So ensure to check for the same.
Further, the Leap Year is a Year divisible by 4 and not 100 unless it is divisible by 400. E.g. 1800 is not a Leap Year and 2000 is a Leap Year.
Write code having multiple if else statements based on conditions provided above and a second part having only one if statement and multiple logical
Author: Prakhar Khare
Date: 22-09-2026
 */

package javaControlFlows.level2;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take year input
        int year = input.nextInt();

        // Part 1: Using multiple if-else statements
        if (year < 1582) {
            System.out.println("The year " + year + " is not valid for the Gregorian calendar.");
        } else if (year % 400 == 0) {
            System.out.println("The year " + year + " is a Leap Year.");
        } else if (year % 100 == 0) {
            System.out.println("The year " + year + " is not a Leap Year.");
        } else if (year % 4 == 0) {
            System.out.println("The year " + year + " is a Leap Year.");
        } else {
            System.out.println("The year " + year + " is not a Leap Year.");
        }

        // Part 2: Using one if statement with logical operators
        if (year >= 1582) {
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                System.out.println("Using logical operators: Leap Year");
            } else {
                System.out.println("Using logical operators: Not a Leap Year");
            }
        }

        // Close Scanner
        input.close();
    }
}
