package com.learning.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PrintCountOfCharacters {

    public static void countOfChar(String str){

        if(str == null || str.isEmpty() || str.length() == 1) {
            System.out.println("Either empty or single character");
            return;
        }

        char[] ch = str.toCharArray();

        Map<Character, Integer> map = new HashMap<>();
        for(Character c: ch)
        {
            if(map.containsKey(c))
            {
                map.put(c, map.get(c)+1);
            }
            else {
                map.put(c, 1);
            }
        }

        //print the count
        Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();

        for(Map.Entry<Character,Integer> entry: entrySet)
        {
            if(entry.getValue() > 1)
                System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }

    public static void main(String[] args) {
        String s = "null";
        PrintCountOfCharacters.countOfChar(s);
    }
}
