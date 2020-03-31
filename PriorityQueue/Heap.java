package PriorityQueue;

public class Heap {
    /**
     * 根据一个数组创建一个大根堆，
     */
    public int[] elem;
    public int useSize;

    public Heap() {
        this.elem = new int[10];
        this.useSize = 0;
    }

    /**
     * 调整这颗树，使之成为大根堆
     * @param root  每个根节点
     * @param len   每棵子树的结束位置
     */
    public void adjustDown(int root,int len) {
        int parent = root;
        int child = 2*parent+1;
        //有左子树
        while (child < len) {
            //1、(child+1 < len)  证明有右孩子的 --》 找到左右孩子的最大值
            if( (child+1 < len) && this.elem[child] < this.elem[child+1]) {
                child++;//child保存的是左右孩子最大值的下标
            }
            if(this.elem[child] > this.elem[parent]) {
                int tmp = this.elem[child];
                this.elem[child] = this.elem[parent];
                this.elem[parent] = tmp;
                parent = child;//为什么他还要指向孩子  因为 无法确定是否此树调整完毕
                child = 2*parent+1;
            }else {
                break; //不需要进行调整了
            }
        }
    }


    //创建一个堆,并且调整为大根堆
    public void createHeap(int[] array) {
        for (int i = 0; i <array.length ; i++) {
            elem[i] = array[i];
            useSize ++;
        }
        for (int i = (useSize-1-1)/2; i > 0; i--) {
            adjustDown(i,useSize);
        }
    }
    //打印整个堆
    public void show() {
        for (int i = 0; i < this.useSize; i++) {
            System.out.print(this.elem[i]+" ");
        }
        System.out.println();
    }


}
