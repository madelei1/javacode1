package Review_Stack_Queue;

import java.util.Stack;

public class Solution_155 {
    /** initialize your data structure here. */
    class MinStack {
        /**
         *
         * 最小栈
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
         *
         * 思路：使用二个栈一个是正常栈，一个是最小栈，放入元素到正常栈，第一次的时候都要放入，
         * 第二次放入元素到正常栈的时候就和最小站的元素比较，如果比最小栈的栈顶元素小就入栈，否则最小栈不变，
         * 只向正常栈中放入元素。
         */
        Stack<Integer> stack;
        Stack<Integer> minStack;
        public MinStack() {

            stack = new Stack<>();
            minStack = new Stack<>();
        }

        public void push(int x) {
            if (minStack.isEmpty() && stack.isEmpty()) {
                minStack.push(x);
            } else {
                if (minStack.peek() >= x) {
                    minStack.push(x);
                }
            }
            stack.push(x);
        }

        public void pop() {
            int x = 0;
            if (minStack.isEmpty() && stack.isEmpty()) {
                throw new RuntimeException("栈为空");
            }
            x = stack.peek();
            if (minStack.peek() == x) {
                minStack.pop();
            }
            stack.pop();
        }

        public int top() {
            if (minStack.isEmpty() && stack.isEmpty()) {
                throw new RuntimeException("栈为空");
            }
            return stack.peek();
        }

        public int getMin() {
            return minStack.peek();
        }
    }
}
