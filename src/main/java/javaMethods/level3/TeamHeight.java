/*Create a program to find the shortest, tallest, and mean height of players present in a football team.
Hint =>
The formula to calculate the mean is: mean = sum of all elements/number of elements
Create an int array named heights of size 11 and get 3 digits random height in cms for each player in the range 150 cms to 250 cms
Write the method to Find the sum of all the elements present in the array.
Write the method to find the mean height of the players on the football team
Write the method to find the shortest height of the players on the football team
Write the method to find the tallest height of the players on the football team
Finally display the results
Author: Prakhar Khare
Date: 25-09-2026
 */

package javaMethods.level2;

public class TeamHeight {
    // Method to generate random heights
    public static int[] generateHeights() {
        int[] heights = new int[11];

        for (int i = 0; i < heights.length; i++) {
            heights[i] = (int) (Math.random() * 101) + 150;
        }

        return heights;
    }

    // Method to find the sum of all heights
    public static int findSum(int[] heights) {
        int sum = 0;

        for (int height : heights) {
            sum = sum + height;
        }

        return sum;
    }

    // Method to find the mean height
    public static double findMean(int[] heights) {
        int sum = findSum(heights);
        return (double) sum / heights.length;
    }

    // Method to find the shortest height
    public static int findShortest(int[] heights) {
        int shortest = heights[0];

        for (int height : heights) {
            if (height < shortest) {
                shortest = height;
            }
        }

        return shortest;
    }

    // Method to find the tallest height
    public static int findTallest(int[] heights) {
        int tallest = heights[0];

        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }

        return tallest;
    }

    public static void main(String[] args) {

        // Generate heights for 11 players
        int[] heights = generateHeights();

        // Display player heights
        System.out.println("Heights of football players:");

        for (int i = 0; i < heights.length; i++) {
            System.out.println(
                    "Player " + (i + 1) + " = " + heights[i] + " cm"
            );
        }

        // Calculate results
        int sum = findSum(heights);
        double mean = findMean(heights);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);

        // Display results
        System.out.println("Sum of heights = " + sum + " cm");
        System.out.println("Mean height = " + mean + " cm");
        System.out.println("Shortest height = " + shortest + " cm");
        System.out.println("Tallest height = " + tallest + " cm");
    }
}

