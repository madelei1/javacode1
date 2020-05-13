package Review_Sort1;

import java.util.Arrays;

public class HeapSort {
    public static void adjustDown(int[] array,int root, int len) {
        int parent = root;
        int child = 2*parent+1;
        while (child <= len) {
            if (child+1 <= len && array[child+1] >array[child]) {
                child ++;
            }
            if (array[parent] < array[child]) {
                int tmp = array[parent];
                array[parent] = array[child];
                array[child] = tmp;
                parent = child;
                child = 2*parent+1;
            } else {
                break;
            }
        }
    }
    public static void createHeap(int[] array) {
        //i 代表每棵树的根节点
        for (int i = (array.length-1-1)/2; i >= 0; i--) {
            adjustDown(array,i,array.length-1);
        }

    }
    public static void heapSort(int[] array) {
        createHeap(array);
        int end = array.length-1;
        while (end > 0) {
            int tmp = array[end];
            array[end] = array[0];
            array[0] = tmp;
            end --;
            adjustDown(array,0,end);
        }

    }
    public static void main(String[] args) {
        int[] array = {12,4,6,9,2,7,8,10,1,15};
        heapSort(array);
        System.out.println(Arrays.toString(array));
    }
}
