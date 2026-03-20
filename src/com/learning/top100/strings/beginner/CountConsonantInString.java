/**
 * @author: Manoj Kumar
 * @created date: 15-03-2026
 * @description: TODO
 */

package com.learning.top100.strings.beginner;

public class CountConsonantInString {
    //1.
    public static int countConsonant(String s)
    {
        int count=0;
        if(s.length() == 0)
            return -1;
        for(char ch: s.toLowerCase().toCharArray())
        {
            if(Character.isLetter(ch) && !(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'))
            {
                count++;
            }
        }
        return count;
    }

    //2.
    public static int countCons(String s)
    {
        int count=0;
        String vowels = "aeiou";

        if(s.length() == 0)
        {
            return -1;
        }
        for(char ch: s.toLowerCase().toCharArray())
        {
            if(Character.isLetter(ch) && vowels.indexOf(ch) == -1)
            {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "Automation Manoj Kumar";
        //System.out.println(countConsonant(str));
        System.out.println(countCons(str));
    }
}
