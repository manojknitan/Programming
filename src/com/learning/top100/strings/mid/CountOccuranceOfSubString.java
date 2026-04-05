/**
 * @author: Manoj Kumar
 * @created date: 22-03-2026
 * @description: TODO
 */

package com.learning.top100.strings.mid;

public class CountOccuranceOfSubString {

    //Without built-in method
    public static int countOcuurance(String s, String tar)
    {
        int count=0;
        for(int i=0; i<= s.length() - tar.length(); i++)
        {
            int j=0;
            while(j < tar.length() && s.charAt(i+j) == tar.charAt(j))
            {
                j++;
            }
            if(j == tar.length())
            {
                count++;
            }
        }
        return count;
    }

    //built in method
    public static int countOccuranceSubstring(String s, String tar)
    {
        int count=0, n = s.length(), m = tar.length();
        for(int i=0; i<=n-m; i++)
        {
            if(s.substring(i, i+m).equals(tar))
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str = "ababab";
        String target = "ab";
        //System.out.println(countOcuurance(str, target));
        System.out.println(countOccuranceSubstring(str, target));
    }
}
