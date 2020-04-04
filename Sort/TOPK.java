package Sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

class TopKComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o1-o2;
    }
}
public class TOPK {
    public static Integer[] findKNum(Integer[] array, int k) {
        TopKComparator topKComparator = new TopKComparator();

        PriorityQueue<Integer> minHeap = new PriorityQueue<>(k,topKComparator);

        for (int i = 0; i < array.length; i++) {
            if (minHeap.size() < k) {
                minHeap.offer(array[i]);
            } else {
                Integer val = minHeap.peek();
                if (val != null && val < array[i]) {
                    minHeap.poll();
                    minHeap.offer(array[i]);
                }
            }
        }
        Integer[] ret = new Integer[k];
        for (int i = 0; i < k; i++) {
             Integer num = minHeap.poll();
             ret[i] = num;
        }

        return ret;
    }

    public static void main(String[] args) {
        Integer[] array = {12,4,6,9,2};
        Integer[] array2 = findKNum(array,3);
        System.out.println(Arrays.toString(array2));
    }
}
