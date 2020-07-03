package Review_001.Map_Set;

import java.util.HashMap;
import java.util.Map;

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
        Map<Node,Node> map = new HashMap<>();
        Node cur = head;
        while (cur != null) {
            Node node = new Node(cur.val);
            map.put(cur,node);
            cur = cur.next;
        }
        cur = head;
        while (cur != null) {
            map.get(cur).next = map.get(cur.next);
            map.get(cur).random = map.get(cur.random);
            cur = cur.next;
        }
        return map.get(head);
    }
}
