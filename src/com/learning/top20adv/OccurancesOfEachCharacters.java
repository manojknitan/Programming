package com.learning.top20adv;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class OccurancesOfEachCharacters
{
    public static void occurances(String s)
    {
        int[] freq = new int[256];
        boolean[] print = new boolean[256];
        int count=0;

        for(int i=0; i<s.length(); i++)
        {
            char curr = s.charAt(i);
            freq[curr]++;
        }

        for(char c: s.toCharArray())
        {
            if(!print[c]) {
                count = freq[c];
                System.out.println(c + "----" + count);
            }
            print[c]=true;
        }
    }

    public static void occurancesByMap(String s)
    {
        Map<Character, Integer> map = new HashMap<>();

        for(char c: s.toCharArray())
        {
            map.put(c, map.getOrDefault(c,0)+1);
        }


        for(Map.Entry<Character,Integer> m :map.entrySet())
        {
            System.out.println(m.getKey()+"----"+m.getValue());
        }
    }

    public static void main(String[] args) {
        String str = "maanoojkuummaar";
        occurancesByMap(str);
    }
}
