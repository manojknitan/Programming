/**
 * @author: Manoj Kumar
 * @created date: 20-03-2026
 * @description: TODO
 */

package com.learning.top100.arrays.mid;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstRepeatingElement {
    public static void firstRepeatingElement(int[] arr)
    {
        Map<Integer, Integer> map = new LinkedHashMap<>();

        for(int num: arr)
        {
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        for(int num: arr)
        {
            if(map.get(num) > 1)
            {
                System.out.println(num);
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[] a = {1,5,3,2,4,5,2,6,2};
        firstRepeatingElement(a);
    }
}
