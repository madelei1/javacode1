package JavaWeb.Thread;

public class ThreadDemo12 {
    public static void main(String[] args) {
        Thread t = new Thread() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        //在 start 之前获取一次线程状态
        System.out.println(t.getState());
        t.start();

        while (t.isAlive()) {
            System.out.println(t.getState());
        }
        System.out.println(t.getState());
    }
}
