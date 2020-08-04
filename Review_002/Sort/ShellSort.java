package Review_002.Sort;

import java.util.Arrays;

public class ShellSort {

    /**
     * 希尔排序：直接插入排序的优化，将待排序序列分为几趟，每一趟都间隔gap个元素，最后一趟的gap一定为1.
     * @param args
     */
    public static void main(String[] args) {

        ShellSort shellSort = new ShellSort();
        int[] arr = {1,3,5};
        int[] a = {9,1,2,5,7,4,8,6,3,5};
        for (int i = 0; i < arr.length; i++) {
            shellSort.ShellSort(a,arr[i]);
        }
        System.out.println(Arrays.toString(a));

    }

    public void ShellSort(int[] arr,int gap) {
        int j = 0;
        for (int i = gap; i < arr.length; i++) {
            int tmp = arr[i];
            for (j = i-gap; j >= 0; j -= gap) {
                if (arr[j] > tmp) {
                    arr[j+gap] = arr[j];
                } else {
                    break;
                }
            }
            arr[j+gap] = tmp;
        }

    }
}
