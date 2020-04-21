package Collection_0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Topic_2 {
    /**
     * 有一个List当中存放的是整型数据，要求使用Collection.sort进行排序。
     * @param args
     */
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(4);
        list.add(6);
        list.add(9);
        list.add(2);
        for (Integer i:list) {
            System.out.print(i+" ");
        }
        System.out.println();
        Collections.sort(list);//底层是自增排序的
        System.out.println(list);//[2, 4, 6, 9, 12]
    }
}
