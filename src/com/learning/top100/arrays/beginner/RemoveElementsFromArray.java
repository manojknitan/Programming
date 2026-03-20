/**
 * @author: Manoj Kumar
 * @created date: 18-03-2026
 * @description: TODO
 */

package com.learning.top100.arrays.beginner;

import java.util.Arrays;

public class RemoveElementsFromArray {
    public static void removeElement(int[] arr, int e)
    {
        //count elements to keep
        int count=0;
        for(int num: arr)
        {
            if(num != e)
            {
                count++;
            }
        }
        //create new array of size remaining elements
        int[] res = new int[count];

        //copy elements
        int idx=0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] != e)
            {
                res[idx++] = arr[i];
            }
        }
        System.out.println(Arrays.toString(res));
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,4,7,8,4,4};
        removeElement(a, 4);
    }
}
