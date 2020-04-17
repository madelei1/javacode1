package Review_Sort;

import java.util.Arrays;

public class ShellSort {
    /**
     * 希尔排序
     * @param arr
     */
    public static void shell(int[] arr,int gap) {
        int j = 0;
        for (int i = gap; i < arr.length; i++) {
            int tmp = arr[i];
            for (j = i-gap; j >= 0; j -= gap) {
                if (arr[j] >= tmp) {
                    arr[j+gap] = arr[j];
                } else {
                    break;
                }
            }
            arr[j+gap] = tmp;
        }
    }
    public static void shellSort(int[] arr) {
        int[] a = {5,3,1};
        for (int i = 0; i < a.length; i++) {
            shell(arr,a[i]);
        }
    }

    public static void main(String[] args) {
        int[] array = {12,4,6,9,2};
        shellSort(array);
        System.out.println(Arrays.toString(array));
    }
}
