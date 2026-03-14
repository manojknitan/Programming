package com.learning.leetcode.string;

public class ValidPalindromeByDeletion {
    public static boolean isValidPalindrome(String s)
    {
        int i=0, j=s.length()-1;
        while(i<j)
        {
            if(s.charAt(i) == s.charAt(j))
            {
                i++;
                j--;
            }
            else
            {
                return isPalindrome(s, i+1, j) || isPalindrome(s, i, j-1);
            }
        }
        return true;
    }
    private static boolean isPalindrome(String s, int i, int j)
    {
        while (i<j)
        {
            if(s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "rotnatxor";
        System.out.println(isValidPalindrome(str));
    }
}
