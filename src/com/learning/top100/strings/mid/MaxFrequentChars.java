/**
 * @author: Manoj Kumar
 * @created date: 23-03-2026
 * @description: TODO
 */

package com.learning.top100.strings.mid;

import java.util.HashMap;
import java.util.Map;

public class MaxFrequentChars {
    //using int array
    public static void maxOccuringChar(String s)
    {
        int[] freq = new int[256];
        for(char ch: s.toCharArray())
        {
            freq[ch]++;
        }

        char ch ='\0'; int count=-1;
        for(char curr: s.toCharArray())
        {
            if(freq[curr] > count)
            {
                count = freq[curr];
                ch = curr;
            }
        }
        System.out.println(ch+"=="+count);
    }

    //using hashmap
    public static void maxFrequentChar(String s)
    {
        Map<Character, Integer> map = new HashMap<>();
        for(char ch: s.toCharArray())
        {
            map.put(ch, map.getOrDefault(ch,0)+1);
        }

        char curr = '\0'; int count=-1;
        for(char ch: s.toCharArray())
        {
            if(map.get(ch) > count)
            {
                count = map.get(ch);
                curr = ch;
            }
        }
        System.out.println(curr+"--"+count);
    }
    public static void main(String[] args) {
        String str = "Banana";
        //maxOccuringChar(str);
        maxFrequentChar(str);
    }
}
