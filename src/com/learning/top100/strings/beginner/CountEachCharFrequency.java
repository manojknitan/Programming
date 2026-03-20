/**
 * @author: Manoj Kumar
 * @created date: 18-03-2026
 * @description: TODO
 */

package com.learning.top100.strings.beginner;

import java.util.HashMap;
import java.util.Map;

public class CountEachCharFrequency {

    //using array
    public static void occurances(String s)
    {
        int[] arr = new int[256];
        boolean[] vis = new boolean[256];

        for(char ch: s.toCharArray())
        {
            arr[ch]++;
        }

        for(char ch: s.toCharArray())
        {
            if(!vis[ch]) {
                System.out.print(ch + "" + arr[ch]);
            }
            vis[ch] = true;
        }
    }

    //using map
    public static void occurancesAlt(String s)
    {
        Map<Character, Integer> map = new HashMap<>();
        for(char ch: s.toCharArray())
        {
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        //System.out.println(map);
        for(Map.Entry<Character, Integer> e: map.entrySet())
        {
            System.out.print(e.getKey()+"="+e.getValue());
        }
    }
    public static void main(String[] args) {
        String str = "aaabbc";
        //occurances(str);
        occurancesAlt(str);
    }
}
