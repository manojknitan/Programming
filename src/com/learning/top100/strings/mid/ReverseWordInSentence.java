/**
 * @author: Manoj Kumar
 * @created date: 20-03-2026
 * @description: TODO
 */

package com.learning.top100.strings.mid;

public class ReverseWordInSentence {
    public static void reverseWord(String s)
    {
        String[] tokens = s.split("\\s+");

        String rev="";
        for(int i= tokens.length-1; i>=0; i--)
        {
            rev = rev + tokens[i]+" ";
        }

        System.out.println(rev);
    }

    public static void main(String[] args) {
        String str = "I Love Java Programming";
        reverseWord(str);
    }
}
