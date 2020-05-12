package Review_Sort1;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        //趟数--五个数只要比较四趟，类推
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]  = tmp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {12,4,6,9,2,1,10};
        bubbleSort(arr);
        System.out.print(Arrays.toString(arr));
    }
}
