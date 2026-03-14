package com.learning.string;

import java.util.HashMap;
import java.util.Map;

public class CheckAnagramString {

    public static boolean anagram(String s1, String s2)
    {
        String str1 = s1.replaceAll("\\s+","");
        String str2 = s2.replaceAll("\\s+","");

        if(s1.length() != s2.length())
            return false;

        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<str1.length(); i++)
        {
            char curr = str1.charAt(i);
            map.put(curr, map.getOrDefault(curr,0)+1);
        }

        for(int i=0; i<str2.length(); i++)
        {
            char curr = str2.charAt(i);
            if(!map.containsKey(curr)) {
                return false;
            }
            map.put(curr, map.get(curr)-1);
        }

        for(int count: map.values())
        {
            if(count != 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s1="silent", s2="Listen";
        System.out.println(anagram(s1, s2));
    }
}
