package com.learning.string;

import java.util.HashMap;
import java.util.Map;

public class CharacterOccuringMaxTimes {
    public static void occuringMaxTimes(String s)
    {
        Map<Character, Integer> map = new HashMap<>();

        for(int i=0; i<s.length(); i++)
        {
            char curr = s.charAt(i);
            map.put(curr, map.getOrDefault(curr,0)+1);
        }

        int max = Integer.MIN_VALUE;
        char ch =' ';
        for(Map.Entry<Character,Integer> entry: map.entrySet())
        {
            if(entry.getValue()>max)
            {
                max = entry.getValue();
                ch = entry.getKey();
            }
        }
        System.out.println(ch+"====="+max);
    }

    public static void main(String[] args) {
        String str = "My name is Maaaanoj";
        occuringMaxTimes(str);
    }
}
