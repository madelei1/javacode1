package JavaWeb.Thread;

public class ThreadDemo6 {

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("我是一个新线程，我还在运行");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("运行结束");
            }
        };

        //先在start之前来调用get方法获取到线程的相关属性
        //获取线程Id
        System.out.println(t.getId());//11
        //获取线程name
        System.out.println(t.getName());//Thread-0
        //获取线程状态
        System.out.println(t.getState());//NEW
        //获取线程优先级
        System.out.println(t.getPriority());//5
        //获取线程是否存活信息
        System.out.println(t.isAlive());//false
        //获取线程是否被中断信息
        System.out.println(t.isInterrupted());//false
        //判断线程是否为后台线程
        System.out.println(t.isDaemon());//false
        t.start();
        while (t.isAlive()) {
            System.out.println("该线程还在运行，状态是："+t.getState());
            Thread.sleep(500);
        }


    }
}
