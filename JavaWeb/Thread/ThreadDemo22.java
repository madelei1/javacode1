package JavaWeb.Thread;

public class ThreadDemo22 {

    static class Singleton {
        private volatile static Singleton instance= null;

        private Singleton() { }

        private static Singleton getInstance() {
            //这里添加if是为了解决已经实例化的instance，就不需要在锁了，解决了过多锁的开销
            if (instance == null) {
                //这里加锁解决instance没有被实例化的时候，被多个线程同时访问修改
                synchronized (Singleton.class) {
                    //这里的if保证new操作只执行一次。
                    if (instance == null) {
                        instance = new Singleton();
                    }
                }
            }
            return instance;
        }
    }
}
