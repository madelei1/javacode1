package JavaWeb;

public class ThreadDemo8 {
    //中断线程比较温和的方式--通过标记位来中断线程
    private static boolean isQUit = false;

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread() {

            @Override
            public void run() {
                while (!isQUit) {
                    System.out.println("我正忙着转账呢！！！");
                    try {
                        //如果这里执行了300ms此时isQUit是true，并不会直接中断程序，而是经过sleep执行结束才会进行中断。
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("转账被终止");
            }
        };
        t.start();
        Thread.sleep(5000);
        isQUit = true;
    }


}
