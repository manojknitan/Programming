/**
 * @author: Manoj Kumar
 * @created date: 16-03-2026
 * @description: TODO
 */

package com.learning.top100.strings.beginner;

import java.util.*;

public class RemoveDuplicateChars {

    //App-1
    public static void removeDuplicates(String s)
    {
        Set<Character> set = new LinkedHashSet<>();
        for(char ch: s.toCharArray())
        {
            set.add(ch);
        }
        System.out.println(set);
        //covert set to string
        StringBuilder sbl = new StringBuilder();
        for(char ch: set)
        {
            sbl.append(ch);
        }
        System.out.println(sbl.toString());
    }

    //App-2
    public static void removeDuplicatesAlt(String s)
    {
        String res = "";
        for(char ch : s.toCharArray())
        {
            if(res.indexOf(ch) == -1)
            {
                res+=ch;
            }
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        String str = "programming";
        removeDuplicatesAlt(str);
    }
}
