/**
 * @author: Manoj Kumar
 * @created date: 20-03-2026
 * @description: TODO
 */

package com.learning.top25adv.string;

public class LongestPalindromicSubstring {
    public static void longestPalindromicSubstring(String s)
    {
        if(s.length() <= 1)
            return;

        String lps="";
        for(int i=1; i<s.length(); i++)
        {
            //Odd length
            int low=i, high=i;
            while (s.charAt(low) == s.charAt(high))
            {
                low--;
                high++;
                if(low == -1 || high == s.length())
                {
                    break;
                }
            }
            String palindrome = s.substring(low+1, high);
            if(palindrome.length() > lps.length())
            {
                lps = palindrome;
            }

            //Even length
            low = i-1; high=i;

            while (s.charAt(low) == s.charAt(high))
            {
                low--;
                high++;
                if(low == -1 || high == s.length())
                {
                    break;
                }
            }
            palindrome = s.substring(low+1, high);
            if(palindrome.length() > lps.length())
            {
                lps = palindrome;
            }
        }
        System.out.println(lps);
    }

    public static void main(String[] args) {
        String str = "bababad";
        longestPalindromicSubstring(str);
    }
}
