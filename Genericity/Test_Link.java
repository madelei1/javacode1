package Genericity;

public class Test_Link {


    public static<T extends Comparable<T>> TestLink<T>.Node mergeList(TestLink<T>.Node headA, TestLink<T>.Node headB) {
        TestLink<T> tTestLink = new TestLink<T>();
        TestLink<T>.Node newHead = tTestLink.new Node();
        TestLink<T>.Node tmp = newHead;
        while (headA != null && headB != null) {
            if(headA.data.compareTo(headB.data) < 0) {
                tmp.next = headA;
                headA = headA.next;
                tmp = tmp.next;
            }else {
                tmp.next = headB;
                headB = headB.next;
                tmp = tmp.next;
            }
        }
        if(headA != null) {
            tmp.next = headA;
        }
        if(headB != null) {
            tmp.next = headB;
        }
        return newHead.next;

    }
}
