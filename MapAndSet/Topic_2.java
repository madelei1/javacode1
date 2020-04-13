package MapAndSet;

import java.util.*;

public class Topic_2 {
    /**
     * list中由10万给数，去掉重复的数字
     * @param args
     * 思路： 使用contains比较，如果由这个元素就删除元值，没有就添加进去
     */
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        Random random = new Random();
        for (int i = 0; i < 10_0000; i++) {
            list.add(random.nextInt(6_0000));
        }
        for (int i = 0; i < list.size(); i++) {
            if (set.contains(list.get(i))) {
                set.remove(list.get(i));
            } else {
                set.add(list.get(i));
            }
        }
        System.out.println(set);
    }
}
