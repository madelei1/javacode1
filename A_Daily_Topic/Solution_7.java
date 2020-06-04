package A_Daily_Topic;

import java.util.ArrayList;
        import java.util.List;
        import java.util.Scanner;

public class Solution_7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String c = sc.nextLine();
        System.out.println(p(s,c));
    }
    public static String p(String a, String b) {
        char[] x = b.toCharArray();
        char[] y = a.toCharArray();
        String s = "";
        List<String> list = new ArrayList<>();
        for (int i = 0; i < y.length; i++) {
            String s1 = ""+y[i];
            list.add(s1);
        }
        for (int i = 0; i < x.length; i++) {
            String s1 = ""+x[i];
            while (list.contains(s1)) {
                list.remove(s1);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            s = s + list.get(i);
        }
        return s;

    }
}
