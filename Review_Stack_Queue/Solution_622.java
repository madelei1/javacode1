package Review_Stack_Queue;

public class Solution_622 {
    class MyCircularQueue {
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
         *
         * 来源：力扣（LeetCode）
         * 链接：https://leetcode-cn.com/problems/design-circular-queue
         * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
         */

        /** Initialize your data structure here. Set the size of the queue to be k. */
        int rear;
        int front;
        int[] elem;
        public MyCircularQueue(int k) {
            rear = 0;
            front = 0;
            elem = new int[k+1];

        }

        /** Insert an element into the circular queue. Return true if the operation is successful. */
        public boolean enQueue(int value) {
            if (isFull()) {
                return false;
            }
            elem[rear] = value;
            rear = (rear+1)% elem.length;
            return true;
        }

        /** Delete an element from the circular queue. Return true if the operation is successful. */
        public boolean deQueue() {
            if (isEmpty()) {
                return false;
            }
            //这里直接跳过整个元素，就相当于删除了，后面rear过来重新赋值，会覆盖了整个值。
            front = (front+1)% elem.length;
            return true;
        }

        /** Get the front item from the queue. */
        public int Front() {
            if (isEmpty()) {
                return -1;
            }
            return elem[front];

        }

        /** Get the last item from the queue. */
        public int Rear() {
            if (isEmpty()) {
                return -1;
            }
            //这里要判断rear是不是==0，如果rear是0则返不能rear-1
            int index = (this.rear == 0) ? this.elem.length-1 : this.rear-1 ;
            return this.elem[index];
        }

        /** Checks whether the circular queue is empty or not. */
        public boolean isEmpty() {
            if (rear == front) {
                return true;
            } else {
                return false;
            }
        }

        /** Checks whether the circular queue is full or not. */
        public boolean isFull() {
            if ((rear+1)%elem.length == front) {
                return true;
            }
            return false;
        }
    }

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
}
