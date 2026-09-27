/*An organization took up the exercise to find the Body Mass Index (BMI) of all the persons in a team of 10 members. For this create a program to find the BMI and display the height, weight, BMI, and status of each individual
Hint =>
Take user input for the person's weight (kg) and height (cm) and store it in the corresponding 2D array of 10 rows. The First Column stores the weight and the second column stores the height in cm
Create a Method to find the BMI and status of every person given the person's height and weight and return the 2D String array. Use the formula BMI = weight / (height * height). Note unit is kg/m^2. For this convert cm to meter
Create a Method that takes the 2D array of height and weight as parameters. Calls the user-defined method to compute the BMI and the BMI Status and stores in a 2D String array of height, weight, BMI, and status.
Create a method to display the 2D string array in a tabular format of Person's Height, Weight, BMI, and the Status
Finally, the main function takes user inputs, calls the user-defined methods, and displays the result.
Author: Prakhar Khare
Date: 28-09-2026
 */

package javaStrings.level3;
import java.util.Scanner;
public class BMI {
    // Method to calculate BMI
    public static double calculateBMI(double weight, double heightInCm) {

        // Convert height from cm to meter
        double heightInMeter = heightInCm / 100;

        // Calculate BMI
        double bmi = weight / (heightInMeter * heightInMeter);

        return bmi;
    }

    // Method to find BMI status
    public static String findBMIStatus(double bmi) {

        if (bmi <= 18.4) {
            return "Underweight";
        } else if (bmi <= 24.9) {
            return "Normal";
        } else if (bmi <= 39.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    // Method to calculate BMI and status for each person
    public static String[][] calculateBMIData(double[][] personData) {

        // 4 columns: Height, Weight, BMI, Status
        String[][] result = new String[personData.length][4];

        for (int i = 0; i < personData.length; i++) {

            // First column = Weight
            double weight = personData[i][0];

            // Second column = Height
            double height = personData[i][1];

            // Calculate BMI
            double bmi = calculateBMI(weight, height);

            // Find BMI status
            String status = findBMIStatus(bmi);

            // Store height
            result[i][0] = String.valueOf(height);

            // Store weight
            result[i][1] = String.valueOf(weight);

            // Store BMI rounded to 2 decimal places
            double roundedBMI = Math.round(bmi * 100.0) / 100.0;
            result[i][2] = String.valueOf(roundedBMI);

            // Store status
            result[i][3] = status;
        }

        return result;
    }

    // Method to display BMI data in tabular format
    public static void displayBMIData(String[][] result) {

        System.out.println("Person\tHeight(cm)\tWeight(kg)\tBMI\tStatus");
        System.out.println("----------------------------------------------------------");

        for (int i = 0; i < result.length; i++) {

            System.out.printf(
                    "%d\t%s\t\t%s\t\t%s\t%s%n",
                    i + 1,
                    result[i][0],
                    result[i][1],
                    result[i][2],
                    result[i][3]
            );
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Create 2D array for 10 persons
        // Column 0 = Weight
        // Column 1 = Height
        double[][] personData = new double[10][2];

        // Take input for 10 persons
        for (int i = 0; i < personData.length; i++) {

            System.out.println(
                    "Enter weight (kg) and height (cm) for Person "
                            + (i + 1) + ":"
            );

            personData[i][0] = input.nextDouble();
            personData[i][1] = input.nextDouble();
        }

        // Calculate BMI and status
        String[][] result = calculateBMIData(personData);

        // Display result
        displayBMIData(result);

        input.close();
    }

}
