package JavaWeb;

public class ThreadDemo4 {

    //1、创建一个类来创建一个线程
    static class MyThread extends Thread {

        @Override
        public void run() {
            System.out.println("我是通过显示继承Thread类来创建的线程");
        }
    }

    //3、通过创建一个类来实现Runnable接口
    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println("我是通过实现Runnable接口实现的内部类");
        }
    }

    public static void main(String[] args) {

        Thread t1 = new MyThread();
        t1.start();

        //2、通过匿名内部类来继承thread,
        Thread t2 = new Thread() {

            @Override
            public void run() {
                System.out.println("我是通过匿名内部类来创建的新线程");
            }
        };
        t2.start();

        //3、通过创建一个类来实现Runnable接口
        Thread t3 = new Thread(new MyRunnable());
        t3.start();

        //4、通过创建一个匿名内部类来实现Runnable接口。

        Thread t4 = new Thread(new MyRunnable() {
            @Override
            public void run() {
                System.out.println("我是通过匿名内部类来实现的MyRunnable接口");
            }
        });
        t4.start();

        //5、通过lambda表达式来创建新线程

        Thread t5 = new Thread(() -> {
            System.out.println("我是通过lambda表达式创建的线程");
        });
        t5.start();
    }
}
