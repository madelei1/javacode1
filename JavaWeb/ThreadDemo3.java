package JavaWeb;

public class ThreadDemo3 {

    private  static long count = 100_0000_0000L;
    public static void main(String[] args) {
        //完成一个简单的任务：让代码分别针对a和b二个整数，自增很多很多次。
        serial();
        concurency();
    }
    //串行执行
    private static void serial() {
        //如何衡量一个代码执行的时间？
        //在代码开始的时候记录一个时间戳，
        //代码执行结束的时在来一个时间戳。
        //二者相减就是这个代码的执行时间。
        //时间戳：以1970年1月1日0时0分0秒，为基准时刻，计算当时时刻
        //到基准时刻的秒数/毫秒/微妙/纳秒之差。

        long beg = System.currentTimeMillis(); // 单位是ms
        int a = 0;
        for (long i = 0; i < count; i++) {
            a ++;
        }
        int b = 0;
        for (long i = 0; i < count; i++) {
            b ++;
        }
        long end = System.currentTimeMillis();
        System.out.println("time:"+(end - beg)+"ms");

    }

    //并发执行
    public static void concurency() {
        long beg = System.currentTimeMillis();

        Thread t1 = new Thread() {

            @Override
            public void run() {
                int a = 0;
                for (long i = 0; i < count; i++) {
                    a ++;
                }
            }
        };
        t1.start();

        Thread t2 = new Thread() {

            public void run() {
                int b = 0;
                for (long i = 0; i < count; i++) {
                    b ++;
                }
            }
        };
        t2.start();

        try {
            //线程等待方法--为了让concurency方法等待t1，t2，执行结束。
            //因为t1和t2和主线程concurency是并发式执行，如果要计算这二个运行时间，并且防止自己提前执行
            //就需要使用等待。如果不加直接出0。
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        long end = System.currentTimeMillis();
        System.out.println("time:"+(end - beg)+"ms");
    }
}
