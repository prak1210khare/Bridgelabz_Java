/*Write a program to find and return the length of a string without using the length() method
Hint =>
Take user input using the Scanner next() method
Create a method to find and return a string's length without using the built-in length() method. The logic for this is to use the infinite loop to count each character till the charAt() method throws a runtime exception, handles the exception, and then return the count
The main function calls the user-defined method as well as the built-in length() method and displays the result
Author: Prakhar Khare
Date: 28-09-2026
 */

package javaStrings.level2;
import java.util.Scanner;
public class StringLength {
       public static int findLength(String text){
           int count=0;
           try{
               while(true){
                   text.charAt(count);
                   count++;
               }
           }catch(StringIndexOutOfBoundsException exception){

           }
           return count;
       }
       public static void main(String[] args){
           Scanner input=new Scanner(System.in);
           String text=input.next();
           int result=findLength(text);
           int result1=text.length();
           System.out.println("Length using user-defined method: "+result);
           System.out.println("Length using built-in method: "+result1);
       }
}
