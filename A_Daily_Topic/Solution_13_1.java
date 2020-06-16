package A_Daily_Topic;

import java.util.Scanner;

public class Solution_13_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String c = sc.next();

        for (int i = 0; i < x; i++) {
            System.out.print(c);
        }
        System.out.println();
        int o = 0;
        if (x % 2 != 0) {
            o = (x >> 1)+1;
        } else {
            o = x >> 1;
        }



        for (int i = 0; i < o-2; i++) {
            for (int j = 0; j < x; j++) {
                if (j == 0 || j == (x-1)) {
                    System.out.print(c);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 0; i < x; i++) {
            System.out.print(c);
        }
    }
}
