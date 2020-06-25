package Test;

public class Test1 {
    public static void main(String[] args) {
        Test1 test = new Test1();
        test.aMethod();
        int j = test.aMethod();
        System.out.println(j);


    }
    static  int i = 0; //不能在非静态方法中定义，但是可以在静态方法中使用
    public int aMethod(){

        i++;
        return i;
    }

}
