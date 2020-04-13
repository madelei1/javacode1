package MapAndSet;

import java.util.*;

public class Topic_3 {
    /**
     * list中有十万个数字，统计重复的数字并且打印个数
     * @param args
     */
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap();
        Random random = new Random();
        for(int i = 0; i < 10_0000; i ++) {
            list.add(random.nextInt(6_0000));
        }
        for (int i = 0; i < list.size(); i++) {
            if (map.get(list.get(i)) == null) {
                map.put(list.get(i),1);
            } else {
                //通过map.get(list.get(i))得到存在的value值，然后加1
                map.put(list.get(i),map.get(list.get(i))+1);
            }
        }
        for (Map.Entry<Integer,Integer> entry: map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("重复的数字"+ entry.getKey() +" 重复的次数"+entry.getValue());
            }
        }
        /*for (int i = 0; i < map.entrySet().size(); i++) {
            Map.Entry<Integer,Integer> entry = new Map.Entry<Integer,Integer>();

        }*/
    }
}
