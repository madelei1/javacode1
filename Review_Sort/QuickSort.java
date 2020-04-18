package Review_Sort;

import java.util.Arrays;

public class QuickSort {

    public static int partition(int[] arr,int left,int right) {
        int tmp = arr[left];
        while (left < right) {
            //从后面向前找，比tmp小的
            while (left < right && arr[right] >= tmp) {
                right --;
            }
            if (left == right) {
                break;
            } else {
                arr[left] = arr[right];
            }
            while (left < right && arr[left] <= tmp) {
                left ++;
            }
            if (left == right) {
                break;
            } else {
                arr[right] = arr[left];
            }
        }
        arr[left] = tmp;
        return left;
    }
    public static void quick(int[] arr, int left,int right) {
        if (left >= right) {
            return;
        }
        int p = partition(arr,left,right);
        quick(arr,left,p-1);
        quick(arr,p+1,right);
    }
    public static void quickSort(int[] arr) {
        quick(arr,0,arr.length-1);

    }

    public static void main(String[] args) {
        int[] array = {12,4,6,9,2};
        quickSort(array);
        System.out.println(Arrays.toString(array));

    }


}
