package String;

public class Test_StringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("Hello").append("World");
        //System.out.println(sb);
        fun(sb);
        System.out.println(sb);
        //StringBufferd 字符串反转
        StringBuffer sb1 = new StringBuffer("Helloworld");
        System.out.println(sb.reverse());//dlroWolleH

        //StringBuffer删除指定范围的数据
        System.out.println(sb1.delete(5,10));//Hello

        //StringBuffer插入数据
        System.out.println(sb1.insert(5,"你好"));//Hello你好--这里没有打印出world，因为前面删除了

        System.out.println("-----------------");
        //String转为StringBuffer--方法一，利用构造方法实现
        StringBuffer str = new StringBuffer("helloWorld");
        System.out.println(str);

        //String转为StringBuffer--方法二，利用append()方法
        StringBuffer str2 = new StringBuffer();
        str2.append("hello");
        System.out.println(str2);

        //StringBuffer转化为String--方法一，通过String的构造方法转换为String
        StringBuffer n = new StringBuffer("hello");
        String string = new String(n);
        System.out.println(string);

        //StringBuffer转化为String--方法二，通过toString方法，在StringBuffer中重写了Object类的toString
        String str3 = n.toString();
        System.out.println(str3);

        //StringBuffer转化为String--方法三，通过字符串截方法
        String str4 = n.substring(0,n.length());
        System.out.println(str4);














    }
    public static void fun(StringBuffer temp) {
        temp.append("\n").append("www.bit.com.cn");
    }
    /*  \n表示换行,\\n表示打印\n
        HelloWorld
        www.bit.com.cn
    */

}
