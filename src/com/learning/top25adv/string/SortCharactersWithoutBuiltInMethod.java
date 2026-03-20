/**
 * @author: Manoj Kumar
 * @created date: 20-03-2026
 * @description: TODO
 */

package com.learning.top25adv.string;

import java.util.HashSet;
import java.util.Set;

public class SortCharactersWithoutBuiltInMethod {

    public static String sortCharacters(String s)
    {
        int[] freq = new int[256];

        for(char ch: s.toCharArray())
        {
            freq[ch]++;
        }

        StringBuilder sbl = new StringBuilder();
        for(int i=0; i<freq.length; i++)
        {
            while (freq[i] > 0)
            {
                sbl.append((char)i);
                freq[i]--;
            }
        }
        return sbl.toString();
    }


    public static void main(String[] args) {
        String str = "cdccaba";
        System.out.println(sortCharacters(str));
    }
}
