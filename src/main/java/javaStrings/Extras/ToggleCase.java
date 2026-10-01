/*Toggle Case of Characters
Problem:
Write a Java program to toggle the case of each character in a given string. Convert
uppercase letters to lowercase and vice versa.
Author:Prakhar Khare
Date: 30-01-2026
 */
package javaStrings.Extras;
import java.util.Scanner;
public class ToggleCase {
    public static String toggle(String text){
        String result="";
        for(int i=0;i<text.length();i++){
            char c=text.charAt(i);
            if(c>='A' && c<='Z'){
                c=(char)(c+32);
            }
            else if(c>='a' && c<='z'){
                c=(char)(c-32);
            }
            result=result+c;
        }
        return result;
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String text=input.nextLine();
        String result=toggle(text);
        System.out.println("Original String= "+text);
        System.out.println("Toggled String "+result);
        input.close();

    }
}
