/*Create a program to find the mean height of players present in a football team.
        Hint =>
The formula to calculate the mean is: mean = sum of all elements / number of elements
Create a double array named heights of size 11 and get input values from the user.
Find the sum of all the elements present in the array.
Divide the sum by 11 to find the mean height and print the mean height of the football team
Author: Prakhar Khare
Date: 22-09-2026
 */

package javaArrays.level1;
import java.util.Scanner;
public class Height {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create an array to store heights of 11 players
        double[] heights = new double[11];

        // Variable to store the sum of all heights
        double sum = 0.0;

        // Take height input for 11 players
        for (int i = 0; i < heights.length; i++) {
            heights[i] = input.nextDouble();
        }

        // Calculate the sum of all heights
        for (int i = 0; i < heights.length; i++) {
            sum = sum + heights[i];
        }

        // Calculate the mean height
        double meanHeight = sum / 11;

        // Display the mean height
        System.out.println("Mean height of the football team = " + meanHeight);

        input.close();
    }

}
