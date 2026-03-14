package com.learning.leetcode;

public class LongestPalindromicSubstring {
    public static void longestPalindrome(String s)
    {
        if(s.length() <=1)
            return;
        String lps = "";

        for(int i=1; i<s.length(); i++)
        {
            //for odd length
            int low=i, high=i;

            while(s.charAt(low) == s.charAt(high))
            {
                low--;
                high++;
                if(low == -1 || high == s.length())
                    break;
            }
            String palindrome = s.substring(low+1, high);
            if(palindrome.length() > lps.length()) {
                lps = palindrome;
            }

            //for even length
            low=i-1; high=i;

            while (s.charAt(low) == s.charAt(high))
            {
                low--;
                high++;
                if(low == -1 && high == s.length())
                    break;
            }
            palindrome = s.substring(low+1, high);
            if(palindrome.length() > lps.length())
            {
                lps = palindrome;
            }
        }
        System.out.println("Longest Palindromic Sub-string: "+lps);
    }

    public static void main(String[] args) {
        String str = "babad";
        longestPalindrome(str);
    }
}
