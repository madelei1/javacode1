package Review_002.Map_Set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution_a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String w = sc.nextLine();
        String ret = "";
        s = s.toUpperCase();
        w = w.toUpperCase();
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < w.length(); i++) {
            set.add(w.charAt(i));
        }
        for (int i = 0; i < s.length(); i++) {
            boolean t = true;
            if (!set.contains(s.charAt(i))) {
                for (int j = 0; j < ret.length(); j++) {
                    if (ret.charAt(j) == s.charAt(i)) {
                        t = false;
                    }
                }
                if (t) {
                    ret = ret + s.charAt(i);
                }
            }
        }
        //ret = ret.toUpperCase();
        System.out.println(ret);
    }
}
