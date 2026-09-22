/*Create a program to find the bonus of employees based on their years of service.
        Hint =>
        Zara decided to give a bonus of 5% to employees whose year of service is more than 5 years.
        Take salary and year of service in the year as input.
        Print the bonus amount.
Author: Prakhar Khare
Date: 22-09-2026
 */

package javaControlFlows.level1;
import java.util.Scanner;
public class EmployeeBonus {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take salary and years of service as input
        double salary = input.nextDouble();
        int yearsOfService = input.nextInt();

        // Initialize bonus
        double bonus = 0;

        // Check if employee is eligible for bonus
        if (yearsOfService > 5) {
            bonus = salary * 5 / 100;
        }

        // Display bonus amount
        System.out.println("The bonus amount is " + bonus);

        // Close Scanner
        input.close();
    }
}
