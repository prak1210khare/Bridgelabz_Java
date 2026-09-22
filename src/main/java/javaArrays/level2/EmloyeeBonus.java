/*Create a program to find the bonus of 10 employees based on their years of service and the total bonus amount the company Zara has to pay, along with the old and new salary.
        Hint =>
Zara decides to give a bonus of 5% to employees whose year of service is more than 5 years or 2% if less than 5 years
Define a double array to save salary and years of service for each of the 10 employees
Also define a double array to save the new salary and the bonus amount as well as variables to save the total bonus, total old salary, and new salary
Define a loop to take input from the user. If salary or year of service is an invalid number then ask the use to enter again. Note in this case you will have to decrement the index counter
Define another loop to calculate the bonus of 10 employees based on their years of service. Save the bonus in the array, compute the new salary, and save in the array. Also, the total bonus and total old and new salary can be calculated in the loop
Print the total bonus payout as well as the total old and new salary of all the employees
Author: Prakhar Khare
Date: 22-09-2026
 */

package javaArrays.level2;
import java.util.Scanner;
public class EmloyeeBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create arrays to store salary and years of service
        double[] salary = new double[10];
        double[] yearsOfService = new double[10];

        // Create arrays to store bonus and new salary
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        // Variables to store total salary and bonus
        double totalOldSalary = 0.0;
        double totalBonus = 0.0;
        double totalNewSalary = 0.0;

        // Take input for 10 employees
        for (int i = 0; i < 10; i++) {
            double employeeSalary = input.nextDouble();
            double employeeYears = input.nextDouble();

            // Check for invalid input
            if (employeeSalary <= 0 || employeeYears < 0) {
                System.out.println("Invalid input. Please enter salary and years of service again.");
                i--;
                continue;
            }

            salary[i] = employeeSalary;
            yearsOfService[i] = employeeYears;
        }

        // Calculate bonus and new salary
        for (int i = 0; i < 10; i++) {

            // Employees with more than 5 years get 5% bonus
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 5 / 100;
            } else {
                // Employees with 5 years or less get 2% bonus
                bonus[i] = salary[i] * 2 / 100;
            }

            // Calculate new salary
            newSalary[i] = salary[i] + bonus[i];

            // Calculate totals
            totalOldSalary = totalOldSalary + salary[i];
            totalBonus = totalBonus + bonus[i];
            totalNewSalary = totalNewSalary + newSalary[i];
        }

        // Display results
        System.out.println("Total Old Salary = " + totalOldSalary);
        System.out.println("Total Bonus Payout = " + totalBonus);
        System.out.println("Total New Salary = " + totalNewSalary);

        input.close();
    }
}
