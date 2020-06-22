package JavaWeb.Thread;

public class ThreadDemo4_1 {
    static class MyThread extends Thread {

        @Override
        public void run() {
            System.out.println("我是显示继承一个类来实现创建线程");
        }
    }
    static class MyRunnable implements Runnable{
        @Override
        public void run() {
            System.out.println("我是通过显示实现接口来常见一个线程");
        }
    }
    public static void main(String[] args) {
        Thread t1 = new MyThread();
        t1.start();

        Thread t2 = new Thread() {
            @Override
            public void run() {
                System.out.println("我是通过匿名内部类创造的");
            }
        };
        t2.start();

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("我是通过匿名内部类来实现runnable接口");
            }
        });
        t3.start();

        Thread t4 = new Thread(new MyRunnable());
        t4.start();

        Thread t5 = new Thread(() -> {
            System.out.println("我是通过lambda表达式创建的线程");
        });
        t5.start();

    }
}
