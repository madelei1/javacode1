package Stack;

import java.util.Arrays;

public class MyStack<T> {
    public int useSize;
    public T[] arr;

    public MyStack() {
        this.useSize = 0;
        this.arr = (T[])new Object[5];
    }
    //入栈
    public void push(T val) {
        if (isFull()) {
            throw new RuntimeException("栈满了");
        } else {
            arr[useSize] = val;
            useSize ++;
        }
    }
    //出栈
    public T pop() {
        if (isNull()) {
            throw new RuntimeException("栈为空");
        } else {

            T s =  arr[useSize -1];
            useSize --;
            return s;
        }
    }
    //是否为空
    public boolean isNull() {
        if (useSize == 0) {
            return true;
        }
        return false;
    }
    //是否为满
    public boolean isFull() {
        if (useSize == arr.length) {
            return true;
        }
        return false;
    }

    //得到栈顶元素
    public T peek() {
        if (isNull()) {
            throw new RuntimeException("栈为空");
        }
        return arr[useSize -1];
    }

    @Override
    public String toString() {
        return "MyStack{" +
                "useSize=" + useSize +
                ", arr=" + Arrays.toString(arr) +
                '}';
    }
}
