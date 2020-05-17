package Review_mapAndset;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution_771 {
    public static int numJewelsInStones(String J, String S) {
        Map<Character,Integer> map = new HashMap<>();
        char[] x = J.toCharArray();
        char[] y = S.toCharArray();
        for (int i = 0; i < y.length; i++) {
            if (!map.containsKey(y[i])) {
                map.put(y[i],1);
            } else {
                map.put(y[i],map.get(y[i])+1);
            }
        }
        int num = 0;
        for (int j = 0; j < x.length; j++) {
            if (map.containsKey(x[j])) {
                num = map.get(x[j]) + num;
            }
        }
        return num;
    }
    public static int numJewelsInStones1(String J, String S) {
        Set<Character> set = new HashSet<>();
        int num = 0;
        for (int i = 0; i < J.length(); i++) {
            set.add(J.charAt(i));
        }
        for (int j = 0; j < S.length(); j++) {
            if (set.contains(S.charAt(j))) {
                num ++;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        String J = "abc";
        String S = "qawbecra";
        System.out.println(numJewelsInStones1(J, S));
    }
}
