package com.learning.string;

public class CheckPalindrome {
    public static boolean palindrome(String s)
    {
        int i=0, j=s.length()-1;
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "madaml";
        System.out.println(palindrome(str));
    }
}
