/**
 * @author: Manoj Kumar
 * @created date: 16-03-2026
 * @description: This class has been implemented to show array related operations like sum, max, min, avg
 */

package com.learning.top100.arrays.beginner;

public class ArraysOperations {
    //sum
    public static int sum(int[] arr)
    {
        int sum=0;
        for(int num: arr)
        {
            sum+=num;
        }
        return sum;
    }

    //avg
    public static float avg(int[] arr)
    {
        float avg=0.0f;
        int sum=0;
        for(int num: arr)
        {
            sum+=num;
        }
        avg=sum/arr.length;
        return avg;
    }

    //max
    public static void maxAndMin(int[] arr)
    {
        int max= Integer.MIN_VALUE, min=Integer.MAX_VALUE;
        for(int num: arr)
        {
            if (num > max)
            {
                max = num;
            }
            if(num < min)
            {
                min = num;
            }
        }
        System.out.println(max+"-"+min);
    }

    //Reverse
    public static void reverse(int[] arr)
    {
        for(int i=arr.length-1; i>=0; i--)
        {
            System.out.print(arr[i]+" ");
        }
    }

    //Count of even and odd
    public static void evenAndOddCount(int[] arr)
    {
        int countEven=0, countOdd=0;
        for(int num: arr)
        {
            if(num%2==0)
            {
                countEven++;
            }
            else
            {
                countOdd++;
            }
        }
        System.out.println("Even: "+countEven+" Odd: "+countOdd);
    }

    //second largest and smallest
    public static void secondMaxAndMin(int[] arr)
    {
        int fMax=Integer.MIN_VALUE, sMax=Integer.MIN_VALUE;
        int fMin=Integer.MAX_VALUE, sMin= Integer.MAX_VALUE;

        for(int num: arr)
        {
            //sMax
            if(num > fMax)
            {
                sMax = fMax;
                fMax = num;
            }
            if(num > sMax && num != fMax) {
                sMax = num;
            }
            //sMin
            if(num < fMin)
            {
                sMin = fMin;
                fMin = num;
            }
            if(num < sMin && num != fMin)
            {
                sMin = num;
            }
        }
        System.out.println("Max: "+fMax+"----"+sMax);
        System.out.println("Min: "+fMin+"----"+sMin);
    }
    public static void main(String[] args) {
        int[] a = {1,5,6,9,2,8,3,9,6};
        //sum
        //System.out.println(sum(a));
        //avg
        //System.out.println(avg(a));
        //max&min
        //maxAndMin(a);
        //Reverse
        //reverse(a);
        //Even&Odd element count
        //evenAndOddCount(a);
        //second max
        secondMaxAndMin(a);
    }
}
