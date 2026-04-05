/**
 * @author: Manoj Kumar
 * @created date: 25-03-2026
 * @description: TODO
 */

package com.learning.top100.strings.mid;

public class SortCharsInString {
    public static void sortChars(String s)
    {
        int[] freq = new int[256];

        for(char ch:s.toCharArray())
        {
            freq[ch]++;
        }

        StringBuilder sbl = new StringBuilder();

        for(int i=0; i<freq.length; i++)
        {
            while (freq[i]-- > 0)
            {
                sbl.append((char)i);
            }
        }
        System.out.println(sbl.toString());
    }
    public static void main(String[] args) {
        String str = "dbaca";
        sortChars(str);
    }
}
