package MapAndSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test_Set {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        //添加元素，重复的元素不会添加成功--boolean类型
        set.add("hello");
        set.add("world");
        Boolean w = set.add("hello");
        System.out.println(w);//false
        System.out.println(set);//[world, hello]--hello,重复添加，不会成功
        System.out.println("-----------------");
        //判断元素是否在集合中--boolean
        boolean i =  set.contains("hello");
        System.out.println(i);//true
        boolean x =  set.contains("x");
        System.out.println(x);//false

        System.out.println("---------------------");
        /**
         * 迭代器
         * 迭代器是对集合进行遍历,而每一个集合内部的存储结构都是不同的,所以每一个集合存和取都是不一样,那么就需要在每一个类中定义 hasNext() 和 next() 方法,这样做是可以的,但是会让整个集合体系过于臃肿。
         * 迭代器是将这样的方法向上抽取出接口,然后在每个类的内部,定义自己迭代方式,这样做的好处有二：
         *
         * 第一:规定了整个集合体系的遍历方式都是hasNext()和next()方法
         *
         * 第二:代码有底层内部实现,使用者不用管怎么实现的,会用即可
         */
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        /**
         * 输出结果：
         * world
         * hello
         */
        System.out.println("---------------------");
        //删除集合中的元素--boolean类型
        boolean y = set.remove("hello");
        System.out.println(y);//true
        boolean z = set.remove("x");
        System.out.println(z);
        System.out.println(set);//[world]
        System.out.println("--------------------");
        //清空集合--没有返回值
        set.clear();
        System.out.println(set);//[]

    }
}
