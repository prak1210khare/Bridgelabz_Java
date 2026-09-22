/*Write a program to count down the number from the user input value to 1 using a while loop for a rocket launch
        Hint =>
        Create a variable counter to take user inputted value for the countdown.
        Use the while loop to check if the counter is 1
        Inside a while loop, print the value of the counter and decrement the counter
Author: Prakhar Khare
Date: 22-09-2026
 */
package javaControlFlows.level1;
import java.util.Scanner;
public class RocketCountdown {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take countdown value from user
        int counter = input.nextInt();

        // Countdown from the given number to 1
        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }

        // Close Scanner
        input.close();
    }
}
