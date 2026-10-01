/*Palindrome String Check
Problem:
Write a Java program to check if a given string is a palindrome (a string that reads the
 same forward and backward).
Author: Prakhar Khare
Date: 30-09-2026
 */
package javaStrings.Extras;

import java.util.Scanner;

public class Palindrome {
    public static boolean palindrome(String text){
        int start=0;
        int end=text.length()-1;
        while(start<end){
            if(text.charAt(start)!=text.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;

    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String text=input.nextLine();
        boolean result=palindrome(text);
        if(result){
            System.out.println("String is Palindrome");
        }else{
            System.out.println("String is not Palindrome");
        }
        input.close();
    }
}
