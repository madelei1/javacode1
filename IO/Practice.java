package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
* 文件复制练习：一读一写
*
* 明确：
*       数据源：D:\\1.png
*       数据的目的地：E:\\1.png
*
*       文件复制的步骤：
*           1、创建一个字节输入流对象，构造方法中绑定要读取的数据源
*           2、创建一个字节输出流对象，构造方法中绑定要写人打目的地
*           3、使用字节输入流对象中的方法read读取文件
*           4、使用字节输出流中的方法write，把读取到的字节写到目的地文件中
*           5、释放资源
*           */
public class Practice {
    public static void main(String[] args) throws IOException {
        long s = System.currentTimeMillis();
        //创建一个字节输入流对象，构造方法中绑定要读取的数据源
        FileInputStream fis = new FileInputStream("D:\\1.png");
        //2、创建一个字节输出流对象，构造方法中绑定要写人打目的地
        FileOutputStream fos = new FileOutputStream("G:\\1.png");
        // 3、使用字节输入流对象中的方法read读取文件
       /* int len = 0;
        while ((len = fis.read()) != -1) {
            //4、使用字节输出流中的方法write，把读取到的字节写到目的地文件中
            fos.write(len);
        }
        // 5、释放资源
        fis.close();
        fos.close();
        long e = System.currentTimeMillis();
        System.out.println("复制文件耗时："+(e-s)+"毫秒");//复制文件耗时：361毫秒
        //从D盘复制到G盘成功
*/
       //上述方法为一个一个读取，耗时间长，采用数组缓存，多给字节一起复制
        // 3、使用字节输入流对象中的方法read读取文件
        byte[] bytes = new byte[10240];
        int len = 0;
    while ((len = fis.read(bytes))!= -1) {
        //4、使用字节输出流中的方法write，把读取到的字节写到目的地文件中
        fos.write(bytes,0,len);
    }
        // 5、释放资源
        fis.close();
        fos.close();
        long e = System.currentTimeMillis();
        System.out.println("复制文件耗时："+(e-s)+"毫秒");

    }
}
