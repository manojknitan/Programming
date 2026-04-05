/**
 * @author: Manoj Kumar
 * @created date: 24-03-2026
 * @description: TODO
 */

package com.learning.top100.strings.mid;

import java.util.HashSet;
import java.util.Set;

public class CheckPanagramString {
    public static boolean isPanagramUsingArray(String s)
    {
        boolean[] vis = new boolean[26];
        for(char ch: s.toLowerCase().toCharArray())
        {
            if(ch >= 'a' && ch <= 'z')
            {
                vis[ch-'a'] = true;
            }
        }

        for(boolean value: vis)
        {
            if(!value)
            {
                return false;
            }
        }
        return true;
    }


    public static boolean isPanagram(String s)
    {
        Set<Character> set = new HashSet<>();
        for(char ch: s.toLowerCase().toCharArray())
        {
            if(ch >= 'a' && ch <= 'z') {
                set.add(ch);
            }
        }
        return set.size() == 26;
    }

    public static void main(String[] args) {
        String str = "AbcdefGhijklmnopqrstuvwxyzabscdefghijklm";
        //System.out.println(isPanagram(str));
        System.out.println(isPanagramUsingArray(str));
    }
}
