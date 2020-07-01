package Review_001.Sort_001;

import java.util.Arrays;

public class MergeSort1 {

    public static void main(String[] args) {

        int[] array = {12,4,6,9,2,7,8,10,1,15};
        mergeSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void mergeSort(int[] arr) {

        mergeSortInternal(arr,0,arr.length-1);
    }

    public static void mergeSortInternal(int[] arr,int left, int right) {

        if (right <= left) {
            return;
        }
        int mid = (left+right)/2;
        mergeSortInternal(arr,left,mid);
        mergeSortInternal(arr,mid+1,right);
        merge(arr,left,right,mid);

    }

    public static void merge(int[] arr, int left, int right,int mid) {

       int s1 = left;
       int s2 = mid+1;
       int len = right -left +1;
       int[] a = new int[len];
       int i = 0;

        while (s1 <= mid && s2 <= right) {
            if (arr[s1] <= arr[s2]) {
                a[i] = arr[s2];
                i ++;
                s2 ++;
            } else {
                a[i] = arr[s1];
                i ++;
                s1 ++;
            }
        }
        while (s1 <= mid) {
            a[i++] = arr[s1++];
        }
        while (s2 <= right) {
            a[i++] = arr[s2++];
        }
        for (int j = 0; j < len; j++) {
            arr[left+j] = a[j];
        }
    }

}
