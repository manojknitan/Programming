package com.learning.array;

public class StrictlyIncreasingOrder {
    public static boolean strictlyIncreasing(int[] arr)
    {
        for(int i=0; i<arr.length-1; i++)
        {
            if(arr[i+1]<=arr[i])
                return false;
        }
        return true;
    }

    public static boolean strictlyDecreasing(int[] arr)
    {
        for(int i=0; i<arr.length-1; i++)
        {
            if(arr[i+1]>=arr[i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] a = {10,20,23,25,26,30};
        int[] b = {90,85,65,58,23,16};
        //System.out.println(strictlyIncreasing(a));
        System.out.println(strictlyDecreasing(b));
    }
}
