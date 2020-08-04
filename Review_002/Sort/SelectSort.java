package Review_002.Sort;

import java.util.Arrays;

public class SelectSort {
    /**
     * 选择排序：
     */
    public static void main(String[] args) {
        int[] arr = {2,1,3,8,7,6,5,9,10};
        SelectSort selectSort = new SelectSort();
        selectSort.selectSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    public void selectSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int tmp = arr[i];
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] > tmp) {
                    int x = arr[j];
                    arr[j] = tmp;
                    tmp = x;
                }
            }
            arr[i] = tmp;
        }
    }
}
