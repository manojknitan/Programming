/**
 * @author: Manoj Kumar
 * @created date: 20-03-2026
 * @description: TODO
 */

package com.learning.top25adv.string;

import java.util.*;

public class GroupAnagrams {

    public static List<List<String>> groupAnagram(String[] s)
    {
        Map<String, List<String>> map = new HashMap<>();

        for(String str: s)
        {
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);

            if(!map.containsKey(key))
            {
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] str = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagram(str));
    }
}
