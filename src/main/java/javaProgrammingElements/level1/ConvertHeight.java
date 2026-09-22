/*Write a program that takes your height in centimeters and converts it into feet and inches
        Hint => 1 foot = 12 inches and 1 inch = 2.54 cm
Author: Prakhar Khare
Date: 21-09-2026
 */

package javaProgrammingElements.level1;
import java.util.Scanner;
public class ConvertHeight {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take height input in centimeters
        double heightInCm = input.nextDouble();

        // Conversion values
        double centimetersPerInch = 2.54;
        double inchesPerFoot = 12;

        // Convert centimeters to inches
        double totalInches = heightInCm / centimetersPerInch;

        // Convert inches to feet and remaining inches
        int feet = (int) (totalInches / inchesPerFoot);
        double remainingInches = totalInches % inchesPerFoot;

        // Display result
        System.out.println(
                "Your Height in cm is " + heightInCm +
                        " while in feet is " + feet +
                        " and inches is " + remainingInches
        );

        input.close();
    }
}
