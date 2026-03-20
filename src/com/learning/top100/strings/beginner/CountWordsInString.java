/**
 * @author: Manoj Kumar
 * @created date: 16-03-2026
 * @description: TODO
 */

package com.learning.top100.strings.beginner;

public class CountWordsInString {
    public static int countWords(String s)
    {
        String[] tokens = s.split("\\s+");
        int count=0;
        for(String token: tokens)
        {
            count++;
        }
        return count;
    }

    public static int countWordsAlt(String s)
    {
        int count=1;
        for(char ch : s.toCharArray())
        {
            if(ch == ' ')
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str = "I love java programming";
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(countWordsAlt(str));
    }
}
