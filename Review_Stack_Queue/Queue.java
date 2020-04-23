package Review_Stack_Queue;

public class Queue {
    class Node {
        int val;
        Node next;

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }

        public Node(int val) {
            this(val,null);
        }
    }
    int size = 0;
    Node head = null;
    Node tail = null;
    public void offer(int val) {
        Node node = new Node(val);
        if (size == 0) {
            head.val = val;
            head.next = null;
            tail = head;
            size ++;
        } else {
            tail.next = node;
            tail = node;
            size ++;
        }

    }
    public int poll() {
        if (head != null) {
            Node x = head;
            head = head.next;
            size --;
            return head.val;
        } else {
            throw new RuntimeException("队列为空");
        }
    }
    public int peek() {
        if (size == 0) {
            throw new RuntimeException("队列为空");
        }
        return head.val;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public int size() {

        return size;


    }



}
