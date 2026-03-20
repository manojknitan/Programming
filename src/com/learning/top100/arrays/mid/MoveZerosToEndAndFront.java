/**
 * @author: Manoj Kumar
 * @created date: 19-03-2026
 * @description: TODO
 */

package com.learning.top100.arrays.mid;

import java.util.Arrays;

public class MoveZerosToEndAndFront {

    public static void moveToEnd(int[] arr)
    {
        int k=0;
        /*for(int i=0; i<arr.length; i++)
        {
            if(arr[i] != 0)
            {
                arr[k++] = arr[i];
            }
        }
        while(k < arr.length)
        {
            arr[k++] = 0;
        }*/

        for(int i=0; i< arr.length; i++)
        {
            if(arr[i] != 0)
            {
                if(i != k)
                {
                    int temp = arr[k];
                    arr[k] = arr[i];
                    arr[i] = temp;
                }
                k++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void moveToFront(int[] arr)
    {
        int k=arr.length-1;
        for(int i= arr.length-1; i>=0; i--)
        {
            if(arr[i] != 0)
            {
                if(i != k)
                {
                    int temp = arr[k];
                    arr[k] = arr[i];
                    arr[i] = temp;
                }
                k--;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] a = {1,0,0,3,6,0,5,0,9,0,4,0,8,0,0,8};
        //moveToEnd(a);
        moveToFront(a);

    }
}
