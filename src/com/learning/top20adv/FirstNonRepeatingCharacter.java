package com.learning.top20adv;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FirstNonRepeatingCharacter {

    public static void firstNonRepCharUsingMap(String s)
    {
        Map<Character, Integer>  map = new HashMap<>();

        for(int i=0; i<s.length(); i++)
        {
            char curr = s.charAt(i);
            map.put(curr, map.getOrDefault(curr,0)+1);
        }

        for(char c: s.toCharArray())
        {
            if(map.get(c) == 1)
            {
                System.out.println("First Non Rep Char: "+c);
                break;
            }
        }
    }

    public static char firstNonRepCharUsingArray(String s)
    {
        int[] freq = new int[256];

        for(char c: s.toCharArray())
        {
            freq[c]++;
        }

        for(char c : s.toCharArray())
        {
            if(freq[c]==1)
                return c;
        }
        return '\0';
    }

    public static void main(String[] args) {
        String str = "geeksforgeeks";
        //firstNonRepCharUsingMap(str);
        System.out.println(firstNonRepCharUsingArray(str));
    }
}
