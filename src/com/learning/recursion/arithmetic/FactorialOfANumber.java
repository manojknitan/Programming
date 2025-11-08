package com.learning.recursion.arithmetic;

public class FactorialOfANumber {

    public int factorial(int n)
    {
        if(n==0 || n==1)
            return 1;
       int value;
       value = n*factorial(n-1);
       return value;

    }

    public static void main(String[] args) {
        FactorialOfANumber fon = new FactorialOfANumber();
        System.out.println(fon.factorial(2));

    }
}
