package JavaWeb;

public class ThreadDemo10 {

    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        //通过调用这个方法可以当道线程对象的属性
        System.out.println(t.isInterrupted());
    }
}
