package JavaWeb.Thread;

public class ThreadDemo19 {
    //在这个代码中，必须保证，WaitTask和NotifyTask对应的实例中，
    // 持有的locker是同一个对象
    static class WaitTask implements Runnable {
        private Object locker;

        public WaitTask(Object locker) {
            this.locker = locker;
        }

        @Override
        public void run() {
            while (true) {
                synchronized(locker) {
                    System.out.println("wait开始");
                    try {
                        locker.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("wait 结束");
                }
            }
        }
    }
    static class NotifyTask implements Runnable {
        private Object locker;

        public NotifyTask(Object locker) {
            this.locker = locker;
        }

        @Override
        public void run() {
            synchronized (locker) {
                System.out.println("notify 开始");
                locker.notify();
                System.out.println("notify 结束");
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {

        Object locker1 = new Object();
        Object locker2 = new Object();
        //这里只是在内核中创建了pcb，这个对应的线程何时执行还得看调度器。
        Thread t1 = new Thread(new WaitTask(locker1));
        Thread t2 = new Thread(new NotifyTask(locker2));
        t1.start();
        //这里的sleep也只是大概率让t1先执行，不能一定保证
        Thread.sleep(1000);
        t2.start();
    }
}
