/*Remove Duplicates from a String
Problem:
Write a Java program to remove all duplicate characters from a given string and return
the modified string.
Author: Prakhar Khare
Date: 30-09-2026
 */

package javaStrings.Extras;

import java.util.Scanner;

public class RemoveDuplicates {
      public static String duplicates(String text){
          String result="";
          for(int i=0;i<text.length();i++){
              char c=text.charAt(i);
              boolean isDuplicate=false;
              for(int j=0;j<result.length();j++){
                  if(c==result.charAt(j)){
                      isDuplicate=true;
                      break;
                  }
              }
              if(!isDuplicate) {
                  result=result+c;
              }
          }
          return result;
      }
      public static void main(String[] args){
          Scanner input=new Scanner(System.in);
          String text=input.nextLine();
          String result=duplicates(text);
          System.out.println("Original String"+text);
          System.out.println("Removing Duplicates "+result);
          input.close();
      }
}
