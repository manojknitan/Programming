package com.learning.collectionRevisit.hashSet;

import java.util.HashSet;
import java.util.Set;

public class CheckAllUniqueCharacter {
    public static boolean ifAllUnique(String s)
    {
        Set<Character> set = new HashSet<>();
        
        for(char c: s.toCharArray())
        {
            if(!set.add(c))
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "abecdef";
        System.out.println(ifAllUnique(str));
    }
}
