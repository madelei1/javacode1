package A_Daily_Topic;

import java.util.Scanner;

public class Solution_4 {
    /**
     * 字符串中找出连续最长的数字串
     * https://www.nowcoder.com/practice/bd891093881d4ddf9e56e7cc8416562d?tpId=179&&tqId=34157&rp=1&ru=/activity/oj&qru=/ta/exam-other/question-ranking
     * @param args
     */
    public static void main(String[] args) {

        /*Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(p(s));*/
        String s = "abcd12345ed125ss123";
        System.out.println(p(s));
    }
    public static String p(String s) {
        if (s == null) {
            return null;
        }
        String m = "";
        char[] x = s.toCharArray();
        for (int i = 0; i < x.length; i++) {
            int a = x[i];
            if (a <= 57 && a >= 48) {
               m = m + x[i];
            }else if (i >= 1 && (int)x[i-1] <= 57 && (int)x[i-1] >= 48){
                m = m + " ";
            }
        }
        String[] b = m.split(" ");
        String max = null;
        int i = 0;
        if (b.length >= 0) {
            max = b[i];
            for (i = 0; i < b.length-1; i++) {
                if (max.length() < b[i+1].length()) {
                    max = b[i+1];
                }
            }

        } else {
            return null;
        }

        return max;
    }
}
