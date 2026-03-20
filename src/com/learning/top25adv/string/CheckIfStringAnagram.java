/**
 * @author: Manoj Kumar
 * @created date: 20-03-2026
 * @description: TODO
 */

package com.learning.top25adv.string;

import java.util.HashMap;
import java.util.Map;

public class CheckIfStringAnagram {
    public static boolean isAnagram(String s1, String s2)
    {
        if(s1.length() != s2.length())
            return false;

        Map<Character, Integer> map = new HashMap<>();
        for(char ch: s1.toCharArray())
        {
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        for(char ch: s2.toCharArray())
        {
            if(!map.containsKey(ch))
            {
                return false;
            }
            map.put(ch, map.get(ch)-1);

            if(map.get(ch) == 0)
            {
                map.remove(ch);
            }
        }
        return map.isEmpty();
    }

    public static void main(String[] args) {
        String str1 = "lisiten", str2 = "silent";
        System.out.println(isAnagram(str1, str2));
    }
}
