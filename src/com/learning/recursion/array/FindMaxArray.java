package com.learning.recursion.array;

import java.util.Scanner;

public class FindMaxArray {
    public int maxArray(int[] arr, int idx)
    {
        if(idx == arr.length-1)
            return arr[idx];
        int misa = maxArray(arr,idx+1);
        if(misa > arr[idx])
            return misa;
        else
            return arr[idx];
    }

    public static void main(String[] args) {
        System.out.println("Enter size of array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] a = new int[size];

        for(int i=0; i<a.length; i++)
        {
            System.out.println("Enter the element at position: "+i);
            a[i] = sc.nextInt();
        }

        System.out.println("The output is: ");
        FindMaxArray fma = new FindMaxArray();
        System.out.println(fma.maxArray(a,0));
    }
}
