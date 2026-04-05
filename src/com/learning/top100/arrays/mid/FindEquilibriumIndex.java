/**
 * @author: Manoj Kumar
 * @created date: 23-03-2026
 * @description: TODO
 */

package com.learning.top100.arrays.mid;

public class FindEquilibriumIndex {
    public static void findEquilibrium(int[] arr)
    {
        int rightSum=0, totalSum=0, leftSum=0;
        for(int num: arr)
        {
            totalSum+=num;;
        }

        for(int i=0; i<arr.length; i++)
        {
            totalSum -= arr[i]; //rightSum

            if(leftSum == totalSum) {
                //return i;

                System.out.println("Left range: (0, " + (i - 1) + ")");
                System.out.println("Right range: (" + (i + 1) + "," + (arr.length - 1) + ")");
            }

            leftSum += arr[i];
        }
        //return -1;
    }

    public static void main(String[] args) {
        int[] a = {1,7,3,6,5,6};
        //System.out.println(findEquilibrium(a));
        findEquilibrium(a);
    }
}
