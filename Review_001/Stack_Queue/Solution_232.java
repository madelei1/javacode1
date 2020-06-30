package Review_001.Stack_Queue;

import java.util.ArrayList;
import java.util.Stack;

public class Solution_232 {
    /**
     * 使用栈实现队列的下列操作：
     *
     * push(x) -- 将一个元素放入队列的尾部。
     * pop() -- 从队列首部移除元素。
     * peek() -- 返回队列首部的元素。
     * empty() -- 返回队列是否为空。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/implement-queue-using-stacks
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    /** Initialize your data structure here. */
    Stack<Integer> stack;
    Stack<Integer> stack1;
    public Solution_232() {
        stack = new Stack<>();
        stack1 = new Stack<>();

    }

    /** Push element x to the back of queue. */
    public void push(int x) {

        stack.push(x);

    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        int x = 0;
        if (empty()) {
            throw new RuntimeException("队列为空");
        }
        if (stack1.isEmpty()) {
            while (!stack.isEmpty()) {
                stack1.push(stack.pop());
            }
            x = stack1.pop();
        } else  {
            x= stack1.pop();
        }
        return x;

    }

    /** Get the front element. */
    public int peek() {
        int x = 0;
        if (empty()) {
            throw new RuntimeException("队列为空");
        }
        if (stack1.isEmpty()) {
            while (!stack.isEmpty()) {
                stack1.push(stack.pop());
            }
            x = stack1.peek();
        } else  {
            x= stack1.peek();
        }
        return x;
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack.isEmpty() && stack1.isEmpty();
    }
}
