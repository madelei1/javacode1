package Review;
/*给定一个排列链表，删除所有重复元素，使得每个元素只出现一次
 * 示例:
 * 输入：1->1->2
 * 输出：1->2
 * 输入：1->1->2->3->3
 * 输出：1->2->3
 * */
public class Solution_83 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head ==null ||head.next == null) {
            return head;
        }
        ListNode node = head;
        while (node.next != null) {
            if (node.val == node.next.val) {
                node.next = node.next.next;
            } else {
                node = node.next;
            }
        }
        return head;
    }
}
