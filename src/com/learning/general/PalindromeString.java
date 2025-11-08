package com.learning.general;

public class PalindromeString {

    String str = "ABAABa";

    public void checkPalindrome(String s) {
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--)
        {
            rev = rev + s.charAt(i);
        }
        if (str.equals(rev)) {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
    }

    public static void main(String[] args) {
        PalindromeString p = new PalindromeString();
        p.checkPalindrome(p.str);
    }
}
