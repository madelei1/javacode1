package String;

public class Practice_0 {
    public static void main(String[] args) {
        //将字符串按照空格全部拆分
        String str = "hello world I love you";
        String[] res = str.split(" ");
        /*for (String s:res) {
            System.out.println(s);
        }*/
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
            /*  hello
                world
                I
                love
                you
                */
        }

        System.out.println("---------------");

        //将字符串部分拆分，该数组的长度就是limit
        String[] res_1 = str.split(" ",2);
        for (String s: res_1) {
            System.out.println(s);
            /*hello
              world I love you
              */
        }
        System.out.println("---------------");
        //拆分IP地址
        /*注意事项: 1. 字符"|","*","+"都得加上转义字符，前面加上"\". 2. 而如果是""，那么就得写成"\\". 3. 如果一个字符串中有多个分隔符，可以用"|"作为连字符.
         */
        String str1 = "196.128.12.15";
        String[] rest = str1.split("\\.");
        for (String s:rest) {
            System.out.println(s);
        }
        /*  196
            128
            12
            15*/

        System.out.println("---------------");
        //多次拆分
        String str2 = "name = zhangSan & age = 18";
        String[] i = str2.split("&");
        for (int j = 0; j < i.length; j++) {
            String[] y = i[j].split("=");
            System.out.print(y[0]+" "+y[1]);
        }
        System.out.println();
        System.out.println("------------------");
        //从指定位置开始截取
        String str3 = "helloWorld";
        System.out.println(str3.substring(5));//World

        //截取指定的部分内容
        System.out.println(str3.substring(5,8));//Wor

        //删除字符串左右的空格，保留中间空格
        String str4 ="  asdf ghjk  lop  ";
        System.out.println("["+str4.trim()+"]");//[asdf ghjk  lop]

        //字符串转大写--这两个函数只转换字母。
        String str5 = "abcdefg";
        System.out.println(str5.toUpperCase());//ABCDEFG

        //字符串转小写--这两个函数只转换字母.符号和数字不能转换
        String str6 = "ABCDEFGH";
        System.out.println(str6.toLowerCase());//abcdefgh

        //字符串连接，等同于"+"，不入池
        System.out.println(str5.concat("ABC"));//abcdefgABC

        //取得字符串的长度

        System.out.println(str6.length());//8

        //判断字符串是否为空，但不是null，而是长度为0
        String str7 = null;
        String str8 = "";
        System.out.println(str6.isEmpty());//false
        //System.out.println(str7.isEmpty());//NullPointerException会出现异常，这句话还要单独执行
        System.out.println(str8.isEmpty());//true


        System.out.println(firstUpper("hello"));//Hello






    }
        //String类并没有提供首字母大写操作，需要自己实现
        //首字母大写

    public static String firstUpper(String str) {
        String[] i = str.split("",2);
        String y = i[0].toUpperCase();
        str = y.concat(i[1]);
        return str;
    }
}
