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
    public int[] smallestK(int[] arr, int k) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        int[] tmp = new int[k];
        for (int i = 0; i < arr.length; i++) {
            priorityQueue.offer(arr[i]);
        }
        for (int i = 0; i < k; i++) {
            tmp[i] = priorityQueue.poll();

        }
        return tmp;
    }
    /**
     * 方法二：
     * 求第k个就先创建一个大小为k的大堆，（找前k个小的就创建大堆，找前k给大的就创建小堆）
     * 然后剩下的元素和堆顶元素比较，比堆顶元素小就把堆顶元素抛出，（抛出后要调整），
     * 放入需要添加的元素。
     */
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,2,4,6,8};
        int[] x = smallestK1(arr, 4);
        System.out.println(Arrays.toString(x));
    }
    public static int[] smallestK1(int[] arr, int k) {
        Heap1 heap1 = new Heap1();
        int[] temp = new int[k];
        for (int i = 0; i < k; i++) {
            heap1.push(arr[i]);
        }

        for (int i = arr.length-k; i < arr.length; i++) {
            heap1.adjustDown(0,heap1.useSize);
            int x = heap1.peek1();
            if (x > arr[i]) {
                heap1.pop();
                heap1.push(arr[i]);
            }
        }

        return heap1.elem;
    }

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
