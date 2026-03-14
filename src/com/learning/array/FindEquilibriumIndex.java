package com.learning.array;

public class FindEquilibriumIndex {
    public static void equiIndex(int[] arr)
    {
        int totalSum = 0, leftSum=0;
        for(int x: arr)
        {
            totalSum+=x;
        }

        for(int i=0; i<arr.length; i++)
        {
            totalSum-=arr[i];

            if(totalSum == leftSum)
            {
                System.out.println("Equi index found at: "+i);
            }
             leftSum+=arr[i];
        }
    }

    public static void main(String[] args) {
        int[] a={1,7,3,6,5,6};
        equiIndex(a);
    }
}
