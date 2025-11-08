package com.learning.general;

public class NoOfDigit {
    int num=1234565616, count=0;
    public void countDigit(int n)
    {
        while (n>0)
        {
            n = n / 10;
            count++;
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        NoOfDigit nod = new NoOfDigit();
        nod.countDigit(nod.num);
    }
}
