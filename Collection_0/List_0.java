package Collection_0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class List_0 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<String> list1 = new LinkedList<>();
        List<Integer> list3 = new ArrayList<>();
        list.add(12);
        list.add(6);
        //添加到指定位置
        list.add(0,10);
        list2.add(1);
        list2.add(2);
        list.addAll(list2);
        list3.add(1);
        list3.add(3);
        list3.add(1);
        System.out.println(list3);//[1, 3, 1]
        //list.addAll(0,list2);//[1, 2, 10, 12, 6]
        System.out.println(list);//[1, 3, 1]
        list1.add("hello");
        list1.add("world");
        //删除指定位置的元素
        list1.remove(0);
        System.out.println(list1);//[world]
        list1.add("hello");
        list1.add("world");
        list1.add("hello");
        System.out.println(list1);//[world, hello, world, hello]
        //list2.remove(list3);
        System.out.println(list2);//[1, 2]
        //删除第一个遇到的O--返回值为boolean
        list1.remove("hello");
        System.out.println(list1);//[world, world, hello]
        //得到指定索引位置的元素值
        System.out.println(list1.get(0));//world
        //将指定索引位置的元素，替换为指定的值
        list1.set(0,"hhh");
        System.out.println(list1);//[hhh, world, hello]
        list1.add("world");
        list2.clear();
        System.out.println(list.contains(1));//true
        //返回第一个 o 所在下标
        System.out.println(list1.indexOf("world"));//1
        //返回最后一个 o 所在下标
        System.out.println(list1.lastIndexOf("world"));//3
        System.out.println(list1);//[hhh, world, hello, world]
        //subList，的返回值是List类型，并且是前闭后开
        List<String> s = list1.subList(1,3);//不包括3
        System.out.println(s);//[world, hello]
        List<String> s1 = list1.subList(1,4);
        System.out.println(s1);//[world, hello, world]



    }


}
