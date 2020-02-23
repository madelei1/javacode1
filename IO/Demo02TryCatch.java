package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
* jdk 7的新特性
*在try的后边可以增加一个（），在框号中就可以定义流对象
 * 那么这个流对象的作用域就在这个try中有效
 * try中的代码执行完毕，会自动把流对象释放，不用写finally
 * 格式：
 *  try(定义流对象，定义流对象...){
 *      可能产生的异常代码
 *      }catch(异常类变量 变量名) {
 *      异常的处理逻辑
 *      }
  * */
public class Demo02TryCatch {
    public static void main(String[] args) {
        try(//创建一个字节输入流对象，构造方法中绑定要读取的数据源
            FileInputStream fis = new FileInputStream("D:\\1.png");
            //2、创建一个字节输出流对象，构造方法中绑定要写人打目的地
            FileOutputStream fos = new FileOutputStream("G:\\1.png");) {
            byte[] bytes = new byte[10240];
            int len = 0;
            while ((len = fis.read(bytes))!= -1) {
                //4、使用字节输出流中的方法write，把读取到的字节写到目的地文件中
                fos.write(bytes,0,len);
            }

        }catch (IOException e) {
        //异常处理
            System.out.println(e);
        }
    }
}
