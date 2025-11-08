package com.learning.recursion.array;

import java.util.Scanner;

public class PrintReverseArray {
    public void displayReverseArray(int[] arr, int idx)
    {
        if(idx == arr.length)
            return;
        displayReverseArray(arr, idx+1);
        System.out.println(arr[idx]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        int[] a = new int[size];

        for(int i=0; i<a.length; i++)
        {
            System.out.println("Enter element at position: "+i);
            a[i]=sc.nextInt();
        }

        PrintReverseArray pra = new PrintReverseArray();
        System.out.println("The output is: ");
        pra.displayReverseArray(a, 0);
    }
}
