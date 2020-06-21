package JavaWeb.Thread;

public class ThreadDemo15 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("我是t1线程");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("我的工作结束了");
            }
        };
        t1.start();
        t1.join();
        System.out.println("我是主线程");
    }
}
