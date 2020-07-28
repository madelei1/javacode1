package Review_002;

import java.util.*;

public class Map_Set {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"hello");
        map.put(2,"Java");
        map.put(3,"Bit");
        //重复出现，观察结果
        map.put(1,"Hello");
        System.out.println(map.entrySet());//[1=Hello, 2=Java, 3=Bit]
        System.out.println(map.keySet());//[1, 2, 3]
        System.out.println(map.get(1));//Hello
        //查询k对应的值，如果没有就返回默认值
        System.out.println(map.getOrDefault(4,"没有该值"));
        map.put(4,"Love");
        System.out.println(map.entrySet());//[1=Hello, 2=Java, 3=Bit, 4=Love]
        map.remove(4);
        //输出key-value对应的映射关系
        System.out.println(map.entrySet());//[1=Hello, 2=Java, 3=Bit]
        System.out.println(map.containsKey(4));//false
        System.out.println(map.containsValue("Bit"));//true
        System.out.println(map);//{1=Hello, 2=Java, 3=Bit}
        for (Map.Entry<Integer,String> entry: map.entrySet()) {
            System.out.println(entry.getKey()+"="+entry.getValue());
              /*1=Hello
                2=Java
                3=Bit*/
        }
        for (int i = 0; i < map.size(); i++) {

        }
        System.out.println("------------------");
        Set<String> set = new HashSet();
        set.add("Hello");
        set.add("Bit");
        set.add("Hello");
        set.add("java");
        System.out.println(set);//[java, Hello, Bit]
        System.out.println(set.contains("java"));//true
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
            /*java
              Hello
              Bit*/
        }

    }

}
