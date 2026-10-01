/*Count Vowels and Consonants
Problem:
Write a Java program to count the number of vowels and consonants in a given string.
package javaStrings.Extras;
Author: Prakhar Khare
Date: 30-09-2026
 */

import java.util.Scanner;

public class VowelsAndConsonants {
    public static int[] count(String text){
        int vowel=0;
        int consonant=0;
        for(int i=0;i<text.length();i++){
            char c=text.charAt(i);
            if(c>='A' && c<='Z'){
                c=(char)(c+32);
            }
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){

                    vowel++;
                }
                else if(c>='a' && c<='z'){
                    consonant++;
                }
            }
            return new int[]{vowel,consonant};
        }

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String text=input.nextLine();
        int[] result=count(text);
        System.out.println("No of vowels "+result[0]);
        System.out.println("No of consonants "+result[1]);
        input.close();
    }
}
