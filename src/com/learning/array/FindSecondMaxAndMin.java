package com.learning.array;

public class FindSecondMaxAndMin {
    public static void secondMaxAndMin(int[] arr)
    {
        int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]>max)
            {
                secondMax = max;
                max = arr[i];
            }
            else if(arr[i]>secondMax && arr[i] != max )
            {
                secondMax = arr[i];
            }

            if(arr[i] < min)
            {
                secondMin = min;
                min = arr[i];
            }
            else if(arr[i] < secondMin && arr[i] != min)
            {
                secondMin = arr[i];
            }
        }

        System.out.println(secondMax+"--"+secondMin);
    }

    public static void main(String[] args) {
        int[] a = {2,9,6,8,5,6,5,2,9,8};
        secondMaxAndMin(a);
    }
}
