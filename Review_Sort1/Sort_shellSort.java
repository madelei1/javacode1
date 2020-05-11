package Review_Sort1;

import java.util.Arrays;

public class Sort_shellSort {
    //分组为gap组，每组数据中间隔gap个
    public static void shell(int[] arr, int gap) {
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
        int[] arr1 = {5,3,1};
        //运行三趟
        for (int i = 0; i < arr1.length; i++) {
            shell(arr,arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {12,4,6,9,2};
        shellSort(arr);
        System.out.print(Arrays.toString(arr));
    }
}
