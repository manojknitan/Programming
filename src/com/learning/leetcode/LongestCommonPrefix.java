package com.learning.leetcode;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] s)
    {
        Arrays.sort(s);
        StringBuilder sbl = new StringBuilder();
        char[] start = s[0].toCharArray();
        char[] end = s[s.length-1].toCharArray();

        for(int i=0; i<start.length; i++)
        {
            if(start[i] != end[i])
            {
                break;
            }
            sbl.append(start[i]);
        }
        return sbl.toString();
    }

    public static void main(String[] args) {
        String[] str = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(str));
    }
}
