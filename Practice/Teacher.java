package Practice_list;


import java.util.ArrayList;
import java.util.List;

public class Teacher {
    public static void main(String[] args) {
        List<A<String>> list = new ArrayList<>(5);
        list.add(new A<>("张三"));
        list.add(new A<>("李四"));
        list.add(new A<>("王五"));
        System.out.println(list.isEmpty());
        list.add(1,new A<>("赵六"));
        list.get(2);
        System.out.println(list);
        list.clear();
        System.out.println(list.isEmpty());


    }

}
