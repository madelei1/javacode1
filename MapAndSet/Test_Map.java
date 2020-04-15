package MapAndSet;

import java.util.HashMap;
import java.util.Map;

public class Test_Map {
    /**
     * 练习set和map的方法以及注意事项
     * @param args
     */
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        //put，设置 key 对应的 value
        map.put("小学生","小明");
        map.put("初中生","小黄");
        map.put("高中生","小绿");
        map.put("大学生","小红");
        /**
         * {初中生=小黄, 高中生=小绿, 大学生=小红, 小学生=小明}
         * 这个是输出结果，从结果中可以得出，输出是无序的。
         */
        System.out.println(map);//见上面

        //使用map.get(key),得到key的值并且输出对应的value值
        System.out.println(map.get("小学生"));//小明
        //如果查找不到返回null
        System.out.println(map.get("111"));//null
        System.out.println("---------------------");
        //打印所有的key
        for (String key: map.keySet()) {
            System.out.println(key);
        }
        System.out.println("-----------------------");
        //返回 key 对应的 value，key 不存在，返回默认值
        System.out.println(map.getOrDefault("幼儿园","大明"));//大明
        System.out.println(map.getOrDefault("高中生","大明"));//小绿
        //删除 key 对应的映射关系
        map.remove("大学生");
        System.out.println(map);//{初中生=小黄, 高中生=小绿, 小学生=小明}
        //返回所有key的不重复集合
        System.out.println(map.keySet());//[初中生, 高中生, 小学生]
        System.out.println(map.values());//[小黄, 小绿, 小明]
        //判断是否包含 key
        System.out.println(map.containsKey("x"));//false
        System.out.println(map.containsKey("小学生"));//true
        //判断是否包含value
        System.out.println(map.containsValue("小明"));//true
        System.out.println(map.containsValue("daMing"));//false

        //返回所有的 key-value映射关系
        System.out.println(map.entrySet());//[初中生=小黄, 高中生=小绿, 小学生=小明]
        System.out.println("-----------------");
        // 打印所有的 key
        for (String key : map.keySet()) {
            System.out.println(key);
        }
        /**
         * 输出结果：
         * 初中生
         * 高中生
         * 小学生
         */

        System.out.println("-----------------");
        // 打印所有的 value
        for (String value : map.values()) {
            System.out.println(value);
        }
        /**
         * 输出结果：
         * 小黄
         * 小绿
         * 小明
         */
        System.out.println("-----------------");
        // 按 key-value 映射关系打印
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
        /**
         * 输出结果：
         * 初中生 = 小黄
         * 高中生 = 小绿
         * 小学生 = 小明
         */

    }
}
