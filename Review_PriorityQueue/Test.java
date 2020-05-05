package Review_PriorityQueue;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Heap1 heap1 = new Heap1();
        int[] arr = { 27,15,19,18,28,34,65,49,25,37 };
        heap1.createHeap(arr);
        heap1.push(80);
        heap1.show();
        System.out.println();
        /*Heap2 heap2 = new Heap2();
        heap2.create(arr);
        heap2.show();*/
        /*int x = 2;
        int y = x << 1;
        System.out.println(y);*/
        heap1.pop();
        heap1.show();
        System.out.println();
        heap1.headSort();
        heap1.show();

    }

}
