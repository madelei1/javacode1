package A_Daily_Topic;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution_11_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //题目要求一千位，直接以字符串接受。
        String n = sc.nextLine();
        p(n);
    }

    public static void p(String n) {

        String s = "" +n;
        char[] x = s.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < x.length; i++) {
            if (map.containsKey(x[i])) {
                map.put(x[i],map.get(x[i])+1);
            } else {
                map.put(x[i],1);
            }
        }

        for (char i:map.keySet()) {
            System.out.println(i+":"+map.get(i));
        }
    }
}
