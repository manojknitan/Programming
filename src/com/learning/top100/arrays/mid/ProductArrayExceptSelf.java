/**
 * @author: Manoj Kumar
 * @created date: 24-03-2026
 * @description: TODO
 */

package com.learning.top100.arrays.mid;

import java.util.Arrays;

public class ProductArrayExceptSelf {
    /*
    * result of ith positioned element = prod of left of i X prod of right of i
    * */

    //TC: O(n^2)
    public static void productArray(int[] arr)
    {
        int[] res = new int[arr.length];


        for(int i=0; i<arr.length; i++)
        {
            int leftProd=1, rightProd=1;
            int left = i-1;
            int right = i+1;

            while(left >= 0)
            {
                leftProd =leftProd*arr[left];
                left--;
            }

            while (right < arr.length)
            {
                rightProd = rightProd*arr[right];
                right++;
            }

            int finalProd = leftProd*rightProd;

            res[i] = finalProd;

        }

        System.out.println(Arrays.toString(res));
    }

    //O(n)
    public static int[] prodExceptSelf(int[] arr)
    {
        int[] left = new int[arr.length];
        int[] right = new int[arr.length];

        left[0] = 1;
        for(int i=1; i<arr.length; i++)
        {
            left[i] = left[i-1]*arr[i-1];
        }

        right[arr.length-1] = 1;
        for(int j= arr.length-2; j>-1; j--)
        {
            right[j] = right[j+1]*arr[j+1];
        }

        int[] res = new int[arr.length];
        for(int i=0; i< arr.length; i++)
        {
            res[i] = left[i]*right[i];
        }
        return res;
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        //productArray(a);
        //System.out.println(Arrays.toString(prodExceptSelf(a)));
        int[] result = prodExceptSelf(a);
        for(int num: result)
        {
            System.out.print(num+" ");
        }

    }
}
