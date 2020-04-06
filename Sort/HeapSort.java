package Sort;

import java.util.Arrays;

public class HeapSort {

    /**
     * 堆排序
     * @param array 传入数组，
     * @param root 每颗子树根节点
     * @param len 每颗子树的结束位置
     * 堆排序思路：
     *            创建一个大根堆，将最后一个元素的值与对顶交换，
     *            然后最后一个元素就是最大值，有序了，在将end向后--，
     * adjustDown(),这个的思路：
     *            通过调整左右孩子和root，让root是最大值，（需要判断根是否存在）
     *            并且让root到新的根节点
     *createHeap(), 的思路：
     *            通过左右孩子节点和根的关系，堆的底层是数组，
     *
     *
     *
     *
     */
    public static void adjustDown(int[] array,int root, int len) {
        int parent = root;
        int child = 2*parent+1;
        //至少有左孩子
        while (child < len) {
            if ((child + 1) < len && array[child] < array[child+1]) {
                child ++;//保存的是左右孩子的最大值
            }
            if (array[child] > array[parent]) {
                int tmp = array[parent];
                array[parent] = array[child];
                array[child] = tmp;
                parent = child;//为什么他还要指向孩子  因为 无法确定是否此树调整完毕
                child = 2*parent+1;
            } else  {
                //如果不满足，就是有序的，直接退出
                break;
            }
        }
    }

    /**
     * 创建堆
     * @param array
     */
    public static void createHeap(int[] array) {
        //i 代表每颗子树的根节点
        for (int i = (array.length-1-1)/2; i >= 0; i--) {
            adjustDown(array,i,array.length);
        }

    }

    /**
     * 堆排序 -- 堆排序的步骤，给面试官写这个过程
     * @param array
       */
    public static void heapSort(int[] array) {
        //1、创建大根堆
        createHeap(array);
        //2、堆顶元素和最后一个元素进行交换
        int end = array.length-1;
        while (end > 0) {
            int tmp = array[end];
            array[end] = array[0];
            array[0] = tmp;
            adjustDown(array,0,end);
            end --;
        }
    }

    public static void main(String[] args) {
        int[] array = {12,4,6,9,2,7,8,10,1,15};
        heapSort(array);
        System.out.println(Arrays.toString(array));
    }

}
