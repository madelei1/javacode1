package Review_002.Map_Set;

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
