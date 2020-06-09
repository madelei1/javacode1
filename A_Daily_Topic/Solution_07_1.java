package A_Daily_Topic;

import java.util.Scanner;

public class Solution_07_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(p(x,y));
    }
    public static int p(int w,int h) {
        int m = 0;
        for (int i = 0; i < h; i++) {
            int x = 0;
            for (int j = x; j < w; j++) {
                if (Math.sqrt((i-i)*(i-i) +(x-j)*(x-j)) != 2.0) {
                    if (i - 1 >= 0 && Math.sqrt((i-1)*(i-1) +j*j) != 2.0) {
                        m ++;
                    }

                }
            }

        }
        return m;

    }
}
