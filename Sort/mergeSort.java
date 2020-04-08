package Sort;

import java.util.Arrays;

public class mergeSort {
    /**
     * 归并排序--又称二路归并
     * @param array
     */
    public static void mergeSort(int[] array) {
        mergeSortInternal(array,0,array.length-1);
    }

    /**
     * 合并，将元素由一个一个合并到二个二个合并--类推
     * @param array
     * @param low
     * @param mid
     * @param high
     */
    public static void merge(int[] array,int low,int mid,int high) {
        //表示第一段开始和的下标
        int s1 = low;
        //表示第二段开始的下标
        int s2 = mid +1;
        //定义合并后数组的长度
        int len = high-low+1;
        int[] tmp = new int[len];
        //临时的数组下标i
        int i = 0;
        //当二边都由数据
        while (s1 <= mid && s2 <= high) {
            if (array[s1] <= array[s2]) {
                tmp[i] = array[s1];//相当于tmp[i++] = array[s1++];
                i ++;
                s1 ++;
            } else {
                tmp[i++] = array[s2++];
            }
        }
        //上面循环退出
        //证明第一个归并段还有数据
        while (s1 <= mid) {
            tmp[i++] = array[s1++];
        }
        //进入循环说明  第二个归并段有数据
        while (s2 <= high) {
            tmp[i++] = array[s2++];
        }
        //把临时数组内的数据  拷贝到原有的数组当中
        for (int j = 0; j < len; j++) {
            array[low+j] = tmp[j];
        }

    }


    /**
     *  分解，将数组分解为一个一个元素，当元素是一个一个的时候就是有序的。
     * @param array 传入的数组
     * @param low 最左边元素
     * @param high 最右边元素
     */
    public static void mergeSortInternal(int[] array,int low,int high) {
        //分解完毕
        if (low >= high) {
            return;
        }
        //取到中间值，将数组分为二份，
        int mid = (low + high) >>> 1;
        mergeSortInternal(array,low,mid);
        mergeSortInternal(array,mid +1, high);
        //合并--这里的合并必须写在这里，当分解为一个一个元素的时候，递归返回，
        // 开始合并，合并也是由一个一个元素向之前数组返回
        merge(array,low,mid,high);
    }

    public static void main(String[] args) {
        int[] array = {12,4,6,9,2};
        mergeSort(array);
        System.out.println(Arrays.toString(array));
    }

}
