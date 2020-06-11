package A_Daily_Topic;

import java.util.Scanner;

public class Solution_09_1 {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();*/
        int n = 20;
        int m = 0;
        long x = p(n);
        System.out.println(x);
        String s = ""+x;
        for (int i = s.length()-1; i >= 0; i--) {

            if (s.charAt(i) == '0') {
                m ++;
            }else {
                break;
            }
        }
        System.out.println(m);


    }

    public static long p(Integer n) {
        if (n == 1) {
            return 1;
        }
        return p(n-1)*n;
    }
}
