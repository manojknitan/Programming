package com.learning.cognizant;

public class ReverseStringWordByWord {

    //Without using split
    public static void reverseByWord(String s)
    {
        String word = "";
        String result = "";

        for(int i = s.length()-1; i>=0; i-- )
        {
            if(s.charAt(i) != ' ')
            {
                word = s.charAt(i)+word;
            }
            else {
                result = result+word+" ";
                word ="";
            }
        }
        result = result + word;
        System.out.println(result);
    }

    //using split
    public static void reverWithSplit(String s)
    {
        String[] words = s.split("\\s+");
        for(int i= words.length-1; i>=0; i--)
        {
            System.out.print(words[i]+" ");
        }
    }
    public static void main(String[] args) {
        String str = "I Love    Programming";
        //reverseByWord(str);
        reverWithSplit(str);
    }
}
