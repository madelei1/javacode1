package Practice_list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List_o {
    public static void main(String[] args) {
        List<String> courses = new ArrayList<>();
        courses.add("面向对象编程");
        courses.add("数据库");
        courses.add("数据结构");
        //和数组一样允许添加重复的元素，
        courses.add("数据库");
        //按照添加顺序打印
        System.out.println(courses);//[面向对象编程, 数据库, 数据结构, 数据库]
        //类似数组下标的访问方式--获得0号下标元素
        System.out.println(courses.get(0));//面向对象编程
        //修改元素值
        courses.set(0,"计算机基础");
        System.out.println(courses);//[计算机基础, 数据库, 数据结构, 数据库]

        //截取部分[1,3)
        List<String> subCourses =courses.subList(1,3);
        System.out.println(subCourses);//[数据库, 数据结构]--取不到3
        //重新构造
        List<String> courses2 =new ArrayList<>(courses);
        System.out.println(courses2);//[计算机基础, 数据库, 数据结构, 数据库]

        List<String> courses3 =new ArrayList<>(courses);
        System.out.println(courses3);//[计算机基础, 数据库, 数据结构, 数据库]
        //引用转换
        ArrayList<String> courses4 = (ArrayList<String>)courses2;
        System.out.println(courses4);//[计算机基础, 数据库, 数据结构, 数据库]
        // LinkedList<String> c = (LinkedList<String>)course2; 错误的类型
        //LinkedList<String> courses5 = (LinkedList<String>)courses3;

        //System.out.println(courses5);
        // ArrayList<String> c = (ArrayList<String>)course3; 错误的类型




    }

}
