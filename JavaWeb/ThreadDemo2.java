package JavaWeb;

public class ThreadDemo2 {
    static class MyThread extends Thread{
        @Override
        public void run() {
            while (true) {
                System.out.println("我是新线程");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 多个线程调度之间的顺序是无法控制的。运行main方法执行的输出结果是打印无序的。
     * @param args
     */
    public static void main(String[] args) {
        //向上转型
        Thread t = new MyThread();
        t.start();
        while (true) {
            System.out.println("我是主线程");
            try {
                //通过调用sleep方法让线程进行睡眠一会。
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
