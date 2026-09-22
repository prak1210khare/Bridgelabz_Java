/*Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages and the tallest among the friends based on their heights
Hint =>
Take user input for age and height for the 3 friends and store it in two arrays each to store the values for age and height of the 3 friends
Loop through the array and find the youngest of the 3 friends and the tallest of the 3 friends
Finally display the youngest and tallest of the 3 friends
*/
package javaArrays.level2;
import java.util.Scanner;
public class AgeHeight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create arrays to store ages and heights
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Store friend names
        String[] friends = {"Amar", "Akbar", "Anthony"};

        // Take age and height input for 3 friends
        for (int i = 0; i < 3; i++) {
            ages[i] = input.nextInt();
            heights[i] = input.nextDouble();
        }

        // Find the youngest friend
        int youngestIndex = 0;

        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }

        // Find the tallest friend
        int tallestIndex = 0;

        for (int i = 1; i < 3; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Display the youngest friend
        System.out.println(
                "The youngest friend is " + friends[youngestIndex]
                        + " with age " + ages[youngestIndex]
        );

        // Display the tallest friend
        System.out.println(
                "The tallest friend is " + friends[tallestIndex]
                        + " with height " + heights[tallestIndex] + " cm"
        );

        input.close();
    }
}
