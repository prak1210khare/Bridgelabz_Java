/*Find Substring Occurrences
Problem:
Write a Java program to count how many times a given substring occurs in a string.
Auhtor: Prakhar Khare
Date: 30-09-2026
 */
package javaStrings.Extras;
import java.util.Scanner;
public class SubstringOccurences{
    public static int countOccurences(String text,String substring){
        int count=0;
        for(int i=0;i<=text.length()-substring.length();i++){
            String currentPart=text.substring(i,i+substring.length());
            if(currentPart.equals(substring)){
                count++;
            }
        }
         return count;
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String text=input.nextLine();
        String substring=input.nextLine();
        int count=countOccurences(text,substring);
        System.out.println("Substring= "+substring);
        System.out.println("Number of occurrences "+count);
        input.close();
    }
}
