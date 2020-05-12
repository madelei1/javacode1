package Review_Sort1;

import java.util.Arrays;

public class QuickSort {
    public static void quickSort(int[] arr) {
        quick(arr,0,arr.length-1);

    }

    public static void quick(int[] arr,int left,int right) {
        if (left >= right) {
            return;
        }
        int x = partition(arr,left,right);
        quick(arr,left,x-1);
        quick(arr,x+1,right);


    }
    public static int partition(int[] arr,int left,int right) {
        int tmp = arr[left];
        while (left < right) {
            while (left < right && arr[right] > tmp) {
                right --;
            }
            if (left >= right) {
                break;
            }
            if (arr[right] < tmp) {
                arr[left] = arr[right];
            }
            while (left < right && arr[left] < tmp) {
                left ++;
            }
            if (left >= right) {
                break;
            }
            if (arr[left] > tmp) {
                arr[right] = arr[left];
            }
        }
        arr[left] = tmp;
        return left;
    }
    public static void main(String[] args) {
        int[] arr = {12,4,6,9,2};
        quickSort(arr);
        System.out.print(Arrays.toString(arr));
    }
}
