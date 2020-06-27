package JavaWeb.Thread;

public class ThreadDemo4_2 {
    //创建线程的方法
    //1、通过显示继承Thread方法，
    static class person extends  Thread{
        @Override
        public void run() {
            System.out.println("我是显示继承Thread方法来创建的线程");
        }
    }
    //3、通过显示实现Runnable接口
    static class MyThread implements Runnable {
        @Override
        public void run() {
            System.out.println("我是通过显示实现Runnable接口的类");
        }
    }


    public static void main(String[] args) {
        //1、通过显示继承Thread方法，
        Thread t1 = new person();
        t1.start();
        //2、通过匿名内部类的方式构造线程
        Thread t2 = new Thread() {

            @Override
            public void run() {
                System.out.println("我是通过匿名内部类的方式创建的线程");
            }
        };
        t2.start();
        //3、通过显示实现Runnable接口
        Thread t3 = new Thread(new MyThread());
        t3.start();

        //4、通过匿名实现Runnable接口
        Thread t4 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("我是通过匿名实现接口创建的线程");
            }
        });
        t4.start();

        //5、通过lambda表达式

        Thread t5 = new Thread(()->{
            System.out.println("我是通过lambda表达式创建的");
        });
        t5.start();


    }




}
