package com.learning.top25adv;

import java.util.PriorityQueue;

public class KthLargestInAnArray {
    public static int findKthLargest(int[] arr, int k)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int num: arr) {
            pq.offer(num);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        return pq.peek();
    }

    public static void main(String[] args) {
        int[] a = {3,2,1,5,6,4,8,6,7,9,5,2};
        System.out.println(findKthLargest(a, 3));
    }
}
