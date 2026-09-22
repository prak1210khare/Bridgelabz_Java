/*Write a program to check whether a person can vote, depending on whether his/her age is greater than or equal to 18.
        Hint =>
        Get integer input from the user and store it in the age variable.
        If the person is 18 or older, print "The person can vote."
        Otherwise, print "The person cannot vote."
Author: Prakhar Khare
Date: 22-09-2026
 */
package javaControlFlows.level1;
import java.util.Scanner;
public class VotingEligibility {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take age input
        int age = input.nextInt();

        // Check if the person can vote
        if (age >= 18) {
            System.out.println(
                    "The person's age is " + age + " and can vote."
            );
        } else {
            System.out.println(
                    "The person's age is " + age + " and cannot vote."
            );
        }

        // Close Scanner
        input.close();
    }
}
