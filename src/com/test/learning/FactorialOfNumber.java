package com.test.learning;

public class FactorialOfNumber {

    int n=-6, factorial=1;
    public void factorial(int n)
    {
        if(n<0)
        {
            System.out.println("Invalid Input, pls enter positive number");
        }
        else if(n ==0 || n==1)
        {
            factorial=1;
            System.out.println("Test: "+factorial);
        }
        else {
            for (int i = 2; i <= n; i++)
            {
                factorial *= i;
            }
            System.out.println(factorial);
        }
    }
    public static void main(String[] args) {
        FactorialOfNumber f=new FactorialOfNumber();
        f.factorial(f.n);
    }
}
