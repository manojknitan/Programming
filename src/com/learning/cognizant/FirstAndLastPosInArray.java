package com.learning.cognizant;

import java.util.Scanner;

public class FirstAndLastPosInArray {

    int start, end;
    public void countPos(int[] a, int n)
    {
        for(int i=0; i<a.length-1; i++)
        {
            if(n == a[i])
            {
                start = i;
                break;
            }
        }

        for(int j = a.length-1; j>=0; j-- )
        {
            if(n == a[j])
            {
                end = j;
                break;
            }
        }

        System.out.println("Output: "+start+","+end);

    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,2,2,5,6,7,8,8};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n");
        int n = sc.nextInt();

        FirstAndLastPosInArray pos = new FirstAndLastPosInArray();
        pos.countPos(arr,n);

    }
}
