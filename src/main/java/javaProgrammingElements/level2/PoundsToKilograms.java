/*Create a program to convert weight in pounds to kilograms.
        Hint => 1 pound = 2.2 kg
Auhtor: Prakhar Khare
Date: 21-09-2026
*/

package javaProgrammingElements.level2;
import java.util.Scanner;
public class PoundsToKilograms {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take weight input in pounds
        double weight = input.nextDouble();

        // Convert pounds to kilograms
        double kilogramsPerPound = 2.2;
        double weightInKilograms = weight * kilogramsPerPound;

        // Display result
        System.out.println(
                "The weight of the person in pound is " + weight
                        + " and in kg is " + weightInKilograms
        );

        // Close Scanner
        input.close();
    }

}
