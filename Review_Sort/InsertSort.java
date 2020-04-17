package Review_Sort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class InsertSort {
    /**
     * 直接插入排序：每次选择无序区间的第一个元素，在有序区间内选择合适的位置插入
     *
     *原理：第一个数据是有序的，从第二个数据开始，第二个数据放入tmp中，
     * tmp与前面的元素比较，发现第一个比其小的元素直接插入
     * @param arr
     */
    public static void insertSort(int[] arr) {
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            int tmp = arr[i];
            for (j = i-1; j >= 0; j--) {
                if (arr[j] >= tmp) {
                    arr[j+1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j+1] = tmp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {12,4,6,9,2};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
