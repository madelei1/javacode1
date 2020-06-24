package JavaWeb.Thread;

import java.util.concurrent.PriorityBlockingQueue;

public class ThreadDemo24 {

    //创建一个类来描述向定时器中存放的任务
    static class Task implements Comparable<Task> {
        //commend 表示任务具体要干什么
        //Runnable 接口应该由那些打算通过某一线程执行其实例的类来实现。
        // 并且类必须定义一个称为 run 的无参数方法
        private Runnable commend;
        //time 表示什么时候可以执行这个任务
        private long time;

        /**
         * 参数的time表示多少ms之后执行任务
         * 成员time表示一个绝对的时间
         *System.currentTimeMillis()返回以毫秒为单位的当前时间。
         * @param commend
         * @param time
         */
        public Task(Runnable commend, long time) {
            this.commend = commend;
            this.time = System.currentTimeMillis()+ time;
        }
        public void run() {
            commend.run();
        }

        @Override
        public int compareTo(Task o) {
            return (int) (time - o.time);
        }
    }
    static class Timer {
        // 只是一把锁，通过这个来解决扫描线程的忙等问题
        Object mailBox = new Object();

        //优先队列包含了都有那些任务需要执行
        private PriorityBlockingQueue<Task> queue = new PriorityBlockingQueue<>();
        //还需要有一个专门的线程来扫描队首元素

        class Worker extends Thread {
            @Override
            public void run() {
                while (true) {
                    try {
                        //进行take操作，就当作已经把元素从队列中删除了。
                        //如果task时间还没有到，需要把task在塞回队列
                        Task task = queue.take();
                        long curTime = System.currentTimeMillis();
                        if (task.time > curTime) {
                            //执行任务的时机还没有成熟，放回去
                            queue.put(task);
                            //发现时间还没有到，就借助wait让线程能够等待
                            synchronized (mailBox) {
                                //wait加上参数之后，表示，即使没有notify，时间到龙，也会自动提醒
                                mailBox.wait(task.time-curTime);
                            }
                        } else {
                            //执行任务的时机到了
                            task.run();
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        public Timer() {
            Worker worker = new Worker();
            worker.start();
        }

        //还要提供一个用于注册任务的核心接口
        //command表示要执行的操作是什么，
        // after表示多长时间来执行（相对时间）。
        public void schedule(Runnable command, long after) {
            Task task = new Task(command,after);
            queue.put(task);
            //新的任务可能要比原来的任务更早执行，
            // 每次注册新任务都唤醒一下扫描线程
            synchronized(mailBox) {
                mailBox.notify();
            }
        }

        public static void main(String[] args) {
            Timer timer = new Timer();
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    System.out.println("闹钟响了");
                    timer.schedule(this,3000);
                }
            };
            System.out.println("开始计时");
            timer.schedule(runnable,3000);

        }
    }
}
