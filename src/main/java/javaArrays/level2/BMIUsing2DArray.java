/*Rewrite the above program using multi-dimensional array to store height, weight, and BMI in 2D array for all the persons
Hint =>
Take input for a number of persons
Create a multi-dimensional array to store weight, height and BMI. Also create an to store the weight status of the persons
double[][] personData = new double[number][3];
String[] weightStatus = new String[number];
Take input for weight and height of the persons and for negative values, ask the user to enter positive values
Calculate BMI of all the persons and store them in the personData array and also find the weight status and put them in the weightStatus array
Display the height, weight, BMI and status of each person
Author: Prakhar Khare
Date: 22-09-2026
*/

package javaArrays.level2;
import java.util.Scanner;
public class BMIUsing2DArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take the number of persons
        int number = input.nextInt();

        // Create 2D array to store weight, height, and BMI
        double[][] personData = new double[number][3];

        // Create array to store weight status
        String[] weightStatus = new String[number];

        // Take input for each person
        for (int i = 0; i < number; i++) {

            // Take positive weight
            do {
                personData[i][0] = input.nextDouble();

                if (personData[i][0] <= 0) {
                    System.out.println("Please enter a positive weight.");
                }
            } while (personData[i][0] <= 0);

            // Take positive height
            do {
                personData[i][1] = input.nextDouble();

                if (personData[i][1] <= 0) {
                    System.out.println("Please enter a positive height.");
                }
            } while (personData[i][1] <= 0);

            // Convert height from centimeters to meters
            double heightInMeters = personData[i][1] / 100;

            // Calculate BMI and store it in the 2D array
            personData[i][2] =
                    personData[i][0] / (heightInMeters * heightInMeters);

            // Determine BMI status
            if (personData[i][2] <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display details of each person
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1));
            System.out.println("Weight = " + personData[i][0] + " kg");
            System.out.println("Height = " + personData[i][1] + " cm");
            System.out.println("BMI = " + personData[i][2]);
            System.out.println("Status = " + weightStatus[i]);
            System.out.println();
        }

        input.close();
    }
}
