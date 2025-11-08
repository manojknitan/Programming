package com.learning.recursion.array;

import java.util.Scanner;

public class PrintArray {
    public void displayArray(int[] arr, int idx)
    {
        if(idx == arr.length)
            return;
        System.out.println(arr[idx]);
        displayArray(arr, idx+1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i=0; i<a.length; i++) {
            System.out.println("Enter element for position: "+i);
            a[i] = sc.nextInt();
        }

        PrintArray pa = new PrintArray();
        System.out.println("The entered array is: ");
        pa.displayArray(a,0);
    }
}
