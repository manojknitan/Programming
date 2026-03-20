/**
 * @author: Manoj Kumar
 * @created date: 19-03-2026
 * @description: TODO
 */

package com.learning.top100.arrays.mid;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateFromArray {
    //using int array
    public static void removeDuplicates(int[] arr)
    {
        int[] res = new int[256];

        for(int num: arr)
        {
            res[num]++;
        }
        for(int num: arr)
        {
            if(res[num] != 0)
            {
                System.out.print(num+" ");
                res[num]=0;
            }
        }
    }

    //using set
    public static void removeDuplicatesUsingSet(int[] arr)
    {
        Set<Integer> set = new HashSet<>();
        for(int num: arr)
        {
            set.add(num);
        }
        System.out.println(set);
    }
    public static void main(String[] args) {
        int[] a = {1,2,5,6,6,3,2,9,8,8,9};
        //removeDuplicates(a);
        removeDuplicatesUsingSet(a);
    }
}
