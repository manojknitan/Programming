package com.learning.string;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class PrintDuplicateOnlyOnce {
    public static void printDuplicateOnceBySet(String s)
    {
        Set<Character> set = new LinkedHashSet<>();
        for(int i=0; i<s.length(); i++)
        {
            char curr = s.charAt(i);
            if(set.contains(curr))
            {
                continue;
            }
            set.add(curr);
        }
        System.out.println(set);
        StringBuilder res = new StringBuilder();
        for(char ch: set)
        {
            res.append(ch);
        }
        System.out.println(res.toString());
    }

    public static void main(String[] args) {
        String str = "Google";
        printDuplicateOnceBySet(str);
    }
}
