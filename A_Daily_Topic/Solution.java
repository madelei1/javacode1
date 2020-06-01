package ADailyTopic;

import java.util.*;
public class Solution {
    /**
     *https://www.nowcoder.com/questionTerminal/9d1559511b3849deaa71b576fa7009dc?f=discussion
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        a = a.toLowerCase();
        b = b.toLowerCase();
        /*String a = "aa";
        String b = "a";*/
        System.out.println(h(a,b));

    }
    public static int h(String A, String B) {
        String z= "";
        int x = 0;
        String c = B + A;
        if (w(c)) {
            x ++;
        }
        String[] y = A.split("");
        for (int i = 0; i < y.length; i++) {
            z = "";
            for (int j = 0; j <= i; j++) {
                z += y[j];
            }
            String w = "";
            for (int j = i+1; j < y.length; j++) {
                w += y[j];
            }
            String t = z;
            t += B;
            t += w;

            if (w(t)) {
                x ++;
            }
        }
        return x;
    }
    public static boolean w(String a) {
        int left = 0;
        int right = a.length()-1;
        while (right >= left) {
            if (a.charAt(left) != a.charAt(right)) {
                return false;
            }
            left ++;
            right --;
        }
        return true;
    }
}
