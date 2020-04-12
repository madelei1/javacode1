package MapAndSet;

public class HashBucket {

    static class Node {
        public int key;
        public int value;
        public Node next;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    public Node[] array; // 单链表头节点的引用
    public int usedSize; // 记录当前存放了多少给数据了
    //负载因子：哈希表的个数/哈希表的长度

    public HashBucket() {
        this.array = new Node[8];
        this.usedSize = 0;
    }
    //put方法
    public void put(int key, int value) {
        int index = key % this.array.length;
        //2、遍历index下标的这个单链表，看是否查找数据key，
        // 如果存在那么更新value值
        for (Node cur = array[index]; cur != null; cur = cur.next) {
            if (cur.key == key) {
                cur.value = value;
                return;
            }
        }
        //3、如果没有找到，说明没有当前k
        Node node = new Node(key,value);
        node.next = array[index];
        array[index] = node;
        this.usedSize ++;
        //达到要求，进行扩容
        if (loadFactor() >= 0.75) {
            resize();
        }


    }
    //计算负载因子
    private double loadFactor() {
        return usedSize *1.0/ array.length;
    }
    //扩容
    private void resize() {
        Node[] newArray = new Node[array.length*2];
        //1、遍历原来的数组，把原来的数据重新哈希到性的数组中
        for (int i = 0; i < array.length; i++) {
            Node curNext;
            for (Node cur = array[i]; cur != null; cur = curNext) {
                //保护原来的next
                curNext = cur.next;
                //newArray 中新的index下标
                int index = cur.key % newArray.length;
                //头插到新的数组的 index位置
                cur.next = newArray[index];
                newArray[index] = cur;
            }
        }
        array = newArray;
    }
    public int getValue(int key) {
        int index = key % array.length;
        for (Node cur = array[index]; cur != null;cur = cur.next) {
            if(cur.key == key) {
                return cur.value;
            }
        }
        return -1;
    }

}
