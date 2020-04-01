package Sort;

import java.util.Arrays;

public class BubbleSort {
    /**
     * 冒泡排序--时间复杂度：O(n^2),空间复杂度:O(1),稳定性：稳定
     * 定义：在无序区间，通过相邻数的比较，
     *      将最大的数冒泡到无序区间的最后，
     *      持续这个过程，直到数组整体有序
     *
     * @param array
     */
    public static void bubbleSort(int[] array) {
        boolean flag = true;
        //趟数
        for (int i = 0; i < array.length-1 ; i++) {
            //与元素中的值比较大小，最大的向后移动，-i-1，
            // 是为了排序过后的数字不在比较
            for (int j = 0; j < array.length-i-1 ; j++) {
                //取不到=好，为了保证稳定性
                if (array[j] > array[j+1]) {
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    flag = false;
                }
                if (!flag) {
                    break;
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
