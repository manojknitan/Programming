/**
 * @author: Manoj Kumar
 * @created date: 18-03-2026
 * @description: TODO
 */

package com.learning.top100.strings.beginner;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PrintDuplicates {
    //using array
    public static void printDuplicates(String s)
    {
        int[] arr = new int[256];
        boolean[] vis = new boolean[256];

        for (char ch: s.toCharArray())
        {
            arr[ch]++;
        }

        for(char ch: s.toCharArray())
        {
            if((arr[ch] > 1) && (!vis[ch]))
            {
                System.out.print(ch);
            }
            vis[ch] = true;
        }
    }

    //using set
    public static void printDuplicatesSet(String s) {
        Set<Character> set = new HashSet<>();

        for (char ch : s.toCharArray()) {
            if (!(set.contains(ch))) {
                set.add(ch);
                //System.out.print(ch+" ");
            } else {
                System.out.print(ch + " ");
            }
        }
    }

        //using map
        public static void printDuplicateUsingMap(String s)
        {
            Map<Character, Integer> map = new HashMap<>();
            for(char ch: s.toCharArray())
            {
                map.put(ch, map.getOrDefault(ch, 0)+1);
            }
            for(char ch: s.toCharArray())
            {
                if(map.get(ch)>1)
                {
                    System.out.println(ch+" ");
                    map.put(ch, 0);
                }
            }
        }

    public static void main(String[] args) {
        String str = "Programming";
        //printDuplicates(str);
        //printDuplicatesSet(str);
        printDuplicateUsingMap(str);
    }
}
