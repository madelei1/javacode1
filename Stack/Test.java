package Stack;

public class Test {
    public static void main(String[] args) {
        MyStack<Integer> i = new MyStack<>();
        i.push(1);
        i.push(2);
        i.push(3);
        i.push(4);
        i.push(5);
        System.out.println(i);//MyStack{useSize=5, arr=[1, 2, 3, 4, 5]}
        //i.push(6);//Exception in thread "main" java.lang.RuntimeException: 栈满了
        System.out.println(i.peek());//5
        System.out.println(i.pop());//5
        System.out.println(i.peek());//4
        System.out.println(i.useSize);//4

    }
}
