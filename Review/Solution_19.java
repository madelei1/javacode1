package Review;

/*给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。

示例：

给定一个链表: 1->2->3->4->5, 和 n = 2.

当删除了倒数第二个节点后，链表变为 1->2->3->5.
说明：

给定的 n 保证是有效的。

进阶：

你能尝试使用一趟扫描实现吗？

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/

public class Solution_19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0,null);
        dummy.next = head;
        int length  = 0;
        ListNode first = head;
        while (first != null) {
            length++;
            first = first.next;
        }
        length -= n;
        first = dummy;
        while (length > 0) {
            length--;
            first = first.next;
        }
        first.next = first.next.next;
        return dummy.next;

    }

}
/*小结：
*   在制作删除的题目时候最好使用虚拟头节点的方式，因为可能要删除头节点，也可以解决数组越界问题。*/
//双指针
/*public class Solution19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode fast = head,sec = head;
        int count = 0;
        while (fast != null) {
            fast = fast.next;
            count ++;
            if (count >= n + 2) {
                sec = sec.next;
            }
        }
        // sec此时处在待删除位置的前一个节点
        if (count == n) {
            return head.next;
        }else {
            sec.next = sec.next.next;
            return head;
        }
    }
}
*/