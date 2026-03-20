/**
 * @author: Manoj Kumar
 * @created date: 15-03-2026
 * @description: TODO
 */

package com.learning.top100.strings.beginner;

public class SwapCharactersInWord {
    public static String swapChars(String s)
    {
        StringBuilder sbl = new StringBuilder();
        for(char ch : s.toLowerCase().toCharArray())
        {
            if(ch == 'a')
                sbl.append('o');
            else if(ch == 'o')
                sbl.append('a');
            else
                sbl.append(ch);
        }
        return sbl.toString();
    }

    public static String swapCharsAlt(String s)
    {
        char[] ch = s.toLowerCase().toCharArray();

        for(int i=0; i<s.length(); i++)
        {
            if(ch[i] == 'a')
            {
                ch[i] = 'o';
            }
            else if(ch[i] == 'o')
            {
                ch[i] = 'a';
            }
        }
        return new String(ch);
    }
    public static void main(String[] args) {
        String str = "Automation";
        System.out.println(swapCharsAlt(str));
    }
}
