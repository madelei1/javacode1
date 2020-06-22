package JavaWeb.Thread;

import java.util.Scanner;

public class ThreadDemo17 {

    static class Counter {
        //volatile 修饰共享变量，保证可见性。
        volatile public int count = 0;
    }
    public static void main(String[] args) {

        Counter counter = new Counter();

        Thread t1 = new Thread() {
            @Override
            public void run() {
                while (counter.count == 0) {

                }
                System.out.println("循环结束");
            }
        };
        t1.start();
        Thread t2 = new Thread() {
            @Override
            public void run() {
                Scanner sc  = new Scanner(System.in);
                counter.count = sc.nextInt();
            }
        };
        t2.start();
    }
}
