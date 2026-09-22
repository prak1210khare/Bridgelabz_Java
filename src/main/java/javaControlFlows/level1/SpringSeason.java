/*Write a program SpringSeason that takes two int values month and day from the command line and prints “Its a Spring Season” otherwise prints “Not a Spring Season”.
        Hint =>
        Spring Season is from March 20 to June 20
Author: Prakhar Khare
Date: 22-09-2026
 */
package javaControlFlows.level1;
import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take month and day as input
        int month = input.nextInt();
        int day = input.nextInt();

        // Check whether the date is in Spring Season
        boolean isSpringSeason =
                (month == 3 && day >= 20) ||
                        (month == 4) ||
                        (month == 5) ||
                        (month == 6 && day <= 20);

        // Display result
        if (isSpringSeason) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }

        // Close Scanner
        input.close();
    }
}