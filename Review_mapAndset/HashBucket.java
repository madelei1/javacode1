package Review_mapAndset;

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
    public Node[] array;
    public int useSize;
    public HashBucket() {
        this.array = new Node[8];
        this.useSize = 0;
    }
    //put 方法
    public void put(int key,int value) {
        int index = key % array.length;

        for (Node cur = array[index]; cur != null; cur = cur.next) {
            if (cur.key == key) {
                cur.value = value;
                return;
            }
        }
        Node node = new Node(key,value);
        Node cur = array[index];
        node.next = cur;
        array[index] = node;
        useSize ++;

        //判断是否需要扩容
        if (loadFactor() >= 0.75) {
            resize();
        }
    }

    /**
     *负载因子
     * @return
     */
    private double loadFactor() {
        return useSize*1.0/array.length;
    }

    /**
     * 扩容
     */
    private void resize() {
        Node[] newArray = new Node[array.length << 1];
        for (int i = 0; i < array.length; i++) {
            Node curNext;
            for (Node cur = array[i]; cur != null; cur = curNext) {
                curNext = cur.next;
                int index = cur.key/newArray.length;
                cur.next = newArray[index];
                newArray[index] = cur;
            }
        }
        array = newArray;

    }

    //get
    public int getValue(int key) {
        int index = key % array.length;
        Node node = array[index];
        for (Node cur = node; cur != null; cur = cur.next) {
            if (cur.key == key) {
                return cur.value;
            }
        }
        return -1;
    }
}
