package Review_Stack_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Solution_225 {
    class MyStack {

        /**
         * 使用队列实现栈的下列操作：
         *
         * push(x) -- 元素 x 入栈
         * pop() -- 移除栈顶元素
         * top() -- 获取栈顶元素
         * empty() -- 返回栈是否为空
         *
         * 来源：力扣（LeetCode）
         * 链接：https://leetcode-cn.com/problems/implement-stack-using-queues
         * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
         */
        /** Initialize your data structure here. */
        int size = 0;
        Queue<Integer> queue1 ;
        Queue<Integer> queue2 ;
        public MyStack() {
            queue1 = new LinkedList<>();
            queue2 = new LinkedList<>();
        }

        /** Push element x onto stack. */
        public void push(int x) {
            if (!queue1.isEmpty()) {
                queue1.offer(x);
            } else if (!queue2.isEmpty()) {
                queue2.offer(x);
            } else {
                queue1.offer(x);
            }
            size++;
        }

        /** Removes the element on top of the stack and returns that element. */
        public int pop() {
            int x = 0;
            if (size == 0) {
                throw new RuntimeException("栈为空");
            }
            if (size == 1) {
                if (queue1.isEmpty()) {
                    x= queue2.poll();
                    size --;
                    return x;
                } else {
                    x=  queue1.poll();
                    size --;
                    return x;
                }

            }
            if (queue2.isEmpty()) {
                while (queue1.size() != 1) {
                        queue2.offer(queue1.poll());
                }
                x= queue1.poll();
                size --;
            } else {
                while (queue2.size() != 1) {
                    queue1.offer(queue2.poll());
                }
                x= queue2.poll();
                size --;
            }
            return x;
        }

        /** Get the top element. */
        public int top() {
            int x = 0;
            if (size == 0) {
                throw new RuntimeException("栈为空");
            }
            if (size == 1) {
                if (queue1.isEmpty()) {
                    x= queue2.peek();
                    return x;
                } else {
                    x= queue1.peek();
                    return x;
                }
            }
            if (queue2.isEmpty()) {
                while (queue1.size() != 1) {
                    queue2.offer(queue1.poll());
                }
                x= queue1.peek();
                queue2.offer(queue1.poll());
            } else {
                while (queue2.size() != 1) {
                    queue1.offer(queue2.poll());
                }
                x= queue2.peek();
                queue1.offer(queue2.poll());
            }
            return x;
        }

        /** Returns whether the stack is empty. */
        public boolean empty() {
            if (queue1.isEmpty() && queue2.isEmpty()) {
                return true;
            }
            return false;
        }
    }
}
