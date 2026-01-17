package com.learning.cognizant;

public class ReverseStringEachCharacter {
    public static void revWordByWord(String s)
    {
        String result="";
        String[] tokens=s.split("\\s+");

        for(String word:tokens)
        {
            for(int i=word.length()-1; i>=0; i--)
            {
                result = result+word.charAt(i);
            }
            result = result+" ";
        }
        System.out.println(result);

    }

    public static void main(String[] args) {
        String s = "My name is Manoj";
        revWordByWord(s);
    }
}
