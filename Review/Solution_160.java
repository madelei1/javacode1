package Review;
/*编写一个程序，找到两个单链表相交的起始节点
*
*
* 注意事项：相交可能在前面也可能在后面，链表的长度可能不一样，可能在相交前面，也有可能在相交后面*/
public class Solution_160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode nodeA = headA;
        ListNode nodeB = headB;
        int A = 0;
        int B = 0;
        while (nodeA != null) {
            A ++;
            nodeA = nodeA.next;
        }
        while (nodeB !=  null) {
            B ++;
            nodeB = nodeB.next;
        }
        ListNode L = null;
        ListNode D = null;
        //超出长度
        int z = 0 ;
        //确保L是最长的
        if (A > B) {
             z = A - B;
             L = headA;
             D = headB;
        } else {
             z = B - A;
             L = headB;
             D = headA;
        }
        int y = 0;
        //先保证走完超过的长度，又要确保走超过长度的时候没有相遇到，走完超过长度时候在一起走。
        while (L != null) {
            y ++;
            if (L == D) {
                return L;
            }
            if (y > z) {
                L = L.next;
                D = D.next;
            } else {
                L = L.next;
            }

        }

        return  null;
    }
}
