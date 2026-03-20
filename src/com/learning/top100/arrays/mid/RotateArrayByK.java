/**
 * @author: Manoj Kumar
 * @created date: 19-03-2026
 * @description: TODO
 */

package com.learning.top100.arrays.mid;

import java.util.Arrays;

public class RotateArrayByK {
    public static boolean isRotate(String s1, String s2)
    {
        if(s1.length() != s2.length())
        {
            return false;
        }
        char[] ch = s1.toCharArray();
        //abc bca
        char ele = ch[0];
        for(int i=1; i<ch.length; i++)
        {
            ch[i-1]=ch[i];
        }
        ch[ch.length-1] = ele;

        String rotated = new String(ch);
        System.out.println(rotated);

        if(!(s2.equals(rotated)))
            return false;

        return true;
    }

    public static void rotateArrayRight(int[] arr)
    {
        //4,1,2,3
        int ele = arr[arr.length-1];
        for(int i=arr.length-2; i>=0; i--)
        {
            arr[i+1]=arr[i];
        }
        arr[0] = ele;

        System.out.println(Arrays.toString(arr));
    }

    public static void rotateArrayLeft(int[] arr)
    {
        //2,3,4,1
        int ele = arr[0];
        for(int i=1; i< arr.length; i++)
        {
            arr[i-1]=arr[i];
        }
        arr[arr.length-1] = ele;

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        //rotateArrayRight(a);
        //rotateArrayLeft(a);
        System.out.println(isRotate("abc","bca"));
    }
}
