package com.learning.array;

import java.util.Locale;

public class DetermineValidAnagrams {
    public static boolean testAnagramsValidity(String s1, String s2)
    {
        String str1 = s1.replaceAll(" ","").toLowerCase();
        String str2 = s2.replaceAll(" ","").toLowerCase();

        int[] freq = new int[256];

        for(int i=0; i<str1.length(); i++)
        {
            freq[str1.charAt(i)]++;
        }

        for(int j=0; j<str2.length(); j++)
        {
            freq[str2.charAt(j)]--;
        }
        
        for(int count: freq)
        {
            if(count != 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String st1 = "lis", st2 = "silent";
        System.out.println(testAnagramsValidity(st1, st2));
    }
}
