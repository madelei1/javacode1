package Review;

public class List {
    //头节点
    ListNode head;
    //尾节点
    ListNode last;
    //初始长度
    int size;

    public List(ListNode head, ListNode last, int size) {
        this.head = head;
        this.last = last;
        this.size = size;
    }
    //头插
    public void addHead(int val) {
        ListNode node = new ListNode(val,null);
        if (head == null) {
            head = last = node;
            size ++;
        } else {
            node.next = head;
            head = node;
            size ++;
        }
    }
    //尾插
    public void addLast(int val) {
        ListNode node = new ListNode(val,null);
        if (last == null) {
            last = node;
            head = node;
            size ++;
        } else {
            last.next = node;
            last = node;
            size ++;
        }
    }
    //中间插入
    public void addIndex(int index,int val) {
        judge(index);
        ListNode node = new ListNode(val,null);
        if (index == 0) {
            addHead(val);
            return;
        } else if (index == size) {
            addLast(val);
            return;
        } else {
            node.next = traversal(index-1).next;
            traversal(index-1).next = node;
            size ++;
        }

    }
    //遍历链表
    public void traversal() {
        if (head == null) {
            return ;
        }
        while (head != null) {
            System.out.print(head.val +" ");
            head = head.next;
        }
    }
    //遍历到指定的链表位置，并返回
    public ListNode traversal(int index) {
        ListNode node = head;
        judge(index);
        if (node == null) {
            System.out.println("链表为空");
        } else {
            for (int i = 0; i < index; i++) {
                node = node.next;
            }
        }
        return node;
    }
    //返回链表的长度
    public int  size() {
        return size;
    }
    //判断索引是否合法
    public void judge(int index) {
        if (index < 0 && index > size) {
            System.out.println("索引非法");
            return;
        }
    }
    //查找链表中的值是否存在
    public boolean find(int val) {
        ListNode node = head;
        while (node != null) {
            if (node.val == val) {
                return  true;
            }
            node = node.next;
        }
        return false;
    }
    //查找通过链表中的值返回在链表中第几个
    public int returnNum(int val) {
        ListNode node = head;
        int count = 0;
        if (node == null) {
            return -1;
        } else {
           while (node != null) {
               count ++;
               if (node.val == val) {
                   return count;
               } else {
                   node = node.next;
               }
           }
        }
        return -1;
    }
    //删除一个指定的值对应的链表节点
    public void removeVal(int val) {
        while (head.val == val) {
            head = head.next;
            size --;
            return;
        }
        ListNode x = head;
        while (x.next != null) {
            if (x.next.val == val) {
                x.next = x.next.next;
                size --;
                return;
            } else {
                x = x.next;
            }
        }
    }
    //删除所有节点值为val的节点
    public void removeAllVal(int val) {
        while (head != null && head.val == val) {
            head = head.next;
            size --;
        }
        if (head  == null) {
            return;
        }
        ListNode x = head;
        while ( x.next != null) {
            if (x.next.val == val) {
                x.next = x.next.next;
                size --;
            } else {
                x = x.next;
            }

        }
    }
}
