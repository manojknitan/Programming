/**
 * @author: Manoj Kumar
 * @created date: 20-03-2026
 * @description: TODO
 */

package com.learning.top100.strings.mid;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingChars {
    public static void longestSubstringUniqueChars(String s)
    {
        int start=0, maxLen=0, maxStart=0;
        Set<Character> set = new HashSet<>();
        
        for(int end=0; end<s.length(); end++)
        {
            while (set.contains(s.charAt(end)))
            {
                set.remove(s.charAt(start));
                start++;
            }
            set.add(s.charAt(end));
            //maxLen = Math.max(maxLen, end-start+1);
            int currLen = end-start+1;

            if(currLen > maxLen)
            {
                maxLen = currLen;
                maxStart = start;
            }
        }
        String res = s.substring(maxStart, maxStart+maxLen);
        System.out.println(res);
        System.out.println(maxLen);
        System.out.println(maxLen+res);
    }
    public static void main(String[] args) {
        String str = "abcabcbb";
        //String str = "pwwkewxpw";
        longestSubstringUniqueChars(str);
    }
}
