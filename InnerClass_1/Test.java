package InnerClass_1;

public class Test {
    public static void main(String[] args) {
        TestDemo testDemo = new TestDemo();
        TestDemo.InnerClass innerClass = testDemo.new InnerClass();
        innerClass.func();
        System.out.println();
        OuterClass2 outerClass2 = new OuterClass2();
        OuterClass2.InnerClass2 innerClass2 = new OuterClass2.InnerClass2(outerClass2);
        innerClass2.func();
        System.out.println();
        //相当于是外部类OuterClass3的一个子类
        new OuterClass3() {
            public void func() {
                System.out.println("xixixixixixixixxi");
            }
        }.func();


    }

}
