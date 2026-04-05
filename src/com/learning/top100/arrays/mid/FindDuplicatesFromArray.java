/**
 * @author: Manoj Kumar
 * @created date: 23-03-2026
 * @description: TODO
 */

package com.learning.top100.arrays.mid;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicatesFromArray {

    public static void printDuplicate(int[] arr)
    {
        int[] freq = new int[256];

        for(int num: arr)
        {
            freq[num]++;
        }

        for(int num: arr)
        {
            if(freq[num] > 1)
            {
                System.out.print(num);
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[] a = {1,2,2,3,2,4,5};
        printDuplicate(a);
    }
}
