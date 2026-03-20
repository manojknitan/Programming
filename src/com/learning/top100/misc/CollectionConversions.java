/**
 * @author: Manoj Kumar
 * @created date: 18-03-2026
 * @description: TODO
 */

package com.learning.top100.misc;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class CollectionConversions {
    public static void main(String[] args) {
        /*
         * Arrays
         * */
        Integer[] arr = {1,3,5,7,3,8,9,0};

        //Arrays to list
        List<Integer> list = Arrays.asList(arr);
        System.out.println(list);

        //List to array
        Integer[] arr2 = list.toArray(new Integer[0]);
        System.out.println(Arrays.toString(arr2));

        //to set

    }


}
