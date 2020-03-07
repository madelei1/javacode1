package Review;
//课件第7题
/*
 * 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。
 * 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
 * */
public class Solution_c {
    public ListNode deleteDuplication(ListNode pHead) {
        ListNode dummy = new ListNode(-1,null);
        ListNode tmp = dummy;
        ListNode cur = pHead;
        while (cur != null) {
            //相等
            if (cur.next != null && cur.val == cur.next.val) {
                while (cur.next != null && cur.val == cur.next.val) {
                    cur = cur.next;
                }
                cur = cur.next;
                tmp.next = cur;
            } else  {
                //没有找到相同节点
                tmp.next = cur;
                cur = cur.next;
                tmp = tmp.next;
            }
        }
        return dummy.next;
    }

}
