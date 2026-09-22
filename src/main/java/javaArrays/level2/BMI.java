/*An organization took up an exercise to find the Body Mass Index (BMI) of all the persons in the team. For this create a program to find the BMI and display the height, weight, BMI and status of each individual
Hint =>
Take input for a number of persons
Create arrays to store the weight, height, BMI, and weight status of the persons
Take input for the weight and height of the persons
Calculate the BMI of all the persons and store them in an array and also find the weight status of the persons
Display the height, weight, BMI, and weight status of each person
Use the table to determine the weight status of the person
Author: Prakhar Khare
Date: 22-09-2026
 */

package javaArrays.level2;
import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take the number of persons
        int numberOfPersons = input.nextInt();

        // Create arrays to store weight, height, BMI, and status
        double[] weights = new double[numberOfPersons];
        double[] heights = new double[numberOfPersons];
        double[] bmi = new double[numberOfPersons];
        String[] status = new String[numberOfPersons];

        // Take input and calculate BMI for each person
        for (int i = 0; i < numberOfPersons; i++) {
            weights[i] = input.nextDouble();
            heights[i] = input.nextDouble();

            // Convert height from centimeters to meters
            double heightInMeters = heights[i] / 100;

            // Calculate BMI
            bmi[i] = weights[i] / (heightInMeters * heightInMeters);

            // Determine BMI status according to the table
            if (bmi[i] <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi[i] <= 24.9) {
                status[i] = "Normal";
            } else if (bmi[i] <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        // Display the details of each person
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("Person " + (i + 1));
            System.out.println("Height = " + heights[i] + " cm");
            System.out.println("Weight = " + weights[i] + " kg");
            System.out.println("BMI = " + bmi[i]);
            System.out.println("Status = " + status[i]);
            System.out.println();
        }

        input.close();
    }
}
