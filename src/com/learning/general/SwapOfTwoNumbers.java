package com.learning.general;

public class SwapOfTwoNumbers {

    int x=10, y=30;


    public void m1(int a, int b)
    {
        System.out.println("Before Swap: x="+a+", y="+b);

        //1.Using 3rd variable
        /*int temp = a;
        a=b;
        b=temp;*/

        //2. Using + and - operator
        /*a=a+b;
        b=a-b;
        a=a-b;*/

        //3. Using * and / operator
        /*a=a*b;
        b=a/b;
        a=a/b;*/

        //4. Using Bitwise XOP operator
        /*a=a^b;
        b=a^b;
        a=a^b;*/

        //5. In Single statement
        b=a+b-(a=b);

        System.out.println("After Swap: x="+a+", y="+b);
    }


    public static void main(String[] args) {
        SwapOfTwoNumbers swap = new SwapOfTwoNumbers();
        swap.m1(swap.x,swap.y);
    }
}
