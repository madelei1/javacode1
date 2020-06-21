package JavaWeb.Thread;

public class ThreadDemo9 {

    public static void main(String[] args) throws InterruptedException {

        Thread t = new Thread() {
            @Override
            public void run() {
                while (!Thread.currentThread().isInterrupted()) {
                    System.out.println("我正在转账");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        //e.printStackTrace();
                        break;//这里不加break程序会继续运行下去，但是会抛出能够异常，如果异常在屏蔽，相当于没有操作，程序正常运行
                    }
                }
                System.out.println("转账被终止");
            }
        };
        t.start();
        Thread.sleep(5000);
        System.out.println("有内鬼，终止交易");
        t.interrupt();

    }
}
