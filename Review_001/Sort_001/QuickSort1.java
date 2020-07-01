package Review_001.Sort_001;

import java.util.Arrays;

public class QuickSort1 {

    public static void main(String[] args) {

        int[] array = {12,4,6,9,2,7,8,10,1,15};
        quickSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void quickSort(int[] arr) {
        quick(arr,0,arr.length -1);
    }

    public static void quick(int[] arr,int left,int right) {

        if (left > right) {
            return;
        }
        int p = partition(arr,left,right);
        quick(arr,left,p-1);
        quick(arr,p+1,right);

    }

    public static int partition(int[] arr, int left,int right) {

        int tmp = arr[left];

        while (left < right) {
            while (left < right && tmp < arr[right]) {
                right --;
            }
            if (left >= right) {
                break;
            }
            if (arr[right] < tmp) {
                arr[left] = arr[right];
            }
            while (left < right && tmp > arr[left]) {
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



}
