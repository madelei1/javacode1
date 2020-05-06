package Review_Sort;

import java.util.Arrays;

public class Sort_insertSort {
    /**
     * 直接插入排序：无序的第一个数向有序的插入
     */
    public static void main(String[] args) {
        int j = 0;
        int[] arr = {1,3,5,7,2,4,6,8};
        for (int i = 1; i < arr.length; i++) {
            int tmp = arr[i];
            for (j = i-1; j >= 0; j--) {
                if (arr[j] >= tmp) {
                    arr[j+1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j+1] =tmp;
        }
        System.out.println(Arrays.toString(arr));
    }

}
