package Review_001;

public class Stack_0 {
    public int useSize;
    public int[] arr;

    public Stack_0() {
        this.useSize = 0;
        this.arr = new int[100];
    }

    public boolean push(int val) {

        if (useSize >= arr.length) {
            return false;
        }
        arr[useSize] = val;
        useSize ++;
        return true;
    }

    public int pop() {

        if (useSize == 0) {
            throw new RuntimeException("栈为空");
        }
        int x = arr[useSize-1];
        useSize --;
        return x;

    }
    public int size() {
        return useSize;
    }

    public boolean isEmpty() {

        return useSize == 0;
    }



}
