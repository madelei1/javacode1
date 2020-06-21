package JavaWeb.Thread;

import java.util.Scanner;

public class ThreadDemo14 {
    public static void main(String[] args) throws InterruptedException {
        Object locker = new Object();
        Thread t1 = new Thread() {
            @Override
            public void run() {
                Scanner sc = new Scanner(System.in);
                //这里使用了锁，将导致synchronized代码块运行结束释放锁，才会取运行t2
                synchronized(locker) {
                    int num = sc.nextInt();
                    System.out.println("t1"+"="+num);
                }
            }
        };
        t1.start();
        Thread t2 = new Thread() {
            @Override
            public void run() {
                while (true) {
                    synchronized(locker) {
                        System.out.println("t2");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        };
        //这里添加睡眠是防止t2先使用了synchronized
        Thread.sleep(1000);
        t2.start();
    }

}
