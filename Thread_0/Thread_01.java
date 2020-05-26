package Thread_0;

import java.util.Random;

public class Thread_01 {
    private static class MyThread extends Thread {

        public void run() {
            Random random  = new Random();
            while (true) {
                //打印线程的名称
                System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(random.nextInt(10));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();

        t1.start();
        t2.start();
        t3.start();
        Random random = new Random();
        while (true) {
            //打印线程的名称
            System.out.println(Thread.currentThread().getName());

            try {
                Thread.sleep(random.nextInt(10));
            } catch (InterruptedException e) {
                //随机停止运行0-9
                e.printStackTrace();
            }
        }
    }
}
