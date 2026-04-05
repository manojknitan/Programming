/**
 * @author: Manoj Kumar
 * @created date: 02-04-2026
 * @description: TODO
 */

package com.learning.top100.strings.mid;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicString {
    //Brute-force
    public static boolean isIsomorphic(String s1, String s2)
    {
        if(s1 == null || s2 == null || s1.length() != s2.length())
            return false;

        for(int i=0; i<s1.length(); i++)
        {
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);

            for(int j=0; j<s2.length(); j++)
            {
                if(s1.charAt(j) == ch1 && s2.charAt(j) != ch2)
                {
                    return false;
                }
                if(s2.charAt(j) == ch2 && s1.charAt(j) != ch1)
                {
                    return false;
                }
            }
        }
        return true;
    }

    //Using hashmap
    public static boolean isIsomorphicUsingHashMap(String s1, String s2)
    {
        if(s1 == null || s2 == null || s1.length() != s2.length())
            return false;

        Map<Character, Character> map = new HashMap<>();

        for(int i=0; i<s1.length(); i++)
        {
            char org = s1.charAt(i);
            char rep = s2.charAt(i);

            if(!map.containsKey(org))
            {
                if(!map.containsValue(rep))
                {
                    map.put(org, rep);
                }
                else {
                    return false;
                }
            }
            else
            {
                char mappedChar = map.get(org);
                if(mappedChar != rep)
                {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str1 = "add";
        String str2 = "egg";
        //System.out.println(isIsomorphic(str1, str2));
        System.out.println(isIsomorphicUsingHashMap(str1, str2));
    }
}
