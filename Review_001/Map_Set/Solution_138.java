package Review_001.Map_Set;

public class Solution_138 {
    class Node {
        int val;
        Node next;
        Node random;
        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    /**
     * 给定一个链表，每个节点包含一个额外增加的随机指针，该指针可以指向链表中的任何节点或空节点。
     *
     * 要求返回这个链表的 深拷贝。
     * @param head
     * @return
     */

    public Node copyRandomList(Node head) {
        return head;
    }
}
