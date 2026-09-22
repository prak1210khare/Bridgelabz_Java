/*Rewrite program 1 to determine Leap Year with single
if condition using logical and && and or || operators
Author: Prakhar Khare
Date: 22-09-26
 */

package javaControlFlows.level2;
import java.util.Scanner;
public class LeapYear1 {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take year input
        int year = input.nextInt();

        // Check Leap Year using single if condition
        if (year >= 1582 &&
                (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {

            System.out.println("The year " + year + " is a Leap Year.");

        } else {
            System.out.println("The year " + year + " is not a Leap Year.");
        }

        // Close Scanner
        input.close();
    }
}
