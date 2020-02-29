package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import static jdk.nashorn.internal.objects.NativeString.indexOf;

public class Split_0 {
    public static void main(String[] args) {
        String str = "hello 2020";
        //String[] res = str.split("");
        System.out.println(Arrays.toString(sp(str," ")));
        //System.out.println(Arrays.toString(res));
        //String[] res1 = str.split(" ");
        //System.out.println(Arrays.toString(res1));
        String[] res2 = str.split("",6);
       // System.out.println(Arrays.toString(res2));
    }

        // 能够指定分割符s2将字符串s1拆分成字符串数组(不必支持正则表达式)
        public static String[] sp(String s1, String s2) {
        //创建一个线性表list，用来保存分割后的字符串
            List list = new ArrayList();
        //如果字符串中有分隔符进行循环中的操作
            while(s1.contains(s2)){
                //找到开始分割的位置
                int index = indexOf(s1, s2);
                //将分割符前边的字符串保存下来
                String temp = s1.substring(0, index);
                //添加到list中
                 list.add(temp);
                //将分割后分隔符前边的字符串去掉，更新要分割的字符串
                s1 = s1.substring((temp + s2).length());
            }
                //因为循环结束的条件是字符串中没有了分割符，
                // 所以最后一次循环结束最后一次分割剩下的字符串还没有放到list中
                //将其尾插到list中

            list.add(s1);
            //将list中的字符串提取到str[]数组中
            String[] str = new String[list.size()];
            for(int i = 0; i < list.size(); i++){
                str[i] = String.valueOf(list.get(i));
            }
            return str;
        }

}

