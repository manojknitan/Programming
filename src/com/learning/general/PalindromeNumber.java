package com.learning.general;

public class PalindromeNumber {

    int n = 121;
    public void testPalindromeNumber(int num){
        int rev=0;
        while(num!=0){
            rev=rev*10+num%10;
            num=num/10;
        }
        if(rev==n){
            System.out.println("Number is palindrome....");
        }
        else
        {
            System.out.println("Number is not palindrome....");
        }
    }
    public static void main(String[] args) {
        //int n = 121;
        PalindromeNumber p = new PalindromeNumber();
        p.testPalindromeNumber(p.n);
    }
}
