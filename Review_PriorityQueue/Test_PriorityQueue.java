package Review_PriorityQueue;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Test_PriorityQueue {
    public static void main(String[] args) {
        //默认容量是11
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(5);
        priorityQueue.offer(2);
        priorityQueue.offer(12);
        priorityQueue.offer(15);
        priorityQueue.offer(1);
        System.out.println(priorityQueue);
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(8);
        arrayList.add(12);
        arrayList.add(9);
        PriorityQueue<Integer> q1 = new PriorityQueue<>(arrayList);
        System.out.println(arrayList);
        System.out.println(q1);
        //出队顺序，最小的优先
        System.out.println(priorityQueue.poll());
        //System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        /*System.out.println(q1.poll());
        System.out.println(q1.poll());*/
        System.out.println(priorityQueue.isEmpty());
        System.out.println(q1.size());
        PriorityQueue<Integer> priorityQueue1 = new PriorityQueue<>(2);
        priorityQueue1.offer(1);
        priorityQueue1.offer(2);
        priorityQueue.offer(5);
        char x = 'x';
        boolean i = priorityQueue1.offer(3);
        System.out.println(i);//true
        System.out.println(priorityQueue1.size());
        priorityQueue1.clear();
        System.out.println(q1);//true
        System.out.println(q1.contains(8));//true
        System.out.println(q1.remove(8));//true
        System.out.println(q1.remove(8));//false
        System.out.println(q1.toArray());//[Ljava.lang.Object;@2b193f2d
    }
}
