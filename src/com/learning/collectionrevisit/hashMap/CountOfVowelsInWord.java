package com.learning.collectionRevisit.hashMap;

import java.util.HashMap;
import java.util.Map;

public class CountOfVowelsInWord {
    public static void countOfVowels(String s)
    {
        String[] tokens = s.split("\\s+");
        for(String str: tokens)
        {
            int count = 0;
            String temp = str.toLowerCase();

            Map<Character, Integer> map = new HashMap<>();

            for(int i=0; i<temp.length(); i++)
            {
                char curr = temp.charAt(i);
                map.put(curr, map.getOrDefault(curr,0)+1);
            }

            for(Map.Entry<Character, Integer> e: map.entrySet())
            {
                if(e.getKey() == 'a' || e.getKey() == 'e' || e.getKey() == 'i' || e.getKey() == 'o' || e.getKey() == 'u')
                {
                    count+=e.getValue();
                }
            }
            System.out.println(str+"=="+count);
        }
    }

    public static void main(String[] args) {
        String str = "I love java programming";
        countOfVowels(str);
    }
}
