package JavaWeb.Thread;

public class ThreadDemo5 {
    public static void main(String[] args) {

        Thread t = new Thread("我是一个新线程，起一个比较长度名字没有关系吧。。") {
            @Override
            public void run() {
                while (true) {
                    System.out.println("hehe");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        t.start();

    }
}
