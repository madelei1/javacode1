package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
* jdk9新特性
* try的前边可以定义流对象
* 在try后边的（）中直接引入流对象的名称（变量名）
* 在try代码执行完毕之后，流对象也可以释放掉，不用写finally
* 格式：
* A a = new A();
* B b = ne B();
* try(a,b) {
*  可能产生的异常代码
 *      }catch(异常类变量 变量名) {
 *      异常的处理逻辑
 *      }
 * */
public class Demo03JDK9 {
    public static void main(String[] args) throws FileNotFoundException {
        /*//创建一个字节输入流对象，构造方法中绑定要读取的数据源
        FileInputStream fis = new FileInputStream("D:\\1.png");
        //2、创建一个字节输出流对象，构造方法中绑定要写人打目的地
        FileOutputStream fos = new FileOutputStream("G:\\1.png");
        try(fis;fos) {
            byte[] bytes = new byte[10240];
            int len = 0;
            while ((len = fis.read(bytes))!= -1) {
                //4、使用字节输出流中的方法write，把读取到的字节写到目的地文件中
                fos.write(bytes,0,len);
        }
    } catch (IOException e) {
            System.out.println(e);
        }*/
    }
}
