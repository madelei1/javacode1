package Review_002.Thread_002;

public class Thread_002 {
    //创建线程的步骤

    static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println("我是显示继承thread类");
        }
    }
    static  class MyRunnable implements Runnable {
        public void run() {
            System.out.println("我是显示实现Runnable接口");
        }
    }
    public static void main(String[] args) {

        //1、显示继承Thread
        Thread t1 = new MyThread();
        t1.start();

        //2、显示实现Runnable()接口
        Thread t2 = new Thread(new MyRunnable());
        t2.start();
        //3、通过匿名内部类来实现的
        Thread t3 = new Thread() {
            @Override
            public void run() {
                System.out.println("我是通过匿名内部类来实现的");
            }
        };
        t3.start();

        //4、通过匿名实现Runnable接口
        Thread t4 = new Thread(new Runnable(){
            @Override
            public void run() {
                System.out.println("我是通过匿名实现Runnable接口的");
            }
        });
        t4.start();

        //5、通过lambda表达式实现
        Thread t5 = new Thread(() -> {
            System.out.println("我是通过lambda表达式实现");
        });
        t5.start();
    }
}
