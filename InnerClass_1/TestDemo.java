package InnerClass_1;

public class TestDemo {
    public int data1 = 10;
    int data2 = 20;
    private int data3 = 30;
    public static int data4 = 40;

    public static void func() {
        //static int a = 10; //error
        System.out.println(data4);
    }

    /**
     * 实例内部类：
     * 1、如何得到实例内部类的对象？
     * 外部类名.内部类名 变量 = 外部类对象的引用. new 内部类();
     * testDemo.new InnerClass();----这里的testDemo 的t是小写
     * TestDemo.InnerClass innerClass = testDemo.new InnerClass();
     * 2、实例内部类中能不能用，static类型的属性？，不能！
     * 如果需要定义，必须是static final
     * 必须是编译时期确定的！
     * static的初始化在编译的时候。
     * 3、实例内部类是否有额外的开销？ 有
     * 实例内部类当中包含外部类的this TestDemo.this
     * 4、每一个类逗换产生一个对应的字节码文件class。
     * TestDemo.class     TestDemoClass$InnerClass.class
     */
    class InnerClass {
        public int data5 = 50;
        public static final int data6 = 13;
        public int data1 = 9999;
        public void func() {
            System.out.println("InnerClass:data1"+this.data1);
            System.out.println("data2"+TestDemo.this.data2);
            System.out.println("data3"+data3);
            System.out.println("data4"+data4);
            System.out.println("data5"+data5);
            System.out.println("InnerClass::func()!");
            System.out.println("TestDemo:data1:"+TestDemo.this.data1);
        }
    }
}
class OuterClass2 {
    public int data1 = 10;
    int data2 = 20;
    private int data3 = 30;
    public static int data4 = 40;

    /**
     * 静态内部类：static class InnerClass2
     *
     * 相当于是一个静态的属性
     * 1、如何拿到静态内部类的对象？
     * OuterClass2.InnerClass2 innerClass2 = new OuterClass2.InnerClass2();
     *
     * 2、外部类的实例数据成员是否可以被访问？静态到是可以的！
     * 非静态的不能，如果非要在内部类中访问，就在静态的内部类中拿到一个外部类的对象就ok了。
     * 如：下面的OuterClass2 out;
     */

    static class InnerClass2 {
        public int data5 = 50;
        int data6 = 60;
        private int data7 = 70;
        public static int data8 = 80;
        OuterClass2 out;
        public InnerClass2(OuterClass2 o) {
            this.out = o;
        }
        public void func() {
            System.out.println(out.data1);
            System.out.println("InnerClass:: func()!");

        }

        /**
         * 匿名内部类
         */
    }
}
class OuterClass3 {
    public void func() {
        System.out.println("hhhhhhhhhhhh!");
    }
}