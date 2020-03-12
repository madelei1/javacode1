package Practice1;

public class Demo_3 {
    public static void main(String[] args) {
        /*
        *//*1. 定义接口A，普通类B实现接口A
          2. A接口中，定义抽象方法showA。
          3. A接口中，定义默认方法showB。
          4. B类中，重写showA方法
          5. 测试类中，创建B类对象，调用showA方法，showB方法。*//*
        B x = new B();
        x.showA();
        x.showB();
    }
}
interface A {
    public abstract void showA();
    public default void showB() {
        System.out.println("A--B");
    }
}
class B implements A {
    @Override
    public void showA() {
        System.out.println("B--A");
        */
        /* 1. 定义接口A，普通类B实现接口A。
        2. A接口中，定义抽象方法showA。
        3. A接口中，定义私有方法show10（String str），循环打印10次str。//jdk 9新特性，我的是jdk8，不能实现---定义为非私有
        4. A接口中，定义默认方法showB10，showC10，分别调用show10方法，传入参数。
        5. 测试类中，创建B对象，调用showA方法，showB10方法，showC10方法
        */
        /*
        B x = new B();
        x.showA();
        //x.show10("abc");
        x.showB10();
        x.showC10();
    }
}
interface A {
    public abstract void showA();
    public default void showB10() {
        show10("bbb");
    }
    public default void showC10() {
        show10("ccc");
    }
    public default void show10(String str) {
        for (int i = 0; i < 10; i++) {
            System.out.println(str);
        }
    }
}
class B implements A{
    public void showA(){
        System.out.println("AAA");
        */
        /*  1.定义接口A，普通类B实现接口A。
            2. A接口中，定义抽象方法showA。
            3. A接口中，定义私有静态方法show10（String str），循环打印10次str。
            4. A接口中，定义静态方法showB10，showC10，分别调用show10方法，传入参数。
            5. B类中，定义静态方法showD
            6. 测试类中，使用A接口，调用静态showB10方法，showC10方法，
            7. 测试类中，使用B类，调用showA方法，showD方法。
            */
        /*
        A.showB10();
        A.show10("测试类");
        B.showD();
        B x = new B();
        x.showA();
    }
}
interface A {
    public abstract void showA();
    public static void showB10(){
        show10("BBB");
    }
    public static void show10(String str) {
        for (int i = 0; i < 10; i++) {
            System.out.println(str);
        }
    }
}
class B implements A {
    @Override
    public void showA() {
        System.out.println("showA");
    }
    public static void showD() {
        System.out.println("DDD");
        */
        /*1. 定义接口Universe，提供抽象方法doAnything。
          2. 定义普通类Star，提供成员发光shine方法
          3. 定义普通类Sun，继承Star类，实现Universe接口
          4. 测试类中，创建Star对象，调用shine方法
          5. 测试类中，多态的方式创建Sun对象，调用doAnything方法，向下转型，调用shine方法。
        */

        Star x = new Star();
        x.shine();
        Star y = new Sun();
        ((Sun) y).doAnything();
        y.shine();
    }
}
interface Universe {
    public abstract void doAnything();
}
class Star {
    public void shine() {
        System.out.println("shine我要发光");
    }
}
class Sun extends Star implements Universe {
    @Override
    public void doAnything() {
        System.out.println("doAnything我要发光");

    }
}