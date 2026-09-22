/*Create a program to find the BMI of a person
        Hint =>
        Take user input in double for the weight (in kg) of the person and height (in cm) for the person and store it in the corresponding variable.
        Use the formula BMI = weight / (height * height). Note unit is kg/m^2. For this convert cm to meter
        Use the table to determine the weight status of the person
Author: Prakhar Khare
Date: 22-09-2026
 */
package javaControlFlows.level2;
import java.util.Scanner;
public class CalculateBMI {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take weight in kilograms and height in centimeters
        double weight = input.nextDouble();
        double heightInCm = input.nextDouble();

        // Convert height from centimeters to meters
        double heightInMeter = heightInCm / 100;

        // Calculate BMI
        double bmi = weight / (heightInMeter * heightInMeter);

        // Determine weight status
        String status;

        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi <= 24.9) {
            status = "Normal";
        } else if (bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        // Display BMI and status
        System.out.println("BMI = " + bmi);
        System.out.println("Status = " + status);

        // Close Scanner
        input.close();
    }
}
