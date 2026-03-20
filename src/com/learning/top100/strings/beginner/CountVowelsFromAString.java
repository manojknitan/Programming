/**
 * @author: Manoj Kumar
 * @created date: 15-03-2026
 * @description: TODO
 */

package com.learning.top100.strings.beginner;

public class CountVowelsFromAString {

    public static void countVowels(String s)
    {
        String[] tokens = s.split("\\s+");

        for(String token: tokens)
        {
            int count=0;
            for(char ch: token.toLowerCase().toCharArray())
            {
                if(Character.isLetter(ch) && (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'))
                {
                    count++;
                }
            }
            System.out.println(token+"-"+count);
        }
    }

    public static void countVowelsAlt(String s)
    {
        String[] tokens = s.split("\\s+");
        String vowels = "aeiou";
        for(String token: tokens)
        {
            int count=0;
            for(char ch: token.toLowerCase().toCharArray())
            {
                if(Character.isLetter(ch) && (vowels.indexOf(ch) != -1))
                {
                    count++;
                }
            }
            System.out.println(token+"-"+count);
        }
    }
    public static void main(String[] args) {
        String str = "I Love Java Programming";
        countVowelsAlt(str);
    }
}
