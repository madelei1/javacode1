package Sort;

import java.util.Arrays;

public class QuickSort_1 {
    /**
     * 快速排序
     * @param array
     * @param left
     * @param right
     * 原理：
     * 一组数据快排，我们选择数组中的一个元素作为参考值（tmp）
     * （下面代码是以left为参考值），
     * 先从数组最后面开始（array[right]），与参考值tmp比较，找比参考值小的元素，
     * 如果比参考值小就将这个值移动给array[left]，（移动过后 array[right]就相当于没有元素，）,如果比参考值大，就向后移动，
     * 当执行完，移动（这里的移动是使用赋值完成的，）
     * 这个时候就不在执行向后比较了，开始执行从left开始的从前面找比tmp大的元素，
     * 如果比参考值大就将这个值移动给array[right]（移动过后 array[left]就相当于没有元素，）,如果比参考值小，就向后移动，
     *
     */
    public static int partition(int[] array,int left,int right) {
        int tmp = array[left];
        //在后面找比tmp小的数据
        while (left < right) {
            while (left < right && array[right] >= tmp) {
                right--;
            }
            if (left == right) {
                break;
            } else {
                array[left] = array[right];
            }

            //在前面找比tmp大的数据，这里为什么需要二个判断条件
            while (left < right && array[left] <= tmp) {
                left ++;
            }
            if (left == right) {
                break;
            } else {
                array[right] = array[left];
            }
        }
        array[left] = tmp;
        return left;
    }
    public static void quick(int[] array,int left,int right) {
        if (left >= right) {
            return;
        }
        int pivot = partition(array,left,right);
        quick(array,left,pivot-1);
        quick(array,pivot+1,right);
    }
    public static void quickSort(int[] array){
        quick(array,0,array.length-1);
    }

    public static void main(String[] args) {
        int[] array = {12,4,6,9,2};
        quickSort(array);
        System.out.println(Arrays.toString(array));
    }

}
