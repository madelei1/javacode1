package Review_PriorityQueue;

import java.util.Arrays;

public class Heap1 {
    /**
     *
     * 创建应该大根堆：堆是由顺序遍历一个数组构建的，并且堆是一个完全二叉树，
     * 当构建一个大根堆的时候，我们从最后一个树向上调整，
     */

    public int[] elem;
    public int useSize;

    public Heap1() {
        this.elem = new int[10];
        this.useSize = 0;
    }

    /**
     *  调整树
     * @param root 每颗子树的根节点
     * @param len 每颗子树的结束位置
     */
    public void adjustDown(int root,int len) {
        int parent = root;
        int child = 2*parent +1;
        //child < len确保由左树
        while (child < len) {
           // 判断是否有右树
            if (child+1 < len && elem[child+1] > elem[child]) {
                child ++;
            }
            if (elem[child] > elem[parent]) {
                int x = elem[child];
                elem[child] = elem[parent];
                elem[parent] = x;
                parent = child;//不清楚当前这棵树是否调整完成
                child = 2*parent+1;
            } else {
                //不需要调整
                break;
            }
        }
    }
    public void createHeap(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            elem[i] = arr[i];
            useSize ++;
        }
        //i 代表的是需要调整的节点的父亲节点
        for (int i = (useSize-1-1)/2; i >= 0 ; i--) {
            adjustDown(i,useSize);
        }
    }
    public void show() {
        for (int i = 0; i < useSize; i++) {
            System.out.print(elem[i] + " ");
        }
    }
    public void adjustUp(int child) {
        int parent = (child-1)/2;
        while (child > 0) {
            if (elem[child] > elem[parent]) {
                int tmp = elem[child];
                elem[child] = elem[parent];
                elem[parent] = tmp;
                child = parent;
                parent = (child-1)/2;
            } else {
                break;
            }
        }

    }

    /**
     * 向堆中添加元素-- 先判断数组的空间大小，在进行添加，在堆的最后一个元素上添加，
     * 添加过后需要保持原来堆的性质，（大根堆还是大根堆，小根堆还是小根堆）
     * 通过从下面的最后一个元素和父亲节点比较，在通过父亲节点和父亲的父亲节点比较
     * @param val
     */
    public void push(int val) {
        if (isFull()) {
            elem = Arrays.copyOf(elem,elem.length << 1);
        }
        elem[useSize] = val;
        useSize ++;
        adjustUp(useSize-1);
    }
    public boolean isFull() {
        return useSize == elem.length;
    }

    /**
     *删除堆中的一个元素，先从堆的最后面把堆顶元素覆盖，
     * 长度减少
     * 然后通过堆顶的向下调整，就可以了。
     */
    public void pop() {
        if (isEmpty()) {
            throw new RuntimeException("堆为空");
        }
        elem[0] = elem[useSize-1];
        useSize --;
        adjustDown(0,useSize);
    }
    public boolean isEmpty() {
        return useSize == 0;
    }
    public void headSort() {
        int end = useSize-1;
        while (end > 0) {
            int tmp = elem[0];
            elem[0] = elem[end];
            elem[end] = tmp;
            adjustDown(0,end);
            end --;
        }
    }
    public int peek1() {
        return elem[0];
    }
}
