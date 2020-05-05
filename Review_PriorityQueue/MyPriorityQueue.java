package Review_PriorityQueue;

public class MyPriorityQueue {

    private int[] array = new int[100];
    private int size = 0;
    Heap1 heap1 = new Heap1();

    public void offer1(int val) {
        heap1.push(val);

    }
    public void poll1() {

        heap1.pop();
    }
    public int size1() {

        return heap1.useSize;
    }
    public boolean isEmpty1() {

        return heap1.isEmpty();
    }

    public boolean contains1(int val) {
        for (int i = 0; i < heap1.elem.length; i++) {
            if(heap1.elem[i] == val) {
                return true;
            }
        }
        return false;
    }

}
