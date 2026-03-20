package com.learning.top25adv;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacter
{
    public static int lengthOfLongestSubstring(String s)
    {
        Set<Character> set = new HashSet<>();
        int start=0, max_len=0;

        for(int end=0; end<s.length(); end++)
        {
            while (set.contains(s.charAt(end)))
            {
                set.remove(s.charAt(start));
                start++;
            }

            set.add(s.charAt(end));
            max_len = Math.max(max_len, end-start+1);
        }
        return max_len;
    }

    public static void main(String[] args) {
        String str = "pwwkewxpw";
        System.out.println(lengthOfLongestSubstring(str));
    }
}
