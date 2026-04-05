/**
 * @author: Manoj Kumar
 * @created date: 27-03-2026
 * @description: TODO
 */

package com.learning.top100.strings.beginner;

import java.util.Arrays;

public class SwapTheWords {
    public static String swapWords(String s)
    {
        String[] tokens = s.split("\\s+");
        for(int i=0, j=tokens.length-1; i<j; i++,j--)
        {
            String temp = tokens[i];
            tokens[i] = tokens[j];
            tokens[j] = temp;
        }
        return String.join(" ",tokens);
    }
    public static void main(String[] args) {
        String str = "Hello World Manoj";
        System.out.println(swapWords(str));
    }
}
