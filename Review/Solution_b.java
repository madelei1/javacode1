package Review;
//编写代码，以给定值x为基准将链表分割成两部分，所有小于x的结点排在大于或等于x的结点之前
//课件第六题--https://www.nowcoder.com/practice/0e27e0b064de4eacac178676ef9c9d70
public class Solution_b {
    public ListNode partition(ListNode pHead, int x) {
            if (pHead == null || pHead.next == null) {
                return pHead;
            }
            ListNode node = pHead;
            ListNode s = null;
            ListNode m = null;
            ListNode sPrev = null;
            ListNode prev = null;
            while (node != null) {
                ListNode nodeNext = node.next;
                node.next = null;//这二行极其关键，将node分割为一个单独的链表节点
                if (node.val < x) {
                    if (s == null) {
                        s = node;
                        sPrev = node;
                    } else {
                        s.next = node;
                        s = s.next;
                    }
                } else {
                    if (m == null) {
                        m = node;
                        if (prev == null) {
                            prev = m;
                        }
                    } else {
                        m.next = node;
                        m = m.next;
                    }
                }
                node = nodeNext;
            }
            if (s == null) {
                return prev;
            }
            if (m == null) {
                return sPrev;
            }
            s.next = prev;
            return sPrev;
    }
}
