package Review_Sort;

import java.util.Arrays;

public class MergeSort {
    /**将数组分为一个一个的单个
     *
     * @param array
     * @param low
     * @param high
     */
    public static void mergeSortInternal(int[] array,int low,int high) {
        if (low >= high) {
            return;
        }
        int mid = (low+high) >>> 1;
        mergeSortInternal(array,low,mid);
        mergeSortInternal(array,mid+1,high);
        merge(array,low,mid,high);
    }

    /**将数组由二个二个的合并到一起
     *
     * @param array
     * @param low
     * @param mid
     * @param high
     */
    public static void merge(int[] array,int low,int mid,int high) {
        int s1 = low;
        int s2 = mid+1;
        int len = high-low+1;
        int[] arr = new int[len];
        int i = 0;
        while (s1 <= mid && s2 <= high) {
            if (array[s1] <= array[s2]) {
                arr[i] = array[s1];
                i++;
                s1++;
            } else {
                arr[i++] = array[s2++];
            }
        }
        while (s1 <= mid) {
            arr[i++] = array[s1++];
        }
        while (s2 <= high) {
            arr[i++] = array[s2++];
        }
        for (int j = 0; j < arr.length; j++) {
            array[low+j] = arr[j];
        }
    }

    /**
     * 归并排序
     * @param array
     */
    public static void mergeSort(int[] array) {
        mergeSortInternal(array,0,array.length-1);
    }

    public static void main(String[] args) {
        int[] array = {12,4,6,9,2};
        mergeSort(array);
        System.out.println(Arrays.toString(array));
    }
}
