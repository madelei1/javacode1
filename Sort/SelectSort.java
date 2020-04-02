package Sort;

import java.util.Arrays;

public class SelectSort {
    /**
     * 选择排序
     * 思想：每次从待排序数字的后面 选取一个比当前数字小的数据进行交换
     * 直到把当前的序列遍历完成
     * 时间复杂度：O(n^2)   不分好坏
     * 空间复杂度：O(1)
     * 稳定性：不稳定的排序
     *
     * @param array
     */
    public static void selectSort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int x = array[i];
                    array[i] = array[j];
                    array[j] = x;
                }
             }
        }
    }
    public static void main(String[] args) {
        int[] array = {12,4,6,9,2};
        selectSort(array);
        System.out.println(Arrays.toString(array));
    }

}
