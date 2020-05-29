package Review_001;



import java.util.LinkedList;
import java.util.Queue;

public class Solution_225 {
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

    Queue<Integer> queue;
    Queue<Integer> queue1;
    public Solution_225() {
        queue = new LinkedList<>();
        queue1 = new LinkedList<>();
    }


    /** Push element x onto stack. */
    public void push(int x) {
        if (queue.isEmpty() && !queue1.isEmpty()) {
            queue1.offer(x);
        }else {
            queue.offer(x);
        }


    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        int x = 0;
        if (empty()) {
            throw new RuntimeException("栈为空");
        }
        if (queue1.isEmpty()) {
            while (!queue.isEmpty()) {
                x = queue.poll();
                if (!queue.isEmpty()) {
                    queue1.offer(x);
                }
            }

        } else if (queue.isEmpty()){
            while (!queue1.isEmpty()) {
                x = queue1.poll();
                if (!queue1.isEmpty()) {
                    queue.offer(x);
                }
            }

        } else {
            while (!queue.isEmpty()) {
                queue1.offer(queue.poll());
            }
            while (!queue1.isEmpty()) {
                x = queue1.poll();
                if (!queue1.isEmpty()) {
                    queue.offer(x);
                }
            }
        }
        return x;
    }

    /** Get the top element. */
    public int top() {
        int x = 0;
        if (empty()) {
            throw new RuntimeException("栈为空");
        }
        if (queue1.isEmpty()) {
            while (!queue.isEmpty()) {
                x = queue.poll();
                queue1.offer(x);
            }

        } else if (queue.isEmpty()){
            while (!queue1.isEmpty()) {
                x = queue1.poll();
                queue.offer(x);
            }
        } else {
            while (!queue.isEmpty()) {
                queue1.offer(queue.poll());
            }
            while (!queue1.isEmpty()) {
                x = queue1.poll();
                queue.offer(x);
            }
        }
        return x;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue.isEmpty() && queue1.isEmpty();
    }
}
