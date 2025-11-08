package com.learning.recursion.pattern;

public class PrintIncreasingOrder
{
    public void increasingOrder(int n)
    {
        if(n==0)
            return;
        increasingOrder(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        PrintIncreasingOrder pio = new PrintIncreasingOrder();
        pio.increasingOrder(5);
    }
}
