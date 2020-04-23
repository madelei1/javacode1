package Review_Stack_Queue;

public class Stack_1 {
    /**
     * 创建一个栈，
     * @param args
     */
    int[] arr = new int[100];
    int size = 0;
    public  int pop() {
        if (size == 0) {
            return -1;
        }
        int x = arr[size -1];
        size --;
        return x;

    }
    public  int peek() {
        if (size == 0) {
            return -1;
        }
        return arr[size-1];


    }
    public  void push(int val) {
        if (size == 0) {
            arr[0] = val;
            size ++;
        } else {
            arr[size] = val;
            size ++;
        }
    }
    public  int size() {

        return  size;
    }
    public  boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }
}
