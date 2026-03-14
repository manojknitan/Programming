package com.learning.string;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateCharacter {
    public static void findDuplicate(String s)
    {
        Map<Character, Integer> map = new HashMap<>();

        for(char c: s.toCharArray())
        {
            map.put(c, map.getOrDefault(c,0)+1);
        }

        for(Map.Entry<Character, Integer> entry: map.entrySet())
        {
            if(entry.getValue() > 1)
            {
                System.out.print(entry.getKey()+" ");
            }
        }
    }

    public static void main(String[] args) {
        String str = "Maannooaannj";
        findDuplicate(str);
    }
}
