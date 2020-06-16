package Review_001.Sort_001;

import java.util.Arrays;

public class QuickSort {

    /**
     * 快速排序思路：
     * 将待排序的数组以标准值进行排序，让其左边的都比他小，右边的都比他大
     * 步骤：
     *一组快速排序：
     * 以第一个元素位tmp
     * 从最后面找比tmp小的元素，找到就把值传递给当前第一个元素，没有找到就继续进行查找，
     * 执行完找到就执行从前开始。
     * 执行前面开始找比tmp大的元素。没有找到就继续进行查找，找到过后就执行从后面开始。
     *
     *
     * @param args
     */
    public static void main(String[] args) {

        QuickSort quickSort = new QuickSort();
        int[] array = {12,4,6,9,2,7,8,10,1,15};
        quickSort.quickSort(array);
        System.out.println(Arrays.toString(array));
    }

    public void quick(int[]arr,int left,int right) {
        if (left >= right) {
            return;
        }
        int p = partition(arr,left,right);
        quick(arr,left,p-1);
        quick(arr,p+1,right);

    }

    public void quickSort(int[] arr) {

        quick(arr,0,arr.length-1);
    }
    public int partition(int[] arr,int left,int right) {

        int tmp = arr[left];
        while (right > left) {
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
}
