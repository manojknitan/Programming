/**
 * @author: Manoj Kumar
 * @created date: 05-04-2026
 * @description: TODO
 */

package com.learning.top100.strings.beginner;

public class PrintWordsRecursively {
    public static void printWordRecursive(String s)
    {
        String[] str = s.split("\\s+");


        for(int i=0; i<str.length; i++)
        {
            StringBuilder sbl = new StringBuilder();
            for(int j=0; j<=i; j++)
            {
                sbl = sbl.append(str[j]).append(" ");
                //System.out.println(sbl.toString());
            }
            System.out.println(sbl.toString());
        }
    }

    public static void main(String[] args) {
        String st = "I Love Programming";
        printWordRecursive(st);
    }
}
