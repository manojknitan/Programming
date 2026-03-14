package com.learning.string;

import java.util.Locale;

public class CountOfVowelsInWord {
    public static void countOdVowels(String s)
    {
        String[] tokens = s.split("\\s+");
        for(String str: tokens)
        {
            int count=0;
            for(int i=0; i<str.toLowerCase().length(); i++)
            {
                char curr = str.charAt(i);
                if(curr == 'a' || curr == 'e' || curr == 'i' || curr == 'o' || curr == 'u')
                {
                    count++;
                }
            }
            System.out.println(str+" - "+count);
            count=0;
        }
    }

    public static void main(String[] args) {
        String str = "I love Java programming";
        countOdVowels(str);
    }
}
