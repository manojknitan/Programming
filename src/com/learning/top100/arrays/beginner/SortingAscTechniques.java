/**
 * @author: Manoj Kumar
 * @created date: 15-03-2026
 * @description: TODO
 */

package com.learning.top100.arrays.beginner;

public class SortingAscTechniques {

    //Bubble Sort /*
    // Steps: 1- execute loop (n-1) iterations
    // 2- compare adjacent elements (a[j]>a[j+1])
    // 3- swap it with larger element in the last..*/
    public static void bubbleSort(int[] arr)
    {
        for(int i=0; i<arr.length-1; i++)
        {
            for (int j = 0; j < arr.length - 1 - i; j++)
            {
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        printElement(arr);
    }

    //Selection Sort
    /*
    * Steps: 1- Assume array splitted in two parts, sorted and unsorted
    * 2- run loop n-1 times.
    * 3- compare if any value is less than minIdx, update minIdx
    * 4- swap (minIdx, j)*/
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            //swap (arr[minIdx], arr[j])
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
        printElement(arr);
    }
        /*
        * Insertion Sort
        * Steps - Assume like sort cards we have and one card we have to put it in right place.
        * 1 - run loop n-1 times
        * 2.- make space for curr element by comparing with previous
        * 3. Decrease index till >=0
        * 4- Assign value of curr to arr[prev+1]
        * */
        public static void insertionSort(int[] arr)
        {
            for(int i=1; i<arr.length; i++)
            {
                int curr = arr[i];
                int prev=i-1;

                while(prev >= 0 && arr[prev] > curr)
                {
                    arr[prev+1] = arr[prev];
                    prev--;
                }
                arr[prev+1] = curr;
            }

            printElement(arr);
        }
    /*
    * Common Logic to print array on console */
    public static void printElement(int[] arr)
    {
        System.out.println("Final array element is: ");
        for(int ele: arr)
        {
            System.out.print(ele+" ");
        }
    }

    public static void main(String[] args) {
        int[] a = {1,3,9,5,6,7,4};
        //ascending(a);
        //selectionSort(a);
        insertionSort(a);
    }
}
