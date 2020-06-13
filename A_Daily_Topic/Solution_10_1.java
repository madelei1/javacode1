package A_Daily_Topic;

import java.util.Scanner;

public class Solution_10_1 {
    /*public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int i = 0;
        int j = x;
        if (p1(x)) {
            System.out.println(0);
            return;
        }
        while (!p1(x+i)) {
            i ++;
        }
        while (x >= 0 && !p1(x)) {
            x --;
            j ++;
        }
        if (i > j) {
            System.out.println(j);
        } else {
            System.out.println(i);
        }


    }

    public static boolean p1(int x) {
        for (int i = 0; i < p(100_000); i++) {
            if (x == p(i)) {
                return true;
            }
        }
        return false;
    }*/
    public static void main(String[] args) {
        System.out.println(p(10000));
    }
    public static int p(int x) {

        if (x  == 0) {
            return 0;
        }
        if (x == 1) {
            return 1;
        }
        if (x > 1) {
            return p(x -1)+p(x-2);
        }
        return -1;

    }
}
