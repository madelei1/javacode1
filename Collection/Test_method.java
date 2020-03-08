package Collection;
import java.util.Arrays;
import java.util.Collection;

import java.util.ArrayList;
import java.util.Map;

public class Test_method {

    public static void main(String[] args) {
        Collection<String> sc = new ArrayList<>();
        //返回集合中的元素个数
        System.out.println(sc.size());//0
        sc.add("I");
        sc.add("Love");
        sc.add("you");
        sc.add("I");
        sc.add("Love");
        sc.add("you");
        System.out.println(sc.size());//6
        //判断集合是否为空
        System.out.println(sc.isEmpty());//false
        //删除集合中的一个元素
        System.out.println(sc.remove("I"));//true [Love, you, I, Love, you]

        //返回一个装有所有集合的元素数组
        Object[] arr = sc.toArray();
        System.out.println(Arrays.toString(arr));
        for (String s: sc) {
            System.out.println(s);
        }/*
        Love
        you
        I
        Love
        you
        */
        sc.clear();
        System.out.println(sc.size());//0
        System.out.println(sc.isEmpty());//true
        System.out.println(sc.remove("I"));//false  --这个会打印是否存在，如果存在然后在进行删除





    }
}
