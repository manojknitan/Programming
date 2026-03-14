package com.learning.string;

public class ReverseWordByWord {
    public static void main(String[] args) {
        String s = "I Love Programming";
        StringBuilder res = new StringBuilder();

        String[] str = s.split("\\s+");
        for(int i=str.length-1; i>=0; i--)
        {
               res.append(str[i]).append(" ");
        }
        System.out.println(res.toString().trim());
    }
}
