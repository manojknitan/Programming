package com.learning.general;

import java.util.Scanner;

public class ReverseOfNumber {

    public void reversNumber(int num) {
        System.out.println("Before Reverse, Number is: ="+num);

        //1. Using without in-built method
        /*int rev=0;
        while (num!=0){
            rev=rev*10+num%10;
            num=num/10;
        }*/

        //2. Using StingBuffer class
        /*StringBuffer sbf=new StringBuffer(String.valueOf(num));
        StringBuffer reverse = sbf.reverse();
        System.out.println("Reversed number is: = "+reverse);*/

        //3. Using StringBuilder class
        StringBuilder sbl = new StringBuilder();
        sbl.append(num);
        StringBuilder rev = sbl.reverse();
        System.out.println("After Reverse, Number is: "+rev);
    }

    public static void main(String[] args) {
        System.out.println("Enter the number to be reversed: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ReverseOfNumber reverseNumber = new ReverseOfNumber();
        reverseNumber.reversNumber(n);
    }
}
