package Sort;

import java.util.Arrays;

public class ShellSort_1 {
    /**
     * 思想：分组的思想。将数组按照间隔划分然后进行直接插入排序
     * 时间复杂度：
     * 最好：有序 O(n)    最坏 O(n^2)
     * 空间复杂度：O(1)
     * 稳定性：不稳定的排序
     * 将数组分为几趟排序，例如第一趟每个数字间隔五个，第二趟每个数字间隔3个
     *
     * @param array
     */
    public static void shell(int[] array,int gap) {
        int j = 0;
        for (int i = gap; i < array.length; i++) {
            int tmp = array[i];
            for (j = i-gap; j >=0; j -= gap) {
                if (array[j] >= tmp) {
                    array[j+gap] = array[j];
                } else {
                    break;
                }
            }
            array[j + gap] = tmp;
        }
    }
    public static void shellSort(int[] array) {
        int[] drr = {5,3,1};
        for (int i = 0; i < drr.length; i++) {
            shell(array,drr[i]);
        }
    }

    public static void main(String[] args) {
        int[] array = {12,4,6,9,2};
        shellSort(array);
        System.out.println(Arrays.toString(array));
    }

}
