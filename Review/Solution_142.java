package Review;
/*
* 给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null。

为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。

说明：不允许修改给定的链表。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/linked-list-cycle-ii
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/
//思路：先找到相遇点，在相遇点后，将一个从头节点开始重新开始跑，且每个都走一步，当二个再次相遇，该点为入口点
//找环的长度--在二个相遇的时候，一个不动，另一个一次一步，用一个计数器++，在次相遇就是长度
public class Solution_142 {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode node = head;
        ListNode x = head;
        int count = 0;
        while (node.next != null && node !=null) {
            node = node.next.next;
            x = x.next;
            if (node == x) {
                node = head;
                while (node != x) {
                    node = node.next;
                    x = x.next;
                }
                return x;
            }
        }
        return null;
    }

}
