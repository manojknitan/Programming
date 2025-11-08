package com.learning.recursion.arithmetic;

import java.util.Scanner;

public class PowerLinear {

    public int power(int x, int n)
    {
        int value;
        if(n==0)
            return 1;
        value = x * power(x,n-1);
        return value;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter input for base: ");
        int base = sc.nextInt();

        System.out.println("Enter input for power: ");
        int pow = sc.nextInt();

        PowerLinear pl = new PowerLinear();

        System.out.println("The output is: ");
        System.out.println(pl.power(base,pow));
    }
}
