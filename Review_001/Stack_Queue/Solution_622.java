
package Review_001.Stack_Queue;

public class Solution_622 {

/**
     * 设计你的循环队列实现。 循环队列是一种线性数据结构，其操作表现基于 FIFO（先进先出）原则并且队尾被连接在队首之后以形成一个循环。它也被称为“环形缓冲器”。
     *
     * 循环队列的一个好处是我们可以利用这个队列之前用过的空间。在一个普通队列里，一旦一个队列满了，我们就不能插入下一个元素，即使在队列前面仍有空间。但是使用循环队列，我们能使用这些空间去存储新的值。
     *
     * 你的实现应该支持如下操作：
     *
     * MyCircularQueue(k): 构造器，设置队列长度为 k 。
     * Front: 从队首获取元素。如果队列为空，返回 -1 。
     * Rear: 获取队尾元素。如果队列为空，返回 -1 。
     * enQueue(value): 向循环队列插入一个元素。如果成功插入则返回真。
     * deQueue(): 从循环队列中删除一个元素。如果成功删除则返回真。
     * isEmpty(): 检查循环队列是否为空。
     * isFull(): 检查循环队列是否已满。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/design-circular-queue
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param k
     */

    int front;
    int real;
    int useSize;
    int[] arr;
    public Solution_622(int k) {
        this.front = 0 ;
        this.real = 0;
        useSize = 0;
        arr = new int[k];
    }


/** Insert an element into the circular queue. Return true if the operation is successful. */

    public boolean enQueue(int value) {
        if (!isFull()) {
            arr[real] = value;
            real = (real+1)% arr.length;
            useSize ++;
        } else {
            return false;
        }
        return true;
    }


/** Delete an element from the circular queue. Return true if the operation is successful. */

    public boolean deQueue() {
        //这里跳过这个元素就是删除了
        if (!isEmpty()) {
            front = (front+1) % arr.length;
            useSize --;
        } else {
            return false;
        }
        return true;
    }


/** Get the front item from the queue. */

    public int Front() {
        if (isEmpty()) {
            return -1;
        }
        return arr[front];
    }


/** Get the last item from the queue. */

    public int Rear() {
        if (isEmpty()) {
            return -1;
        }
        int index = (this.real == 0) ? this.arr.length-1 : this.real-1 ;

        return arr[index];
    }


/** Checks whether the circular queue is empty or not. */

    public boolean isEmpty() {
        return useSize == 0;
    }


/** Checks whether the circular queue is full or not. */

    public boolean isFull() {
        return useSize == arr.length;
    }
}

