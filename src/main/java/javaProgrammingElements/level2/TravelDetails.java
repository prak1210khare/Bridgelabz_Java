/*Rewrite the Sample Program 2 with user inputs
        Hint =>
        Create variables and take user inputs for name, fromCity, viaCity, toCity
        Create variables and take user inputs for distances fromToVia and viaToFinalCity in Miles
        Create Variables and take time taken
        Finally, print the result and try to understand operator precedence
Author: Prakhar Khare
Date: 21-09-2026
 */
package javaProgrammingElements.level2;
import java.util.Scanner;
public class TravelDetails {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take user inputs
        String name = input.nextLine();
        String fromCity = input.nextLine();
        String viaCity = input.nextLine();
        String toCity = input.nextLine();

        // Take distance inputs in miles
        double fromToVia = input.nextDouble();
        double viaToFinalCity = input.nextDouble();

        // Take time taken
        double timeTaken = input.nextDouble();

        // Calculate total distance
        double totalDistance = fromToVia + viaToFinalCity;

        // Display result
        System.out.println(
                "Name: " + name +
                        "\nFrom City: " + fromCity +
                        "\nVia City: " + viaCity +
                        "\nTo City: " + toCity +
                        "\nDistance from " + fromCity + " to " + viaCity + " = " + fromToVia + " miles" +
                        "\nDistance from " + viaCity + " to " + toCity + " = " + viaToFinalCity + " miles" +
                        "\nTotal Distance = " + totalDistance + " miles" +
                        "\nTime Taken = " + timeTaken + " hours"
        );

        // Close Scanner
        input.close();
    }
}
