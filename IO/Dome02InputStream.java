package IO;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

/*
* 字节输入流一次读取多给字节的方法：
*   int read(byte[] b) 从输入流中读取一定数量的字节，并将其存储在缓冲区数组b中。
* 明确二件事情：
*   1、方法的参数byte[]的作用？
*       起到缓冲作用存储每次读取到多个字节
*       数组的长度一般定义为1024（1kb）或者1024的整数倍
*   2、方法的返回值int是什么？
*   每次读取的有效字节个数
*  String类的构造方法
*       String(byte[] bytes):把字节数组转换为字符串
*       String(byte[] bytes,int offset,int length)把字节数组的一部分转换为字符串 offset：数组的开始索引，length：转换的字节个数
*
*   */
public class Dome02InputStream {
    public static void main(String[] args) throws IOException {
        //创建FileInputStream对象，构造方法中绑定要读取的数据源。
        FileInputStream fis  = new FileInputStream("E:\\Desktop\\IDEAcode\\src\\Practice_01\\b.txt");
                //使用FileInputStream对象中的方法read读取文件
        //int read(byte[] b )从输入流中读取一定的字节，并将其存储在缓冲区数组b中
       /* byte[] bytes =new byte[2];
        int len = fis.read(bytes);
        System.out.println(len);
        //System.out.println(Arrays.toString(bytes));//[65,66]
        System.out.println(new String(bytes));//AB

        len =fis.read(bytes);
        System.out.println(len);//2
        System.out.println(new String(bytes));//CD
        len =fis.read(bytes);
        System.out.println(len);//1
        System.out.println(new String(bytes));//ED
        len =fis.read(bytes);
        System.out.println(len);//-1
        System.out.println(new String(bytes));//ED
        */
       /** 发现以上读取文件是一个重复的过程，所有可以使用循环优化
        * 不知道文件有都是字节，（即不知道循环多少次，使用while）
        * while循环结束条件，读取到-1的时候结束*/

        byte[] bytes =new byte[1024];//存储读取到多给字节
        int len = 0;//记录读取的有效字节个数
    while ((len = fis.read(bytes)) != -1) {
        //System.out.println(new String(bytes));//这样打印会出现很多空格，因为上面定义的是1024，
        System.out.println(new String(bytes,0,len));//这个打印不会出现空格从0开始到len结束
    }
        //释放资源
        fis.close();

    }
}
