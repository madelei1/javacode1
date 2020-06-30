package Review_001.Stack_Queue;

public class Queue_0 {
    class Node {
        Node next;
        int val;

        public Node( int val) {
            this.next = next;
            this.val = val;
        }
    }
    int useSize;
    Node node ;

    public Queue_0() {
        this.useSize = 0;
        this.node = null;
    }

    public void offer(int val) {
        Node cur = new Node(val);
        if (node == null) {
            node = cur;
        } else {
            cur.next = node;
            node = cur;
        }
        useSize ++;
    }

    public int pop() {
        if (node == null) {
            throw new RuntimeException("队列为空");
        }
        int x = node.val;
        node = node.next;
        useSize --;
        return x;
    }
    public boolean isEmpty() {
        return useSize == 0;
    }
    public int size() {
        return useSize;
    }
}
