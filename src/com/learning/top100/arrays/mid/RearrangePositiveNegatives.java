/**
 * @author: Manoj Kumar
 * @created date: 31-03-2026
 * @description: TODO
 */

package com.learning.top100.arrays.mid;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RearrangePositiveNegatives {
    public static int[] rearrange(int[] arr)
    {
        int[] res = new int[arr.length];
        int posIdx=0, negIdx=1;

        for(int num: arr)
        {
            if(num >= 0)
            {
                res[posIdx]=num;
                posIdx+=2;
            }
            else {
                res[negIdx] = num;
                negIdx+=2;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] a = {3,1,-2,-5,2,-4};
        System.out.println(Arrays.toString(rearrange(a)));
    }
}
