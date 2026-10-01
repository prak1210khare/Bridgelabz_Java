/*Find the Longest Word in a Sentence
Problem:
Write a Java program that takes a sentence as input and returns the longest word in the
sentence.
Author: Prakhar Khare
Date: 30-09-2026
 */
package javaStrings.Extras;
import java.util.Scanner;
public class LongestWord {
    public static String LongestWord(String sentence){
        String[] words=sentence.split(" ");
        String longestWord=words[0];
        for(int i=1;i<words.length;i++){
            if(words[i].length()>longestWord.length()){
                longestWord=words[i];
            }
        }
        return longestWord;
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String sentence=input.nextLine();
        String longestWord=LongestWord(sentence);
        System.out.println("Longest Word= "+longestWord);
        System.out.println("Length "+longestWord.length());
        input.close();
    }
}
