package Stack;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 使用队列实现栈的下列操作：
 *---225题
 * push(x) -- 元素 x 入栈
 * pop() -- 移除栈顶元素
 * top() -- 获取栈顶元素
 * empty() -- 返回栈是否为空
 * 注意:
 *
 * 你只能使用队列的基本操作-- 也就是 push to back, peek/pop from front, size, 和 is empty 这些操作是合法的。
 * 你所使用的语言也许不支持队列。 你可以使用 list 或者 deque（双端队列）来模拟一个队列 , 只要是标准的队列操作即可。
 * 你可以假设所有操作都是有效的（例如, 对一个空的栈不会调用 pop 或者 top 操作）。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/implement-stack-using-queues
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class QueueImplStack {

    /*private Queue<Integer> qu1 = new LinkedList<>();
    private Queue<Integer> qu2 = new LinkedList<>();*/

    private Queue<Integer> qu1;
    private Queue<Integer> qu2;
    private int usedSize;

    /** Initialize your data structure here. */
    public QueueImplStack() {
        qu1 = new LinkedList<>();
        qu2 = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        if (!qu1.isEmpty()) {
            qu1.offer(x);
        } else if (!qu2.isEmpty()){
            qu2.offer(x);
        } else {
            qu1.offer(x);
        }
        usedSize ++;

    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        int e;
        if (!qu1.isEmpty()) {
            for (int i = 0; i < usedSize-1; i++) {
                qu2.offer(qu1.poll());
            }
            e =  qu1.poll();

        } else if (!qu2.isEmpty()) {
            for (int i = 0; i < usedSize-1; i++) {
                qu1.offer(qu2.poll());
            }
            e =  qu2.poll();
        } else {
            return -1;
        }
        usedSize --;
        return e;
    }

    /** Get the top element. */
    public int top() {
        int e = 0;
        if (!qu1.isEmpty()) {
            for (int i = 0; i < usedSize; i++) {
                e = qu1.poll();
                qu2.offer(e);
            }
        } else if (!qu2.isEmpty()) {
            for (int i = 0; i < usedSize; i++) {
                e = qu2.poll();
                qu1.offer(e);
            }
        } else {
            return -1;
        }
        return e;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return usedSize == 0;
    }
}
