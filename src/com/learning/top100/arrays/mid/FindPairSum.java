/**
 * @author: Manoj Kumar
 * @created date: 19-03-2026
 * @description: TODO
 */

package com.learning.top100.arrays.mid;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindPairSum {
    //Brute-force approach - O(n^2), O(1)
    public static void pairSum(int[] arr, int target)
    {
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if((arr[i]+arr[j])== target)
                {
                    System.out.println(arr[i]+","+arr[j]);
                }
            }

        }
    }

    //using set - TC: O(n), SC: O(n)
    public static void paiSumUsingSet(int[] arr, int target)
    {
        Set<Integer> set = new HashSet<>();
        for(int num: arr)
        {
            int complement = target-num;
            if(set.contains(complement))
            {
                System.out.println(num+","+complement);
            }
            set.add(num);
        }
    }

    //using two pointer - if array is sorted
    public static void pairSumTwoPointer(int[] arr, int target)
    {
        Arrays.sort(arr);

        int left=0, right=arr.length-1;
        while (left<right)
        {
            int sum = arr[left]+arr[right];

            if(sum == target) {
                System.out.println(arr[left] + "," + arr[right]);
                left++;
                right--;
            }
            else if(sum > target)
            {
                right--;
            }
            else {
                left++;
            }

        }

    }
    public static void main(String[] args) {
        int[] a = {2,3,4,5,6,7};
        //pairSum(a, 7);
        //paiSumUsingSet(a, 7);
        pairSumTwoPointer(a, 7);
    }
}
