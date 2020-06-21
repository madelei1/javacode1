package JavaWeb.Thread;

public class ThreadDemo13 {
    /*static class Counter {
        public int count = 0;
        public void increase() {
            ++ count;
        }
    }*/
    static int count = 0;
    public static void main(String[] args) throws InterruptedException {

       // Counter counter = new Counter();
        Thread t1 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 5000; i++) {
                    //counter.increase();
                    count ++;
                }
            }
        };
        t1.start();
        Thread t2 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 5000; i++) {
                    //counter.increase();
                    count ++;
                }
            }
        };
        t2.start();
        //join等待线程1，和线程2结束才会运行主线程
        t1.join();
        t2.join();
        System.out.println(count);
    }
}
