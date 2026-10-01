/*Reverse a String
Problem:
Write a Java program to reverse a given string without using any built-in reverse
functions.

 */
package javaStrings.Extras;

import java.util.Scanner;

public class ReverseString {
    public static String reverseString(String text){
        String reverse="";
        for(int i=text.length()-1;i>=0;i--){
            reverse=reverse+text.charAt(i);
        }
        return reverse;
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String text=input.nextLine();
        String reverse=reverseString(text);
        System.out.println("Original String "+text);
        System.out.println("Reversed String "+reverse);
        input.close();
    }
}
