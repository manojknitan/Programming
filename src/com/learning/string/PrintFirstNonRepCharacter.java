package com.learning.string;

import java.util.LinkedHashMap;
import java.util.Map;

public class PrintFirstNonRepCharacter {

    public static void firstNonRepChar(String s)
    {
        Map<Character, Integer> map = new LinkedHashMap<>();

        for(int i=0; i<s.length(); i++)
        {
            char curr = s.charAt(i);
            map.put(curr, map.getOrDefault(curr,0)+1);
        }

        /*for(Map.Entry<Character, Integer> entry: map.entrySet())
        {
            if(entry.getValue() == 1)
            {
                System.out.println(entry.getKey());
                break;
            }
        }*/

        //if want to return index of char
        int index = -1;
        for(int i=0; i<s.length(); i++)
        {
            if(map.get(s.charAt(i)) == 1)
            {
                index=i;
                System.out.println("Char: '"+s.charAt(i)+"' at index: "+i);
                break;
            }
        }
        if(index == -1)
        {
            System.out.println("No unique character found");
        }
    }

    public static void main(String[] args) {
        String str = "geeksforgeeks";
        firstNonRepChar(str);
    }
}
