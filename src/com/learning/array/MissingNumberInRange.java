package com.learning.array;

public class MissingNumberInRange {
    public static void missingRange(int[] arr, int upper)
    {
        int start, end, n=arr.length-1;
        for(int i=0; i<n; i++)
        {
            if ((arr[i + 1] - arr[i]) > 1)
            {
                start = arr[i] + 1;
                end = arr[i + 1] - 1;
                if (start == end)
                {
                    System.out.print(start + ",");
                }
                else
                {
                    System.out.print(start + "-" + end + ",");
                }
            }
        }
            if(arr[n]<upper)
            {
                System.out.print((arr[n]+1)+"-"+upper);
            }
    }
    public static void main(String[] args) {
        int[] a = {0,1,3,10,25,75};
        missingRange(a, 99);
    }
}
