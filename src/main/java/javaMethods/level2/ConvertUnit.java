/*Extend or Create a UnitConvertor utility class similar to the one shown in the notes to do the following.  Please define static methods for all the UnitConvertor class methods. E.g.
public static double convertYardsToFeet(double yards) =>
Method to convert yards to feet and return the value. Use following code to convert  double yards2feet = 3;
Method to convert feet to yards and return the value. Use following code to convert  double feet2yards = 0.333333;
Method to convert meters to inches and return the value. Use following code to convert  double meters2inches = 39.3701;
Method to convert inches to meters and return the value. Use following code to convert  double inches2meters = 0.0254;
Method to convert inches to centimeters and return the value. Use the following code  double inches2cm = 2.54;
Author: Prakhar Khare
Date: 25-09-2026
 */

package javaMethods.level2;

public class ConvertUnit {
    // Method to convert yards to feet
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }

    // Method to convert feet to yards
    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    // Method to convert meters to inches
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    // Method to convert inches to meters
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    // Method to convert inches to centimeters
    public static double convertInchesToCm(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }

    public static void main(String[] args) {

        // Test the conversion methods
        double yards = 10;
        double feet = 30;
        double meters = 5;
        double inches = 20;

        System.out.println(
                yards + " yards = " + convertYardsToFeet(yards) + " feet"
        );

        System.out.println(
                feet + " feet = " + convertFeetToYards(feet) + " yards"
        );

        System.out.println(
                meters + " meters = " + convertMetersToInches(meters) + " inches"
        );

        System.out.println(
                inches + " inches = " + convertInchesToMeters(inches) + " meters"
        );

        System.out.println(
                inches + " inches = " + convertInchesToCm(inches) + " cm"
        );
    }

}
