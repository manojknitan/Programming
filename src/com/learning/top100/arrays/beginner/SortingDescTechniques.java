/**
 * @author: Manoj Kumar
 * @created date: 18-03-2026
 * @description: TODO
 */

package com.learning.top100.arrays.beginner;

import java.util.Arrays;

public class SortingDescTechniques {
    //Bubble sort
    public static void bubbleSort(int[] arr)
    {
        for(int i=0; i<arr.length-1; i++)
        {
            for(int j=0; j<arr.length-1-i; j++)
            {
                if(arr[j]<arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    //Selection sort
    public static void selectionSort(int[] arr)
    {
        for(int i=0; i<arr.length; i++)
        {
            int minIdx=i;
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[j]>arr[minIdx])
                {
                    minIdx=j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    //Insertion sort
    public static void insertionSort(int[] arr)
    {
        for(int i=1; i< arr.length; i++)
        {
            int curr = arr[i];
            int prev = i-1;

            while(prev >=0 && arr[prev] < curr)
            {
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }

        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] a = {1,6,5,8,9,74,5,2,63};
        //bubbleSort(a);
        //selectionSort(a);
        insertionSort(a);
    }
}
