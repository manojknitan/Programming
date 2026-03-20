/**
 * @author: Manoj Kumar
 * @created date: 19-03-2026
 * @description: TODO
 */

package com.learning.top100.strings.mid;

public class LongestWordInString {
    public static void longestWord(String s)
    {
        String[] tokens = s.split("\\s+");
        int length=0; String res="";

        for(String token: tokens)
        {
            int len = token.length();
            if(len > length)
            {
                length = len;
                res = token;
            }
        }
        System.out.println(res+","+length);
    }
    public static void main(String[] args) {
        String str = "I Love Automation";
        longestWord(str);
    }
}
