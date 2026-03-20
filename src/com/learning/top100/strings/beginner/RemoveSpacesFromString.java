/**
 * @author: Manoj Kumar
 * @created date: 18-03-2026
 * @description: TODO
 */

package com.learning.top100.strings.beginner;

public class RemoveSpacesFromString {

    //return s.replaceAll("\\s","");

    //using custom logic
    public static String removeSpaces(String s)
    {
        StringBuilder sbl = new StringBuilder();

        for(char ch: s.toCharArray())
        {
            if(ch != ' ' && ch != '\t' && ch != '\n' && ch != '\r')
            {
                sbl.append(ch);
            }
        }
        return sbl.toString();
    }

    //using character class
    public static String removeSpacesAlt(String s)
    {
        StringBuilder sbl = new StringBuilder();

        for(char ch: s.toCharArray())
        {
            if(!(Character.isWhitespace(ch)))
            {
                sbl.append(ch);
            }
        }
        return sbl.toString();
    }
    public static void main(String[] args) {
        String str = "a b c de   e      f";
        //System.out.println(removeSpaces(str));
        System.out.println(removeSpaces(str));
    }
}
