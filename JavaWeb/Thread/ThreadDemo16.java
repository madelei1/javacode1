package JavaWeb.Thread;

import java.util.Scanner;

public class ThreadDemo16 {
    /**
     * 如果同时synchronized锁的对象表示同一个那么就不会影响其他线程运行
     * @param args
     */
    public static void main(String[] args) {
        Object lock1 = new Object();
        Object lock2 = new Object();

        Thread t1 = new Thread() {
            @Override
            public void run() {
                Scanner sc = new Scanner(System.in);
                synchronized (ThreadDemo16.class) {
                    System.out.println("请输入一个整数");
                    int num = sc.nextInt();
                    System.out.println("t1:"+num);
                }
            }
        };
        t1.start();

        Thread t2 = new Thread() {

            @Override
            public void run() {
                while (true) {
                    System.out.println("t2");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        t2.start();
    }
}
