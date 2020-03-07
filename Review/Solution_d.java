package Review;
//课件第8题
/*
*对于一个链表，请设计一个时间复杂度为O(n),额外空间复杂度为O(1)的算法，判断其是否为回文结构。
给定一个链表的头指针A，请返回一个bool值，代表其是否为回文结构。保证链表长度小于等于900。
 */

public class Solution_d {
    public boolean chkPalindrome(ListNode A) {
        if (A == null ){
            return false;
        }
        if (A.next == null) {
            return true;
        }
        //fast 表示走的快的那个指针每次走二步
        ListNode fast = A;
        //slow表示走的满的指针，每次走一步，当fast走完时，slow刚刚好在中间位置
        ListNode slow = A;
        //p表示slow（在中间节点时）的下一个位置
        ListNode p;
        //pNext表示在p的下一个位置（目的是为了记录下一个节点的位置，防止反转后找不到p后面的节点）
        ListNode pNext;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        p = slow.next;
        pNext = p.next;
        while (p != null) {
            p.next = slow;
            slow = p;
            p = pNext;
            if (p != null){
                pNext = p.next;
            }

        }
        while (A != slow) {
            if (A.val == slow.val) {
                A = A.next;
                slow = slow.next;
            } else if (A.next == slow){
                return true;
            } else {
                return false;
            }
        }
        return true;
    }
}
