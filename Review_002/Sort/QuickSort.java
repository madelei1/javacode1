package Review_002.Sort;

import java.util.Arrays;

public class QuickSort {

    /**
     * 快速排序：
     * 思路：从带排序数组中选取一个作为tmp，将其余的元素排列成tmp的左边都比tmp小，右边都比tmp大
     * 先从最后开始早比tmp小的元素，找到就放到前面，
     * 在从最前面开始找比tmp大的元素，放到tmp后面
     * @param args
     */
    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        int[] array = {12,4,6,9,2,7,8,10,1,15};
        int[] array1 = {2,4,6,8,10,9,7,5,3,1,4};
        quickSort.QuickSort(array);
        System.out.println(Arrays.toString(array));
        quickSort.QuickSort(array1);
        System.out.println(Arrays.toString(array1));

    }

    public void QuickSort(int[] arr) {

        quick(arr,0,arr.length-1);
    }
    public void quick(int[] arr, int left, int right) {

        if (left > right) {
            return;
        }
        int x = p(arr,left,right);
        quick(arr,left,x-1);
        quick(arr,x+1,right);
    }

    public int p(int[] arr,int left,int right) {
        int tmp = arr[left];

        while (left < right) {
            while (left < right && arr[right] >= tmp) {
                right --;
            }
            if (left >= right) {
                break;
            }
            if (arr[right] < tmp) {
                arr[left] = arr[right];
            }
            while (left < right && arr[left] <= tmp) {
                left++;
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
