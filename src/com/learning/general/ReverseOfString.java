package com.learning.general;

import java.util.Scanner;

public class ReverseOfString {

    public String reverseString(String s)
    {
        String rev="";
        int len=s.length();

        //1. Without using in-built method
        /*for(int i=len-1;i>=0;i--)
        {
            rev = rev + s.charAt(i);
        }
        return rev;*/

        //2. Optimised method
        /*char[] ch = s.toCharArray();
        char temp;
        for(int i=0,j=ch.length-1; i<(ch.length)/2; i++,j--)
        {
            temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
        }
        return new String(ch);*/

        //3. Using StringBuffer class
        StringBuffer sbf = new StringBuffer(s);
        rev =  sbf.reverse().toString();
        return rev;
    }
    public static void main(String[] args) {
        System.out.println("Enter the String to Reverse: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("String before to reverse: "+str);
        ReverseOfString obj = new ReverseOfString();
        String reversed = obj.reverseString(str);
        System.out.println("String after reversing: "+reversed);
        //String str = "Manoj";
        //reverseString("Manoj");

    }
}
