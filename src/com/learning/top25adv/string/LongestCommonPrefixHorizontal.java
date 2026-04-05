/**
 * @author: Manoj Kumar
 * @created date: 21-03-2026
 * @description: TODO
 */

package com.learning.top25adv.string;

public class LongestCommonPrefixHorizontal {
    
    public static String longestCommonPrefix(String[] s)
    {
        /*
        * Thought process:
        * 1. Store first character of first word in string array.
        * 2. run a loop on 1 to n
        * */
        if(s == null || s.length == 0)
        {
            return "";
        }
        StringBuilder sbl = new StringBuilder();

        // to control index of first word of string[]
        for(int i=0; i<s[0].length(); i++)
        {
            char ch = s[0].charAt(i);

            //to control index of words in string[]
            for(int j=1; j<s.length; j++)
            {
                if((i >=s[j].length()) || (ch != s[j].charAt(i)))
                {
                    return sbl.toString();
                }
            }
            sbl.append(ch);
        }
        return sbl.toString();
    }
    
    public static void main(String[] args) {
        String[] str = {"flower", "flow", "flows","fl", "f", "fox"};
        System.out.println(longestCommonPrefix(str));
    }
}
