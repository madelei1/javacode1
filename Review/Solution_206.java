package Review;
/*反转一个单链表。
示例:
输入: 1->2->3->4->5->NULL
输出: 5->4->3->2->1->NULL
进阶:
你可以迭代或递归地反转链表。你能否用两种方法解决这道题？

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/reverse-linked-list
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/
public class Solution_206 {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode prev = null;
        ListNode node = head;
        ListNode nodeNext = null;
        ListNode newHead = null;
        while (node != null) {
            nodeNext = node.next;
            if (node != null) {
                newHead = node;
            }
            node.next = prev;
            prev = node;
            node = nodeNext;
        }
        return newHead;

    }
}
