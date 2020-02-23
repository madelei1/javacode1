package IO;

import java.io.FileWriter;
import java.io.IOException;

/*
* 在jdk1.7之前使用 try catch finally 处理流中的异常
* 格式：
*       try {
*       可能出现的异常代码
*       } catch(异常类变量 变量名) {
*        异常处理逻辑
*        } finally {
*        一定会指定的代码
*        资源是释放
*        }*/
public class Demo01TryCatch {
    public static void main(String[] args) {
        //提高变量 fw的作用域，让finally可以使用。
        //变量在第一的时候可以不赋值，在使用的时候一定要赋值。
        //fw = new FileWriter("D:\\f.txt",true);执行失败，fw没有值，fw.close会报错。
        FileWriter fw =null;
       try {
           //可能会产生异常代码
           fw = new FileWriter("D:\\f.txt",true);
           for (int i = 0;  i < 10; i++) {
               fw.write("HelloWorld"+i+"\r\n");
           }
           fw.close();
       }catch (IOException e) {
           //异常的处理逻辑
           System.out.println(e);

       } finally {
           //一定会执行的代码
           //创建对象失败，fw的默认值是null，null是不能调用方法的就会抛出NullPointerException，需要追加一个判断，表示null在把资源释放
           if (fw != null) {
               try {
                   //fw.close方法声明抛出IOException异常对象，所以我们就要区处理这个异常对象，那么要么throws要么try catch
                   fw.close();
               } catch (IOException g) {
                   g.printStackTrace();
               }
           }

       }
    }
}
