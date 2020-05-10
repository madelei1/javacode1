package Review_PriorityQueue;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution_17_14 {
    /**
     * 设计一个算法，找出数组中最小的k个数。以任意顺序返回这k个数均可。
     * @param arr
     * @param k
     * @return
     */
   /** 
     * 大堆。。
     */
    class Solution {
        public int[] smallestK(int[] arr, int k) {
            if (k == 0) return new int[0];
            PriorityQueue<Integer> heap = new PriorityQueue<>(k, Comparator.comparingInt(item -> -item));
            int idx = 0, len = arr.length;
            for (; idx < k; ++idx)
                heap.offer(arr[idx]);
            for (; idx < len; ++idx) {
                heap.offer(arr[idx]);
                heap.poll();
            }
            int[] res = new int[k];
            idx = k - 1;
            while (idx > -1)
                res[idx--] = heap.poll();
            return res;
        }
    }

}
    
