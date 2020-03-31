package PriorityQueue;

import java.util.PriorityQueue;

public class Solution_17_14 {

    /**
     * 优先级队列top-K问题，https://leetcode-cn.com/problems/smallest-k-lcci/submissions/
     * 设计一个算法，找出数组中最小的k个数。以任意顺序返回这k个数均可。
     * @param arr
     * @param k
     * @return
     * 思路：第一种创建优先级队列，将整个数组排序，然后返回前k个即可。这个解法比较繁琐，
     */
    public int[] smallestK(int[] arr, int k) {
        if(null == arr || k <= 0){
            return new int[0];
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>(arr.length);
        for (int i = 0; i <arr.length ; i++) {
            queue.offer(arr[i]);
        }
        int[] x = new int[k];
        for (int i = 0; i < k ; i++) {
            x[i] = queue.poll();
        }
        return x;
    }
}
