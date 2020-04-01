package Sort;

import java.util.Arrays;

public class TestSort {
    /**
     * 直接插入排序
     * @param array
     */
    public static void insertSort(int[] array) {
        int j = 0;
        for (int i = 1; i <array.length ; i++) {
            int tmp = array[i];
            for (j = i-1; j >= 0; j--) {
                if (array[j] >= tmp) {
                    array[j+1] = array[j];
                } else {
                    break;
                }
            }
            array[j+1] = tmp;
        }
    }

    public static void main(String[] args) {
        int[] array = {12,4,6,9,2};
        insertSort(array);
        System.out.println(Arrays.toString(array));
    }

}
