package Sort;

import java.util.Arrays;

public class BubbleSort_1 {
    /**
     * 冒泡排序：
     * 在无序区间，通过相邻数的比较，将最大的数冒泡到无序区间的最后，
     * 持续这个过程，直到数组整体有序
     * @param array
     */
    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-i-1; j++) {
                if (array[j] > array[j+1]) {
                    int s = array[j];
                    array[j] = array[j+1];
                    array[j+1] = s;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {12,4,6,9,2};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
}
