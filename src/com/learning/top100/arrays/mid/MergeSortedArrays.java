/**
 * @author: Manoj Kumar
 * @created date: 05-04-2026
 * @description: TODO
 */

package com.learning.top100.arrays.mid;

import java.util.ArrayList;
import java.util.List;

public class MergeSortedArrays {
    //Brute-force
    public static void mergeSortedArray(int[] arr1, int[] arr2)
    {
        List<Integer> res = new ArrayList<>();
        int n1=arr1.length, n2= arr2.length;
        int i=0,j=0,k=0;

        while (i<n1 && j<n2)
        {
            if(arr1[i] < arr2[j])
            {
                res.add(arr1[i]);
                i++;
            }
            else
            {
                res.add(arr2[j]);
                j++;
            }
        }

        //copy remaining
        while (i < n1)
        {
            res.add(arr1[i]);
            i++;
        }

        while (j < n2)
        {
            res.add(arr2[j]);
            j++;
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        int[] a1 = {1,2,3,4,8,9,10,12,15};
        int[] a2 = {4,5,6,7};
        mergeSortedArray(a1, a2);
    }
}
