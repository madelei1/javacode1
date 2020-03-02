package String;

public class Practice {
    public static void main(String[] args) {
        String str = "abcdefg";
        //将字符串变为字符数组
        char[] i = str.toCharArray();
        for (int j = 0; j < i.length; j++) {
            System.out.print(i[j]+" ");//a b c d e f g
        }
        System.out.println();
        System.out.println("----------------");

        //取得指定索引位置的字符，索引从0开始
        String str2 = "asdfghg";
        System.out.println(str2.charAt(0));//a
        System.out.println("----------------");

        //将字符数组中的内容变为字符串
        String str3 = new String(i);
        System.out.println(str3);//abcdefg
        System.out.println("----------------");

        //将部分字符数组变为字符串
        System.out.println(new String(i,0,3));//abc
        for (int j = 0; j < i.length; j++) {
            System.out.print(i[j] + " ");//a b c d e f g
        }
        System.out.println();
        System.out.println("----------------");

        //将字符串以字节数组的形式返回
        String str4 = "helloWorld";
        byte[] x = str4.getBytes();
        for (int j = 0; j < x.length; j++) {
            System.out.print(x[j]+" ");//104 101 108 108 111 87 111 114 108 100
        }
        System.out.println();
        System.out.println("----------------");

        //将字节数组转换为字符串
        System.out.println(new String(x));//helloWorld
        //将部分字节数组转换为字符串
        System.out.println(new String(x,0,5));//hello

        System.out.println("----------------");

        //不区分大小写的比较
        String str5 = "hello";
        String str6 = "Hello";
        System.out.println(str5.equalsIgnoreCase(str6));//true

        //区分大小写比较
        System.out.println(str5.equals(str6));//false

        System.out.println("----------------");

        //比较二个字符串大小关系
        //在String类中compareTo()方法是一个非常重要的方法，该方法返回一个整型，该数据会根据大小关系返回三类内 容：
        //1. 相等：返回0. 2. 小于：返回内容小于0. 3. 大于：返回内容大于0
        System.out.println("A".compareTo("a"));//-32
        System.out.println("a".compareTo("A"));//32
        System.out.println("A".compareTo("A"));//0
        System.out.println("AB".compareTo("AC"));//-1
        System.out.println("刘".compareTo("杨"));//-5456

        System.out.println("----------------");

        //判断一个字串是否存在
        String str7 = "helloworld";
        System.out.println(str7.contains("world"));//true

        //从头开始查找指定字符串的位置，查到了返回位置的开始索引，如果查不到返回-1
        System.out.println(str7.indexOf("world"));//5

        //从指定位置开始查找子字符串的位置,查到了返回位置的开始索引，如果查不到返回-1
        System.out.println(str7.indexOf("world",4));//5
        System.out.println(str7.indexOf("world",7));//-1

        //从后向前查找子字符串的位置,查到了返回位置的开始索引，如果查不到返回-1
        System.out.println(str7.lastIndexOf("hello"));//0

        //从指定位置由后查找子字符串的位置，查到了返回位置的开始索引，如果查不到返回-1
        System.out.println(str7.lastIndexOf("hello",3));//0

        //判断是否以指定字符串开头，
        System.out.println(str7.startsWith("he"));//true

        //从指定位置开始，判断是否以指定字符串开头，
        System.out.println(str7.startsWith("wor",3));//false

        //判断是否以指定字符串结尾
        System.out.println(str7.endsWith("world"));//true

        System.out.println("----------------");

        //替换所有指定内容
        String str8 = "hellobit";
        System.out.println(str8.replaceAll("bit","BIT"));//helloBIT
        System.out.println(str8.replace("b","B"));//helloBit

        //替换首个内容
        System.out.println(str8.replaceFirst("l","L"));//heLlobit
        String str8_1 = "aaaaaaaaa";
        System.out.println(str8_1.replaceFirst("a","A"));//Aaaaaaaaa














    }
}
