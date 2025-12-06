package com.learning.recursion.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GetAllIndicesInArray {
    public static int[] getAllIndices(int[] arr, int idx, int ele, int fsf)
    {
        if(arr.length == idx)
            return new int[fsf];

        int[] iarr;
        if(arr[idx] == ele)
        {
            iarr = getAllIndices(arr, idx + 1, ele, fsf + 1);
            iarr[fsf] = idx;
        }
        else
        {
            iarr = getAllIndices(arr, idx + 1, ele, fsf);
        }
        return iarr;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter size of array: ");
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];

        System.out.println("Enter element of array: ");
        for(int i=0; i<a.length; i++)
        {
            System.out.println("At position: "+i);
            a[i] = Integer.parseInt(br.readLine());
        }

        System.out.println("Enter search element: ");
        int se = Integer.parseInt(br.readLine());

        int[] sarr = getAllIndices(a, 0, se, 0);

        if(sarr.length == 0) {
            System.out.println();
            return;
        }

        System.out.println("Found element at index: ");
        for(int j=0; j<sarr.length; j++)
        {
            System.out.print(sarr[j]+" ");
        }
    }
}
