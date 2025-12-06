package com.learning.string;

public class ReverseInPlace {

    public static String reverse(String str){
        if(str == null || str.isEmpty())
        {
            return str;
        }
        char[] ch = str.toCharArray();
        int i=0;
        int j = ch.length - 1;
        while (i<j)
        {
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }
        return new String(ch);
    }

    public static void main(String[] args) {
        String s = "Manoj Kumar";
        System.out.println(ReverseInPlace.reverse(s));
    }
}
