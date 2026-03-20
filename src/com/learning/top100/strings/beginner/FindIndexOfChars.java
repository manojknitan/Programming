/**
 * @author: Manoj Kumar
 * @created date: 18-03-2026
 * @description: TODO
 */

package com.learning.top100.strings.beginner;

public class FindIndexOfChars {
    public static int findIndex(String s, char ch)
    {
        int idx=-1;
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i) == ch) {
                idx = i;
                break;
            }
        }
        if(idx != -1)
        {
            return idx;
        }
        return -1;
    }

    public static int findIndexAlt(String s, char ch)
    {
        int idx=-1;
        idx = s.indexOf(ch);
        return idx;
    }
    public static void main(String[] args) {
        String str = "Hello";
        char ch = 'l';
        //System.out.println(findIndex(str, ch));
        System.out.println(findIndexAlt(str, ch));
    }
}
