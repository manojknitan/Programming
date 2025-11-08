package com.learning.recursion.pattern;

import java.util.Scanner;

public class PrintDecreasingOrder {

    public void decreasingOrder(int n)
    {
        if(n==0)
            return;
        System.out.println(n);
        decreasingOrder(n-1);
    }

    public static void main(String[] args) {
        System.out.println("Enter input value: ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.println("The output is: ");
        PrintDecreasingOrder pdo = new PrintDecreasingOrder();
        pdo.decreasingOrder(input);
    }
}
