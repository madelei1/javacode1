package Review_Sort;

import java.util.Arrays;

public class SelectSort {
    /**
     * 选择排序:每次从待排序数字的后面 选取一个比当前数字小的数据进行交换
     * @param array
     */
    public static void selectSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {12,4,6,9,2};
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
