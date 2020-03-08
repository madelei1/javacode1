package Collection;

import java.util.HashMap;
import java.util.Map;

public class Test_Map {
    public static void main(String[] args) {
            Map<String,String> map = new HashMap<>();
            //返回键值对的数量
            System.out.println(map.size());//0
            //判断是否为空
            System.out.println(map.isEmpty());//true
            //根据指定的k，查找value
            System.out.println(map.get("作者"));//null
            System.out.println(map.getOrDefault("作者","无名"));//无名
            //判断是否包含 key
            System.out.println(map.containsKey("作者"));//false
            //判断是否包含 value
            System.out.println(map.containsValue("无名"));//false
            //将指定的 k-v 放入 Map
            map.put("作者","鲁迅");
            map.put("标题", "狂人日记");
            map.put("发表时间", "1918年");
            System.out.println(map.size());//3
            System.out.println(map.isEmpty());//false
            //根据指定的 k 查找对应的 v
            System.out.println(map.get("作者"));//鲁迅
            //根据指定的 k 查找对应的 v，没有找到用默认值代替
            System.out.println(map.getOrDefault("作者", "无名"));//鲁迅
            System.out.println(map.containsKey("作者"));//true
            System.out.println(map.containsValue("无名"));//false
            //Set<Map.Entry<K, V>> entrySet() 将所有键值对返回
            for (Map.Entry<String, String> entry : map.entrySet()) {
                System.out.println(entry.getKey());
                System.out.println(entry.getValue());
            }
            /*作者 鲁迅   发表时间 1918年 标题 狂人日记 */



    }
}
