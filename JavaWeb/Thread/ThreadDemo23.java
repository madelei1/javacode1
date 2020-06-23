package JavaWeb.Thread;

public class ThreadDemo23 {
    //基本特点：
    //当队列满的时候：再去入队列就会阻塞等待，直到队列头空余位置
    //当队列控的时候，再去出队列也会阻塞等待，直到队列中有元素
    //对象等待集（wait/notify）
    static class BlockingQueue {
        private int[] array = new int[1000];
        private volatile int size = 0;
        //队列头，队列尾
        private volatile int head = 0;
        private volatile int tail = 0;
        public void offer(int value) throws InterruptedException {
            synchronized(this) {
                //这里最好写成while，因为在wait在等待唤醒                  //的过程中给唤醒了，但是条件还没有满足情况，
                //例如，此时有二个线程都在执行offer，并且
                //逗在等待，此时二个线程被notifyAll唤醒，
                //线程1先抢到锁，线程1进行插入，这个时候队列有            //满了这个时候线程2抢到锁了，结果，此时发现插
                //入的条件有不满足条件，这个时候如果不等待，
                //而执行、下面操作可能就会出现错误。所以使用
                //while进行判断，比直接使用if强
                while (size == array.length) {
                    wait();
                }
                array[tail] = value;
                tail ++;
                if (tail == array.length) {
                    tail = 0;
                }
                size ++;
                //此处的通知是为了唤醒消费者来去进行获取数据
                notify();
            }
        }

        public int poll() throws InterruptedException {
            int ret = 0;
            synchronized(this) {
                while (size == 0) {
                    wait();
                }
                ret = array[head];
                head ++;
                if (head == array.length) {
                    head = 0;
                }
                size --;
                //此处是为了唤醒生产者线程来进行插入数据
                notify();
            }
            return ret;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        BlockingQueue blockingQueue = new BlockingQueue();

        //消费者线程
        Thread customer = new Thread() {
            @Override
            public void run() {
                while (true) {
                    try {
                        int value = blockingQueue.poll();
                        System.out.println("消费者："+value);
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        customer.start();
        //生产者线程
        Thread producer = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    try {
                        blockingQueue.offer(i);
                        System.out.println("生产者："+i);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        producer.start();
        customer.join();
        producer.join();


    }
}
