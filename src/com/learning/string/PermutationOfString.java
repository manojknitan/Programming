package com.learning.string;

import java.util.HashSet;
import java.util.Set;

public class PermutationOfString {
    public static void permute(char[] ch, int idx)
    {

        if(idx == ch.length)
        {
            System.out.println(ch);
            return;
        }

        Set<Character> set = new HashSet<>();

        for(int i=idx; i<ch.length; i++)
        {
            if(set.contains(ch[i]))
            {
                continue;
            }

            set.add(ch[i]);

            swap(ch, idx, i);
            permute(ch, idx+1);
            swap(ch, idx, i);
        }
    }

    static void swap(char[] ar, int i, int j)
    {
        char temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }

    public static void main(String[] args) {
        String s = "ABB";
        char[] c = s.toCharArray();
        permute(c, 0);
    }
}
