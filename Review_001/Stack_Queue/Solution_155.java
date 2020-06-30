package Review_001.Stack_Queue;

import java.util.Stack;

public class Solution_155 {

    /**
     * 设计一个支持 push ，pop ，top 操作，并能在常数时间内检索到最小元素的栈。
     *
     * push(x) —— 将元素 x 推入栈中。
     * pop() —— 删除栈顶的元素。
     * top() —— 获取栈顶元素。
     * getMin() —— 检索栈中的最小元素。
     *  
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/min-stack
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    Stack<Integer> stack;
    Stack<Integer> MinStack;
    public Solution_155() {
        stack = new Stack<>();
        MinStack = new Stack<>();
    }

    public void push(int x) {

        if (stack.isEmpty()) {
            MinStack.push(x);
        } else {
            if (MinStack.peek() >= x) {
                MinStack.push(x);
            }
        }
        stack.push(x);
    }

    public void pop() {
        int x = stack.peek();
        int y = MinStack.peek();
        if (x == y) {
            MinStack.pop();
        }
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return MinStack.peek();
    }
}
