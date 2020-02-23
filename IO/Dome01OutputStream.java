package IO;

import java.io.FileOutputStream;
import java.io.IOException;

public class Dome01OutputStream {
    public static void main(String[] args) throws IOException {
        //1、创建一个FileOutputStream对象，构造方法中传递写入数据的目的地
        FileOutputStream fos = new FileOutputStream("E:\\Desktop\\IDEAcode\\src\\Practice_01\\a.txt");
        //2、调用FileOutStream对象中的方法write，把数据写入到文件中
        fos.write(97);
        //3、释放资源（流占用一定的内存，使用完毕要把内存清空，提供程序的效率）
        fos.close();

    }
}
