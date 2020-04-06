package Sort;

import java.util.Arrays;

public class ShellSort {
    //希尔排序排序
    public static void shell(int[] array,int gap) {

        for (int i = 1; i <array.length ; i++) {
            int j = 0;
            int tmp = array[i];
            for (j = i-gap; j >= 0; j-= gap) {
                if (array[j] >= tmp) {
                    array[j+gap] = array[j];
                } else {
                    break;
                }
            }
            array[j+gap] = tmp;
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
