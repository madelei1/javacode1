package JavaWeb.Thread;

public class ThreadDemo7 {
    //start和run区别
    public static void main(String[] args) {
        Thread t1 = new Thread() {
            @Override
            public void run() {
                while (true) {
                    try {
                        System.out.println("hhe");
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        //t1.run(); //--这里的run调用和start调用 虽然结果一样，但是如果加入新的线程
        //就不会执行新进程的run，这里的run是串行
        t1.start();//如果执行start方法就会并行，输出结果会是hah和hhe交叉。

        Thread t2 = new Thread() {
            @Override
            public void run() {
                try {
                    System.out.println("hah");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        //t2.run();
        t2.start();

    }
}
