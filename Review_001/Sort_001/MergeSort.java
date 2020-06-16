package Review_001.Sort_001;

import java.util.Arrays;

public class MergeSort {

    /**
     * 归并排序：
     * 1、先进行分解，把数组分解为一个一个的元素，在分解后进行归并，
     * @param args
     */
    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
        int[] array = {12,4,6,9,2};
        mergeSort.mergeSort(array);
        System.out.println(Arrays.toString(array));
    }

    public void merge(int[] arr,int left,int right,int mid) {
        //第一段开始的下标
        int s1 = left;
        //第二段开始的下标
        int s2 = mid+1;

        int len = right-left+1;
        int[] a = new int[len];
        //临时数组下标
        int i = 0;

        while (s1 <= mid && s2 <= right) {
            if (arr[s1] <= arr[s2]) {
                a[i] = arr[s1];
                i ++;
                s1 ++;
            } else {
                a[i] = arr[s2];
                i ++;
                s2 ++;
            }
        }
        //上述while退出由二个情况
        while (s1 <= mid) {
            a[i++] = arr[s1++];
        }
        //进入循环说明  第二个归并段有数据
        while (s2 <= right) {
            a[i++] = arr[s2++];
        }
        //把临时数组内的数据  拷贝到原有的数组当中
        for (int j = 0; j < len; j++) {
            arr[left+j] = a[j];
        }

    }
    public void mergeSort(int[] arr) {
        mergeSortInternal(arr,0,arr.length-1);
    }

    /**
     * 分解。
     * @param arr
     * @param left
     * @param right
     */
    public void mergeSortInternal(int[] arr,int left,int right) {

        if (right <= left) {
            return;
        }

        //取中间值
        int mid = (right+left)/2;
        mergeSortInternal(arr,left,mid);
        mergeSortInternal(arr,mid+1,right);
        merge(arr,left,right,mid);

    }
}
