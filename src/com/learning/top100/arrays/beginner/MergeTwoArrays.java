/**
 * @author: Manoj Kumar
 * @created date: 18-03-2026
 * @description: TODO
 */

package com.learning.top100.arrays.beginner;

import java.util.Arrays;

public class MergeTwoArrays {

    public static void merge(int[] arr1, int[] arr2)
    {
        int n1=arr1.length, n2=arr2.length;
        int[] res = new int[n1+n2];

        int k=0;
        for(int num: arr1)
        {
            res[k++]=num;
        }

        for(int num: arr2)
        {
            res[k++]=num;
        }
        System.out.println(Arrays.toString(res));
    }
    public static void main(String[] args) {
        int[] a1={1,2,5};
        int[] a2={2,4,5,6};
        merge(a1, a2);
    }
}
