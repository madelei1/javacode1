package MapAndSet;

import java.util.*;

public class Topic_1 {
    /**
     * 题目：list当中存放10万个数据，找出第一个存放重复的数据
     *
     * @param args
     * 思路：将数据放入set中,放一次（add方法放入）就判断一次（contains方法判断）
     *
     */

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        Random random = new Random();
        //将随机生成的数据放入list中
        /**
         * random用法
         * Random rand = new Random()；有三个重载方法
         * int value=rand.Next(35);返回小于35的非负随机数。
         * rand.next()返回非负随机数
         * rand.next(minvalue,maxvalue)返回两者之间的随机数
         */
        for (int i = 0; i < 10_0000; i++) {
            list.add(random.nextInt(6_0000));
        }
        for (int i = 0; i < list.size(); i++) {
            if (set.contains(list.get(i))) {
                System.out.println(list.get(i));
                break;
            }
            set.add(list.get(i));
        }
    }
}
