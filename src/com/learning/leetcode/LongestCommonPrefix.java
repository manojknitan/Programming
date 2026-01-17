package com.learning.leetcode;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs)
    {
        String temp=strs[0];
        int n = temp.length();
        char[] res=new char[n];

        for(String word: strs)
        {
            for(int i=0; i<word.length(); i++)
            {
                if(temp.charAt(i) == word.charAt(i))
                {
                    res[i]=temp.charAt(i);
                }
            }
        }
        if(res.length == 0)
        {
            return "";
        }
        else {
            return new String(res);
        }
    }

    public static void main(String[] args) {
        LongestCommonPrefix lcp = new LongestCommonPrefix();
        String[] s={"flower","flow","flight"};
        System.out.println(lcp.longestCommonPrefix(s));
    }
}
