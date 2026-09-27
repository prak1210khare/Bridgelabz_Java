/*Create a program to find the youngest friends among 3 Amar, Akbar and Anthony based on their ages and tallest among the friends based on their heights and display it
Hint =>
Take user input for age and height for the 3 friends and store it in two arrays each to store the values for age and height of the 3 friends
Write a Method to find the youngest of the 3 friends
Write a Method to find the tallest of the 3 friends
Author: Prakhar Khare
Date: 25-09-2026
 */

package javaMethods.level2;
import java.util.Scanner;
public class FriendsHeight {
    // Method to find the youngest friend
    public static int findYoungest(int[] ages) {
        int youngestIndex = 0;

        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }

        return youngestIndex;
    }

    // Method to find the tallest friend
    public static int findTallest(double[] heights) {
        int tallestIndex = 0;

        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        return tallestIndex;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Store names of the friends
        String[] friends = {"Amar", "Akbar", "Anthony"};

        // Create arrays for ages and heights
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Take age and height input
        for (int i = 0; i < 3; i++) {
            ages[i] = input.nextInt();
            heights[i] = input.nextDouble();
        }

        // Find youngest and tallest friend
        int youngestIndex = findYoungest(ages);
        int tallestIndex = findTallest(heights);

        // Display results
        System.out.println(
                "The youngest friend is " + friends[youngestIndex]
                        + " with age " + ages[youngestIndex]
        );

        System.out.println(
                "The tallest friend is " + friends[tallestIndex]
                        + " with height " + heights[tallestIndex] + " cm"
        );

        input.close();
    }
}
