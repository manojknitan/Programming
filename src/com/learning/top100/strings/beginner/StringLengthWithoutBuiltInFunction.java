/**
 * @author: Manoj Kumar
 * @created date: 16-03-2026
 * @description: TODO
 */

package com.learning.top100.strings.beginner;

public class StringLengthWithoutBuiltInFunction {
    public static int findLength(String s)
    {
        int count=0;
        while(true)
        {
            try{
                s.charAt(count);
                count++;
            }
            catch (Exception e)
            {
                break;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str = "Automation";
        System.out.println(findLength(str));
    }
}
