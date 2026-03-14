package com.learning.leetcode.arrays;

import java.util.HashMap;
import java.util.Map;

public class SubarraysSumEqualsK {

    //(n^2)
    public static int subarraysSumUsingBruteforce(int[] arr, int k)
    {
        int count=0;
        for(int i=0; i<arr.length; i++)
        {
            int sum = 0;
            for(int j=i; j< arr.length; j++)
            {
                sum += arr[j];
                if(sum == k)
                    count++;
            }
        }
        return count;
    }

    //O(n)
    public static int subarraySumUsingHashmap(int[] arr, int k)
    {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int ans=0, prefSum=0;
        for(int i=0; i<arr.length; i++)
        {
            prefSum+=arr[i];

            if(map.containsKey(prefSum-k))
            {
                ans+=map.get(prefSum-k);
            }

            map.put(prefSum, map.getOrDefault(prefSum,0)+1);

        }
        return ans;
    }
    public static void main(String[] args) {
        int[] a = {1,2,3};
        //System.out.println(subarraysSumUsingBruteforce(a, 3));
        System.out.println(subarraySumUsingHashmap(a, 3));
    }
}
