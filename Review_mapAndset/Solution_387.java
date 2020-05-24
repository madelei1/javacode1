package Review_mapAndset;

import java.util.HashMap;
import java.util.Map;

public class Solution_387 {
    /**
     * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
     * @param s
     * @return
     */
    public static int firstUniqChar(String s) {
        int x = -1;
        if (s == null || s == "") {
            return -1;
        }
        char[] a = s.toCharArray();
        Map<Character,Integer> map = new HashMap<>();


        for (int i = 0; i < a.length; i++) {
            if (!map.containsKey(a[i])) {
                map.put(a[i],1);
            } else {
                map.put(a[i],map.get(a[i])+1);
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (map.get(a[i]) == 1) {
                x = i;
                break;
            }

        }
        return x;
    }

    public static void main(String[] args) {
        String a = "abacdeff";
        System.out.println(firstUniqChar(a));
    }
}
