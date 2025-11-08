package com.learning.recursion.pattern;

import java.util.Scanner;

public class PrintDecIncOrder {
    
    public void decIncOrder(int n)
    {
        if(n==0)
            return;
        System.out.println(n);
        decIncOrder(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {

        System.out.println("Enter input: ");

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.println("Output is: ");
        
        PrintDecIncOrder pdio = new PrintDecIncOrder();
        pdio.decIncOrder(input);

       /* //for dec order.
        PrintDecreasingOrder pdo = new PrintDecreasingOrder();
        pdo.decreasingOrder(n);

        System.out.println();

        //for inc order.
        PrintIncreasingOrder pio = new PrintIncreasingOrder();
        pio.increasingOrder(n);*/
    }
}
