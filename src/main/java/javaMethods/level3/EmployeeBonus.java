/*Create a program to find the bonus of 10 employees based on their years of service as well as the total bonus amount the 10-year-old company Zara has to pay as a bonus, along with the old and new salary.
        Hint =>
Zara decides to give a bonus of 5% to employees whose year of service is more than 5 years or 2% if less than 5 years
Create a Method to determine the Salary and years of service and return the same. Use the Math.random() method to determine the 5-digit salary for each employee and also use the random method to determine the years of service. Define 2D Array to save the salary and years of service.
Write a Method to calculate the new salary and bonus based on the logic defined above and return the new 2D Array of the latest salary and bonus amount
Write a Method to Calculate the sum of the Old Salary, the Sum of the New Salary, and the Total Bonus Amount and display it in a Tabular Format

 */

package javaMethods.level3;

public class EmployeeBonus {
    // Method to generate salary and years of service
    public static double[][] generateEmployeeData() {

        double[][] employeeData = new double[10][2];

        for (int i = 0; i < employeeData.length; i++) {

            // Generate 5-digit salary between 10000 and 99999
            employeeData[i][0] = (int) (Math.random() * 90000) + 10000;

            // Generate years of service between 1 and 10
            employeeData[i][1] = (int) (Math.random() * 10) + 1;
        }

        return employeeData;
    }

    // Method to calculate new salary and bonus
    public static double[][] calculateBonus(double[][] employeeData) {

        double[][] bonusData = new double[10][2];

        for (int i = 0; i < employeeData.length; i++) {

            double oldSalary = employeeData[i][0];
            double yearsOfService = employeeData[i][1];

            double bonusPercentage;

            // Calculate bonus percentage
            if (yearsOfService > 5) {
                bonusPercentage = 5;
            } else {
                bonusPercentage = 2;
            }

            // Calculate bonus and new salary
            double bonus = oldSalary * bonusPercentage / 100;
            double newSalary = oldSalary + bonus;

            bonusData[i][0] = newSalary;
            bonusData[i][1] = bonus;
        }

        return bonusData;
    }

    // Method to calculate and display total salary and bonus
    public static void displaySalaryDetails(
            double[][] employeeData,
            double[][] bonusData) {

        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.println(
                "Employee\tOld Salary\tYears\tBonus\t\tNew Salary"
        );

        System.out.println(
                "----------------------------------------------------------------"
        );

        for (int i = 0; i < employeeData.length; i++) {

            double oldSalary = employeeData[i][0];
            double yearsOfService = employeeData[i][1];
            double newSalary = bonusData[i][0];
            double bonus = bonusData[i][1];

            totalOldSalary = totalOldSalary + oldSalary;
            totalNewSalary = totalNewSalary + newSalary;
            totalBonus = totalBonus + bonus;

            System.out.printf(
                    "%d\t\t%.2f\t\t%.0f\t%.2f\t\t%.2f%n",
                    i + 1,
                    oldSalary,
                    yearsOfService,
                    bonus,
                    newSalary
            );
        }

        System.out.println(
                "----------------------------------------------------------------"
        );

        System.out.printf(
                "Total\t\t%.2f\t\t\t%.2f\t\t%.2f%n",
                totalOldSalary,
                totalBonus,
                totalNewSalary
        );
    }

    public static void main(String[] args) {

        // Generate salary and years of service
        double[][] employeeData = generateEmployeeData();

        // Calculate bonus and new salary
        double[][] bonusData = calculateBonus(employeeData);

        // Display salary details and totals
        displaySalaryDetails(employeeData, bonusData);
    }
}
