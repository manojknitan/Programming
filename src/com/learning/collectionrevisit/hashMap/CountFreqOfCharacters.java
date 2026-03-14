package com.learning.collectionRevisit.hashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountFreqOfCharacters {
    public static void countFrequency(String s)
    {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for(int i=0; i<s.length(); i++)
        {
            char curr = s.charAt(i);
            map.put(curr, map.getOrDefault(curr,0)+1);
        }

        for(Map.Entry<Character, Integer> entry: map.entrySet())
        {
            System.out.print(entry.getKey()+""+entry.getValue());
        }
    }

    public static void main(String[] args) {
        String str = "abbccd";
        countFrequency(str);
    }
}
