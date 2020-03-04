package Review;
//返回链表的倒数第k个节点(牛客上)
public class Solution_a {
    public ListNode findKthToTail(ListNode head, int k) {
        ListNode node = head;
        int count = 0;
        while (node != null) {
            count ++;
            node = node.next;
        }
        if (k > count || k < 0) {
            return null;
        }
        int z = count - k;
        for (int i = 0; i < z; i++) {
            head = head.next;
        }
        return head;
    }
}
