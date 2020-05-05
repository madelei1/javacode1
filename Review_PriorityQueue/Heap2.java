package Review_PriorityQueue;

public class Heap2 {
    int[] elem;
    int useSize;


    public Heap2() {
        this.elem = new int[10];
        this.useSize = 0;
    }
    public void adjustDown(int root , int len) {
        int parent = root;
        int child = 2*parent+1;

        while (child < len) {
            if (child+1 < len && elem[child] > elem[child+1]) {
                child ++;
            }
            if (elem[child] < elem[parent] ) {
                int x = elem[child];
                elem[child] = elem[parent];
                elem[parent] = x;
                parent = child;
                child = 2*parent+1;
            } else {
                break;
            }
        }
    }
    public void create(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            elem[i] = arr[i];
            useSize ++;
        }
        for (int i = (useSize-1-1)/2; i >= 0; i--) {
            adjustDown(i,useSize);
        }
    }
    public void show() {
        for (int i = 0; i < elem.length; i++) {
            System.out.print(elem[i] + " ");
        }
    }
}
