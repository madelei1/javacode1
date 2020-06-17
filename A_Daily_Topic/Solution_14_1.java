package A_Daily_Topic;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution_14_1 {

    /**
     * 2 2 0 0 0 3 0 0 1 0
     *
     * 10015558
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        //String s = "2 2 0 0 0 3 0 0 1 0";
        String x = "";
        String o = "";
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) != ' ') {
                x = x + s.charAt(i);
            }
        }
        Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) != '0') {
                String p = i+"";
                int c = x.charAt(i) - 48;
              map.put(p,c);
            }
        }

        int t = 0;
        for (t = 1; t <= 9; t++) {
            String p = t+"";
            if (map.containsKey(p)) {
                break;
            }
        }
        if(t == 0) {
            System.out.println(0);
            return;
        }
        if (map.containsKey("0")) {
            int a = map.get("0");
            o = o+t;
            for (int i = 0; i < a; i++) {
                o = o+'0';
            }
        }
        for (int i = t; i <= 9; i++) {
            String p = i+"";
            if (map.containsKey(p)) {
                if (i == t) {
                   int b = map.get(p);
                    for (int j = 0; j < b-1; j++) {
                        o = o + i;
                    }
                } else {
                    int a = map.get(p);
                    for (int j = 0; j < a; j++) {
                        o = o + i;
                    }
                }

            }
        }
        System.out.println(o);
    }
}
