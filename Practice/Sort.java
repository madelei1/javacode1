package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Sort {
    public static void main1(String[] args) {
        List<Character> s = new ArrayList<>();
        String str = "welcome to bit";
        String str1 = "come";
        char[] a = str.toCharArray();
        char[] b = str1.toCharArray();
        for (int i = 0; i < a.length; i++) {
            int j = 0;
            while (a[i] != b[j]) {
                j ++;
                if (j == b.length) {
                    s.add(a[i]);
                    break;
                }
            }
        }
        System.out.println(s);

    }
    public static void main(String[] args) {
        List<Integer> s = new ArrayList<>(4);
        s.add(10);
        s.add(5);
        s.add(8);
        s.add(15);
        System.out.println(s);
        Collections.sort(s);
        System.out.println(s);
    }

}
