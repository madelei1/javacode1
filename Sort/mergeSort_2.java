package Sort;

import java.util.Arrays;

public class mergeSort_2 {
    public static void merge2(int[] array,int gap) {
        int[] tmp = new int[array.length];
        int k = 0;
        int s1 = 0;
        int e1 = s1+gap-1;
        int s2 = e1+1;
        int e2 = s2+gap-1 >= array.length ? array.length-1 : s2+gap-1;
        //判断是否有两个归并段  -->让s2合法
        while (s2 < array.length) {
            //开始比较
            while (s1 <= e1 && s2 <= e2) {
                if(array[s1] <= array[s2]) {
                    tmp[k++] = array[s1++];
                }else {
                    tmp[k++] = array[s2++];
                }
            }
            while (s1 <= e1) {
                tmp[k++] = array[s1++];
            }
            while (s2 <= e2) {
                tmp[k++] = array[s2++];
            }
            //代码走到这里：====》说明的是 归并了一部分了
            s1 = e2+1;
            e1 = s1+gap-1;
            s2 = e1+1;
            e2 = s2+gap-1 >= array.length ? array.length-1 : s2+gap-1;
        }
        //:--->根本没有第二个归并段了
        while (s1 <= array.length-1) {
            tmp[k++] = array[s1++];
        }
        //所有的数据 全部放到了tmp数组当中
        for (int i = 0; i < tmp.length ; i++) {
            array[i] = tmp[i];
        }
    }

    public static void mergeSort (int[] array){
        for (int gap = 1; gap < array.length; gap *= 2) {
            merge2(array,gap);
        }
    }
    public static void main(String[] args) {
        int[] array = {12,4,6,9,2};
        mergeSort(array);
        System.out.println(Arrays.toString(array));
    }

}
