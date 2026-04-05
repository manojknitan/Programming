/**
 * @author: Manoj Kumar
 * @created date: 23-03-2026
 * @description: TODO
 */

package com.learning.top100.strings.mid;

public class RemoveCharsFromString {
    public static void removeChars(String s)
    {
        StringBuilder sbl = new StringBuilder();

        for(char ch: s.toCharArray())
        {
            if(ch != 'a') {
                sbl.append(ch);
            }
        }
        System.out.println(sbl.toString());
    }
    public static void main(String[] args) {
        String str = "Banana";
        removeChars(str);
    }
}
