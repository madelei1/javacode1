package Review_001.Sort_001;

import java.util.Arrays;

public class HeapSort {

    /**
     * 堆排序思路：
     * 1、创建一个大根堆
     * 2、将大根堆的堆顶元素与堆尾元素进行交换
     * @param args
     */
    public static void main(String[] args) {
        int[] array = {12,4,6,9,2,7,8,10,1,15};
        heapsort(array);
        System.out.println(Arrays.toString(array));
    }
    /**
     *
     * @param arr
     * @param root  根节点
     * @param len 每颗子树的结束位置
     */
    public static void adjustDown(int[] arr,int root,int len) {
        int parent = root;
        int child = 2*parent+1;

        while (child < len) {
            //判断是否存在右孩子，并且保证child是最大值。
            if (child +1 < len && arr[child+1] > arr[child]) {
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
    public static void heapsort(int[] arr) {
        //1、创建大根堆。
        create(arr);
        //2、堆顶元素与最后一个元素交换
        int end = arr.length-1;
        while (end > 0) {
            int tmp = arr[end];
            arr[end] = arr[0];
            arr[0] = tmp;
            end --;
            adjustDown(arr,0,end);
        }


    }
    public static void create(int[] arr) {
        // i 代表每颗子树的根节点
        //arr.length-1-1===已经知道孩子节点求父亲节点
        for (int i = (arr.length-1-1)/2; i >= 0; i--) {
            //这里的adjustDown()中的arr.length,因为每颗子树结束的位置不可能大于arr.length,
            // 如果大于了就直接报错了，通过n是根节点，2n+1，2n+2
            adjustDown(arr,i,arr.length);
        }
    }



}
