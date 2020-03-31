package PriorityQueue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;


public class PriorityQueue_Test {
    /**
     * 对优先级队列的使用练习。
     * @param args
     */
    public static void main(String[] args) {

        //创建一个空的PriorityQueue（优先级队列），底层默认容量是11；
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        //创建一个空的PriorityQueue（优先级队列），底层默认容量是initialCapacity：100
        PriorityQueue<Integer> queue1 = new PriorityQueue<>(100);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(7);
        list.add(3);
        list.add(10);
        list.add(8);
        PriorityQueue<Integer> queue2 = new PriorityQueue<>(list);
        System.out.println(queue2.size());//5
        System.out.println(queue2.peek());//3
        System.out.println(queue2);//[3, 7, 5, 10, 8]
        //插入或者删除优先级最搞的元素
        boolean i = queue2.offer(15);
        System.out.println(i);//true--返回值是boolean类型，插入成功为true，插入失败为false
        System.out.println(queue2);//[3, 7, 5, 10, 8, 15]
        //queue2.offer(null);//当插入空的时候会出现NullPointerException
        //System.out.println(queue2);
        //获取优先级最高的元素-如果队列为null则返回空
        System.out.println(queue2.peek());//3
        //移除优先级最高的元素并返回，如果优先级队列为空，返回null
        System.out.println(queue2.poll());//3
        //清空队列中的值
        queue2.clear();
        //判断队列是否为空
        System.out.println(queue2.isEmpty());//true

        System.out.println("-----------------------------------------------");
        int[] arr = {4,1,9,2,8,0,7,3,6,5};
        // 一般在创建优先级队列对象时，如果知道元素个数，建议就直接将底层容量给好
        // 否则在插入时需要不多的扩容
        // 扩容机制：开辟更大的空间，拷贝元素，这样效率会比较低
        PriorityQueue<Integer> q = new PriorityQueue<>(arr.length);
        for (int e: arr) {
            q.offer(e);
        }
        // 打印优先级队列中有效元素个数
        System.out.println(q.size()); //10
        // 获取优先级最高的元素
        System.out.println(q.peek()); //0
        // 从优先级队列中删除两个元素之和，再次获取优先级最高的元素
        q.poll();
        q.poll();
        // 打印优先级队列中有效元素个数
        System.out.println(q.size()); //8
        // 获取优先级最高的元素
        System.out.println(q.peek()); //2
        q.offer(0);
        // 获取优先级最高的元素
        System.out.println(q.peek()); //0
        // 将优先级队列中的有效元素删除掉，检测其是否为空
        q.clear();
        if(q.isEmpty()){
            System.out.println("优先级队列已经为空!!!");
        }
        else{
            System.out.println("优先级队列不为空");
        }

    }
    private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;
    private static void grow(int minCapacity) {
        int[] queue = new int[11];
        int oldCapacity = queue.length;
        // 如果原来长度（oldCapacity）小于64--执行oldCapacity+oldCapacity + 2及扩大2倍+2，
        // 如果大于，扩大1.5倍（oldCapacity >> 1--表示右移除以2的意思）
        //newCapacity新的长度
        int newCapacity = oldCapacity + ((oldCapacity < 64) ? (oldCapacity + 2) : (oldCapacity >> 1));
        if (newCapacity - MAX_ARRAY_SIZE > 0)
            newCapacity = hugeCapacity(minCapacity);
        queue = Arrays.copyOf(queue, newCapacity);
    }
    //了解--判断给定的minCapacity
    private static int hugeCapacity(int minCapacity) {
        if (minCapacity < 0) // overflow
            throw new OutOfMemoryError();
        return (minCapacity > MAX_ARRAY_SIZE) ?
                Integer.MAX_VALUE :
                MAX_ARRAY_SIZE;
    }
}
