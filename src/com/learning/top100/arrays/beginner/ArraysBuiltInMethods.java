/**
 * @author: Manoj Kumar
 * @created date: 17-03-2026
 * @description: TODO
 */

package com.learning.top100.arrays.beginner;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysBuiltInMethods {
    public static void main(String[] args) {
        int[] arr = {1,6,5,2,9,8,4,3,7,6,9};

        //sorting in ascending order
        Arrays.sort(arr);
        //print
        System.out.println(Arrays.toString(arr));

        int[] a = {1,2,3};
        int[] b = {1,2,3};
        System.out.println(Arrays.equals(a, b)); //checks order of element

        //Fill array with same default value by setting
        int[] arr1 = new int[5];
        Arrays.fill(arr1, 10);
        System.out.println(Arrays.toString(arr1));

        //copy the same array to create new array
        int[] arr2 = {1,2,3,4,5,6,9};
        int[] newArr = Arrays.copyOf(arr2, arr2.length);
        System.out.println(Arrays.toString(arr2));

        int index = Arrays.binarySearch(arr2, 5);
        System.out.println(index);

        //Reverse-using collections
        Integer[] arr3 = {1,6,8,9,5,3,4,8,6};
        List<Integer> list = Arrays.asList(arr3);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
    }
}
