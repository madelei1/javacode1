package JavaWeb.Thread;

public class ThreadDemo20 {
        //饿汉模式：当类加载的时候，创建实例，直接创建。
    static class Singleton {
        private static Singleton instance = new Singleton();

        private Singleton() {
        }
        public static Singleton getInstance() {
            return instance;
        }
    }
    public static void main(String[] args) {
        //具体用法
        //想要获得Singleton实例，就必须通过getInstance获取
        //不能new（因为构造方法是私有的，new的时候会直接编译出错）

        Singleton singleton = Singleton.getInstance();
        //这里是内部类，所以可以new出来，如果在其他内中访问就是不可以的
        Singleton singleton1 = new Singleton();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton == singleton2);
        System.out.println(singleton == singleton1);

    }
}
