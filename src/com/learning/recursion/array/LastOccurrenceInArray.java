package com.learning.recursion.array;

import java.util.Scanner;

public class LastOccurrenceInArray {

    public int idxOfLastOccur(int[] arr, int idx, int ele)
    {
        if(idx == arr.length)
            return -1;
        int iosa = idxOfLastOccur(arr, idx+1, ele);
        if(iosa == -1)
        {
            if(arr[idx] == ele)
                return idx;
            else
                return iosa;
        }
        else
            return iosa;
    }

    public static void main(String[] args) {
        System.out.println("Enter the size of array: ");

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] a = new int[size];

        for(int i=0; i<a.length; i++)
        {
            System.out.println("Enter element at position: "+i);
            a[i] = sc.nextInt();
        }

        System.out.println("Enter element to search: ");
        int se = sc.nextInt();

        LastOccurrenceInArray foia = new LastOccurrenceInArray();
        System.out.println("The index is: "+foia.idxOfLastOccur(a,0,se));
    }
}
