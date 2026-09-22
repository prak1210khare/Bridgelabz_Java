/*Write a program to find the age of Harry if the birth year is 2000.
Assume the Current Year is 2024
Auhtor: Prakhar Khare
Date: 21-09-2026
 */
package javaProgrammingElements.level1;

public class CalculateHarryAge {
    public static void main(String[] args) {

        // Fixed values
        int birthYear = 2000;
        int currentYear = 2024;

        // Calculate age
        int harryAge = currentYear - birthYear;

        // Display result
        System.out.println("Harry's age in " + currentYear + " is " + harryAge);
    }
}
