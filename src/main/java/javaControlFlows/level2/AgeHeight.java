/*Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages and the tallest among the friends based on their heights
Hint =>
Take user input for the age and height of the 3 friends and store it in a variable
Find the smallest of the 3 ages to find the youngest friend and display it
Find the largest of the 3 heights to find the tallest friend and display it
Author: Prakhar Khare
Date: 22-09-2026
 */

package javaControlFlows.level2;
import java.util.Scanner;
public class AgeHeight {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take ages of the three friends
        int amarAge = input.nextInt();
        int akbarAge = input.nextInt();
        int anthonyAge = input.nextInt();

        // Take heights of the three friends
        double amarHeight = input.nextDouble();
        double akbarHeight = input.nextDouble();
        double anthonyHeight = input.nextDouble();

        // Find the youngest friend
        String youngestFriend;
        int youngestAge;

        if (amarAge <= akbarAge && amarAge <= anthonyAge) {
            youngestFriend = "Amar";
            youngestAge = amarAge;
        } else if (akbarAge <= amarAge && akbarAge <= anthonyAge) {
            youngestFriend = "Akbar";
            youngestAge = akbarAge;
        } else {
            youngestFriend = "Anthony";
            youngestAge = anthonyAge;
        }

        // Find the tallest friend
        String tallestFriend;
        double tallestHeight;

        if (amarHeight >= akbarHeight && amarHeight >= anthonyHeight) {
            tallestFriend = "Amar";
            tallestHeight = amarHeight;
        } else if (akbarHeight >= amarHeight && akbarHeight >= anthonyHeight) {
            tallestFriend = "Akbar";
            tallestHeight = akbarHeight;
        } else {
            tallestFriend = "Anthony";
            tallestHeight = anthonyHeight;
        }

        // Display results
        System.out.println(
                "The youngest friend is " + youngestFriend
                        + " with age " + youngestAge
        );

        System.out.println(
                "The tallest friend is " + tallestFriend
                        + " with height " + tallestHeight + " cm"
        );

        // Close Scanner
        input.close();
    }}
