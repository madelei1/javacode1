package IO;

import java.io.FileWriter;
import java.io.IOException;

/*
* void write(char[] cbuf) ：写入字符数组
 *  abstract  void write(char[] cbuf, int off, int len)：写入字符数组的某一部分，off数组的开始索引，len写的字符个数。
 *  void write(String str):写入字符串
 *  void write(String str,int off,int len):写入字符串的某有部分，off字符串的开始索引，len写的字符个数。
 *  */
public class Demo02Writer {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("D:\\e.txt");
        char[] cs = {'a','b','c','d','e'};
        //void writer(char[] cbuf)写入字符数组。
        fw.write(cs);//abcde
        //void write(String str,int off,int len):写入字符串的某有部分，off字符串的开始索引，len写的字符个数。
        fw.write(cs,1,3);//bcd
        //void write(String str):写入字符串
        fw.write("abc");
        // void write(String str,int off,int len):写入字符串的某有部分，off字符串的开始索引，len写的字符个数。
        fw.write("比特科技程序员",4,3);

        //释放资源
        fw.close();
    }
}
