/**
 * @author: Manoj Kumar
 * @created date: 19-03-2026
 * @description: TODO
 */

package com.learning.top100.arrays.mid;

import java.util.HashSet;
import java.util.Set;

public class FindCommonUnionIntersectionOfElements {

    public static void commonElements(int[] arr1, int[] arr2)
    {
        Set<Integer> set = new HashSet<>();
        for(int num: arr1)
        {
            set.add(num);
        }
        for(int num: arr2)
        {
            if(set.contains(num))
            {
                System.out.print(num+" ");
            }
        }
    }

    public static void union(int[] arr1, int[] arr2)
    {
        Set<Integer> set = new HashSet<>();
        for(int num: arr1)
        {
            set.add(num);
        }
        for(int num: arr2)
        {
            set.add(num);
        }
        System.out.println(set);
    }

    public static void intersection(int[] arr1, int[] arr2)
    {
        Set<Integer> set = new HashSet<>();
        for(int num: arr1)
        {
            set.add(num);
        }

        for(int num: arr2)
        {
            if(set.contains(num))
            {
                System.out.print(num+" ");
                set.remove(num);
            }
        }
    }
    public static void main(String[] args) {
        int[] a1={1,2,2,4,6,3,6,9,5};
        int[] a2={2,2,4,3,5,6,8,7,9};
        //commonElements(a1, a2);
        //union(a1, a2);
        intersection(a1, a2);
    }
}
