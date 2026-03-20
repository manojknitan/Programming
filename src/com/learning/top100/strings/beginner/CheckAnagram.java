/**
 * @author: Manoj Kumar
 * @created date: 18-03-2026
 * @description: TODO
 */

package com.learning.top100.strings.beginner;

import java.util.HashMap;
import java.util.Map;

public class CheckAnagram {

    //using int array
    public static boolean isAnagram(String s1, String s2)
    {
        if(s1.length() != s2.length())
        {
            return false;
        }
        int[] arr = new int[256];
        for(int i=0; i< s1.length(); i++)
        {
            arr[s1.charAt(i)]++;
            arr[s2.charAt(i)]--;
        }

        for(int count: arr)
        {
            if(count != 0)
            {
                return false;
            }
        }
        return true;
    }

    //using hashmap
    public static boolean isAnagramAlt(String s1, String s2)
    {
        if(s1.length() != s2.length())
        {
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();
        for(char ch: s1.toCharArray())
        {
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        for(char ch1: s2.toCharArray())
        {
            if(!map.containsKey(ch1))
            {
                return false;
            }
            map.put(ch1, map.getOrDefault(ch1, 0)-1);
            if(map.get(ch1) == 0)
            {
                map.remove(ch1);
            }
        }
        return map.isEmpty();
    }
    public static void main(String[] args) {
        String s1 = "sileknt";
        String s2 = "listen";
        System.out.println(isAnagramAlt(s1, s2));
    }
}
