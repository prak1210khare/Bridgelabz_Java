/*Create a program to convert distance in kilometers to miles.
        Hint =>
        Create a variable km and assign type as double as in double km;
        Create Scanner Object to take user input from Standard Input that is the Keyboard as in Scanner input = new Scanner(System.in);
        Use Scanner Object to take user input for km as in km = input.nextInt();
        Use 1 mile = 1.6 km formulae to calculate miles and show the output
 Author: Prakhar Khare
 Date: 21-09-2026
 */

package javaProgrammingElements.level1;
import java.util.Scanner;
public class ConvertKmtoMiles {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take kilometer input
        double km = input.nextInt();

        // Conversion value
        double kilometersPerMile = 1.6;

        // Calculate miles
        double miles = km / kilometersPerMile;

        // Display result
        System.out.println(
                "The total miles is " + miles +
                        " mile for the given " + km + " km"
        );

        input.close();
    }
}
