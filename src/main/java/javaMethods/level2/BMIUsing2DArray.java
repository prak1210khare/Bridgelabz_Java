/*An organization took up the exercise to find the Body Mass Index (BMI) of all the persons in the team of 10 members. For this create a program to find the BMI and display the height, weight, BMI and status of each individual
Hint =>
Take user input in double for the weight (in kg) of the person and height (in cm) for the person and and store it in the corresponding 2D array of 10 rows and 3 columns. The First Column storing the weight, the second column storing the height in cm and the third column is the BMI
Create a Method to find the BMI of every person and populate the array. Use the formula BMI = weight / (height * height). Note unit is kg/m^2. For this convert cm to meter
Create a Method to determine the BMI status using the logic shown in the figure below. and return the array of all the persons BMI Status.
Author: Prakhar Khare
Date: 25-09-2026
 */
package javaMethods.level2;
import java.util.Scanner;
public class BMIUsing2DArray {
    // Method to calculate BMI for every person
    public static void calculateBMI(double[][] personData) {
        for (int i = 0; i < personData.length; i++) {

            // Convert height from cm to meters
            double heightInMeter = personData[i][1] / 100;

            // Calculate BMI
            personData[i][2] =
                    personData[i][0] / (heightInMeter * heightInMeter);
        }
    }

    // Method to determine BMI status
    public static String[] calculateBMIStatus(double[][] personData) {
        String[] status = new String[personData.length];

        for (int i = 0; i < personData.length; i++) {
            double bmi = personData[i][2];

            if (bmi <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi <= 24.9) {
                status[i] = "Normal";
            } else if (bmi <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        return status;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create 2D array for 10 persons
        // Column 0 = Weight, Column 1 = Height, Column 2 = BMI
        double[][] personData = new double[10][3];

        // Take weight and height input
        for (int i = 0; i < personData.length; i++) {
            personData[i][0] = input.nextDouble();
            personData[i][1] = input.nextDouble();
        }

        // Calculate BMI
        calculateBMI(personData);

        // Calculate BMI status
        String[] status = calculateBMIStatus(personData);

        // Display results
        for (int i = 0; i < personData.length; i++) {
            System.out.println("Person " + (i + 1));
            System.out.println("Weight = " + personData[i][0] + " kg");
            System.out.println("Height = " + personData[i][1] + " cm");
            System.out.println("BMI = " + personData[i][2]);
            System.out.println("Status = " + status[i]);
            System.out.println();
        }

        input.close();
    }
}
