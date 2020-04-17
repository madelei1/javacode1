package Review_Sort;

import java.util.Arrays;

public class BubbleSort {
    /**
     * 冒泡排序:在无序区间，通过相邻数的比较，将最大的数冒泡到无序区间的最后，
     * @param array
     */
    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-1-i; j++) {
                if (array[j] > array[j+1]) {
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
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
