package Review_002.Sort;

import java.util.Arrays;

public class InsertSort {
    /**
     * 直接插入排序
     * 思路：从无序区间向有序区间插入，
     *      假设第一个元素是有序的，他的第二个元素是无序的开始，把第二个元素放到tmp中插入到第一个元素上。
     */
    public static void main(String[] args) {
        int[] arr = {2,1,3,8,7,6,5,9,10};
        InsertSort insertSort = new InsertSort();
        insertSort.insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public void insertSort(int[] arr) {

        int j = 0;
        for (int i = 1; i < arr.length-1; i++) {
            int tmp = arr[i];
            for (j = i-1; j >= 0; j--) {
                if (arr[j] > tmp) {
                    arr[j+1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j+1] = tmp;
        }

    }

}
