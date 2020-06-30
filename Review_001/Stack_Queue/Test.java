package Review_001.Stack_Queue;

public class Test {
    public static void main(String[] args) {
        //int[] arr = {1,3,5,7,9,11,13,15};
        Stack_0 stack_0 = new Stack_0();

        stack_0.push(1);
        stack_0.push(3);
        stack_0.push(5);
        stack_0.push(7);
        stack_0.push(9);
        stack_0.push(11);
        System.out.println(stack_0.size());
        for (int i = 0; i < 6; i++) {
            System.out.print(stack_0.pop()+" ");
        }
        System.out.println();
        System.out.println(stack_0.isEmpty());
        System.out.println(stack_0.size());
        System.out.println("-----------------------------------");

        Queue_0 queue_0 = new Queue_0();
        queue_0.offer(1);
        queue_0.offer(3);
        queue_0.offer(5);
        queue_0.offer(7);
        queue_0.offer(9);
        queue_0.offer(11);
        queue_0.offer(13);
        queue_0.offer(15);
        System.out.println(queue_0.size());
        System.out.println(queue_0.isEmpty());
        for (int i = 0; i < 8; i++) {
            System.out.print(queue_0.pop()+" ");
        }


    }
}
