package IO;

import java.io.FileWriter;
import java.io.IOException;

/*
*flush 与close的区别
 *  -flush：刷新缓冲区，流对象可以继续使用。
  *  -close：先刷新缓冲区，然后通知系统释放资源。流对象不能使用
  *  */
public class Demo01CloseAndFlush {
    public static void main(String[] args) throws IOException {
        //1、会创建一个FileWriter对象，
        FileWriter fw = new FileWriter("D:\\d.txt");
        //2使用FileWriter中的方法Write，把数据写入到内存缓冲区中（字符转换为字节的过程）
        // void write(int c) ：写入单个字符。
        fw.write(97);
        //3、使用FileWriter中的方法flush，把内存缓冲区中的数据，刷新到文件中。
        fw.flush();
        //刷新之可以继续使用,下面这些会继续显示
        fw.write("\r\n");
        fw.write(98);
        fw.flush();
        // 4、释放资源（会先把内存中缓冲区中的数据刷新到文件中）
        fw.close();
        //close方法之后流已经关闭，已经从内存中消失，流就不能在使用。
        fw.write(99);//报出的异常：java.io.IOException: Stream closed
    }
}
