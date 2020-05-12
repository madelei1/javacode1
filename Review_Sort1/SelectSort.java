package Review_Sort1;

import java.util.Arrays;

public class SelectSort {
    public static void selectSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int max = 0;
            for (int j = 0; j < arr.length-i; j++) {
                if (arr[j] > arr[max]) {
                    max = j;
                }
            }
            int x = arr[arr.length-i-1];
            arr[arr.length-i-1] = arr[max];
            arr[max] = x;
        }
    }

    public static void main(String[] args) {
        int[] arr = {12,4,6,9,2};
        selectSort(arr);
        System.out.print(Arrays.toString(arr));
    }
}
