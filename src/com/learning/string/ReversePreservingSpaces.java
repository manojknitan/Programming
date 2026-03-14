package com.learning.string;

public class ReversePreservingSpaces {
    public static String reversePreservingSpaces(String s)
    {
        char[] ch = s.toCharArray();
        int i=0, j=ch.length-1;

        while (i<j)
        {
            if(ch[i] == ' ')
            {
                i++;
            }
            else if(ch[j] == ' ')
            {
                j--;
            }
            else {
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;

                i++;
                j--;
            }
        }
        return new String(ch);
    }

    public static void main(String[] args) {
        String str = "I am Manoj";
        System.out.println(reversePreservingSpaces(str));
    }
}
