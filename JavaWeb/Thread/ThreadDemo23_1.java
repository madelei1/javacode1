package JavaWeb.Thread;

public class ThreadDemo23_1 {
    //阻塞队列
    static class BlockingQueue {
        private int[] arr = new int[100];
        private volatile int head = 0;
        private volatile int tail = 0;
        private volatile int size = 0;

        public void offer(int val) throws InterruptedException {

            synchronized (this) {

                while (size == arr.length) {
                    wait();
                }
                arr[tail] = val;
                tail++;
                if (tail == arr.length) {
                    tail = 0;
                }
                size++;
                notify();
            }
        }

        public int poll() throws InterruptedException {
            int x = 0;
            synchronized (this) {

                while (size == 0) {
                    wait();
                }
                x = arr[head];
                head++;
                if (head == arr.length) {
                    head = 0;
                }
                size--;
                notify();
            }
            return x;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        BlockingQueue blockingQueue = new BlockingQueue();
        //生产者线程
        Thread producer = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    try {
                        blockingQueue.offer(i);
                        System.out.println("生产者i："+i);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        producer.start();
        //生产者线程
        Thread customer = new Thread() {
            @Override
            public void run() {
                while (true) {
                    try {
                        int val = blockingQueue.poll();
                        System.out.println("消费者线程"+val);
                        //Thread.sleep(300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        customer.start();
        customer.join();
        producer.join();
    }

}

