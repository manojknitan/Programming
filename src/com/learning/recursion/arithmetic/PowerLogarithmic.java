package com.learning.recursion.arithmetic;

import java.util.Scanner;

public class PowerLogarithmic {

    public int powerLog(int x, int n)
    {
        if(n == 0)
            return 1;
        int xpnb2 = powerLog(x, n/2);
        int xn = xpnb2 * xpnb2;
        if(n%2==1)
            xn = x * xn;
        return xn;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter input for base: ");
        int base = sc.nextInt();

        System.out.println("Enter input for power: ");
        int pow = sc.nextInt();

        PowerLogarithmic pl = new PowerLogarithmic();
        System.out.println("The output is: ");
        System.out.println(pl.powerLog(base, pow));
    }
}
