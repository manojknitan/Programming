package com.learning.collectionRevisit.hashSet;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatePreservingFirstOccurance {

    public static void removeDupPresFirstOccurance(String s)
    {
        Set<Character> set = new HashSet<>();
        StringBuilder res = new StringBuilder();

        for(char ch: s.toCharArray())
        {
            if(set.add(ch))
            {
                res.append(ch);
            }
        }

        System.out.println(res);
    }

    public static void main(String[] args) {
        String str = "programming";
        removeDupPresFirstOccurance(str);
    }
}
