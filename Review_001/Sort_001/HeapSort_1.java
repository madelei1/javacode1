package Review_001.Sort_001;

import java.util.Arrays;

public class HeapSort_1 {
    //堆排序

    public static void heapSort(int[] arr){
        create(arr);
        int end = arr.length-1;
        while (end > 0) {
            int tmp = arr[end];
            arr[end] = arr[0];
            arr[0] = tmp;
            end --;
            adjustDown(arr,0,end);
        }
    }

    public static void main(String[] args) {

        int[] array = {12,4,6,9,2,7,8,10,1,15};
        heapSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void adjustDown(int[] arr,int root,int len) {

        int parent = root;
        int child = 2*parent + 1;
        while (child < len) {
            if (child+1 < len && arr[child+1] > arr[child]) {
                child ++;
            }
            if (arr[child] > arr[parent]) {
                int tmp = arr[child];
                arr[child] = arr[parent];
                arr[parent] = tmp;
                parent = child;
                child = 2*parent +1;
            } else {
                break;
            }
        }

    }
    public static void create(int[] arr) {
        //i是每颗子树的根节点
        for (int i = (arr.length-1-1)/2; i >= 0; i--) {
            adjustDown(arr,i,arr.length);
        }
    }

}
