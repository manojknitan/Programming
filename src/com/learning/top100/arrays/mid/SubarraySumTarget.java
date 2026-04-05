/**
 * @author: Manoj Kumar
 * @created date: 27-03-2026
 * @description: TODO
 */

package com.learning.top100.arrays.mid;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumTarget {
    //Brute-force TC: O(n^2)
    public static void subarraySum(int[] arr, int tar)
    {
        for(int i=0; i<arr.length; i++)
        {
            int sum = 0;
            for(int j=i; j<arr.length; j++)
            {
                sum = sum + arr[j];
                if(sum == tar)
                {
                    System.out.println("["+arr[i]+","+arr[j]+"]");
                }
            }
        }
    }

    //Prefix sum: sum(i,j) = prefix sum (j) - prefix sum (i-1);
    // k = prefix  sum(j) - prefix sum (i-1)

    public static int subArraySumPrefix(int[] arr, int k)
    {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);

        int prefixSum = 0, result = 0;
        for(int num: arr)
        {
            prefixSum+=num;
            if(map.containsKey(prefixSum-k))
            {
                result = result + map.get(prefixSum-k);
            }

            map.put(prefixSum, map.getOrDefault(prefixSum, 0)+1);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7};
        int target = 7;
        subarraySum(a, target);
        //System.out.println(subarraySumUsingSet(a, target));
        System.out.println(subArraySumPrefix(a, target));
    }
}
