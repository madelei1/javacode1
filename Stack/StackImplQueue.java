package Stack;

import java.util.Stack;

/**
 * 使用栈实现队列的下列操作：
 *      232题
 * push(x) -- 将一个元素放入队列的尾部。
 * pop() -- 从队列首部移除元素。
 * peek() -- 返回队列首部的元素。
 * empty() -- 返回队列是否为空。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/implement-queue-using-stacks
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class StackImplQueue {
    /** Initialize your data structure here. */
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public StackImplQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();

    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        stack1.push(x);

    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        int top =0;
        if (!stack2.isEmpty()) {
            top = stack2.pop();
        } else {
            throw new RuntimeException("栈为空");
        }
        return top;
    }

    /** Get the front element. */
    public int peek(){
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        int top =0;
        if (!stack2.isEmpty()) {
            top = stack2.peek();
        } else {
            throw new RuntimeException("栈为空");
        }
        return top;
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        if (stack1.isEmpty() &&stack2.isEmpty()) {
            return true;
    }
    return false;
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */

}
/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
