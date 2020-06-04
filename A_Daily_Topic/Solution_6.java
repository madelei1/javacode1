package A_Daily_Topic;

import java.util.Scanner;

public class Solution_6 {
    public static void main(String[] args) {

        /*Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();*/

        System.out.println(p(20));

    }
    public static int p(int n) {

        int x = -1;
        if (n == 6 || n == 8) {
            return 1;
        }
        if (n < 8 || n == 10 || n % 2 != 0) {
            return x;
        }
        if (n % 8 == 0) {
            return n/8;
        }
        if (n % 8 == 6) {
            return (n/8) +1;
        }
        if (n % 8 < 6 && n % 8 == 4) {
            return (n / 8)+1;
        }
        if (n % 8 < 6 && n % 8 == 4) {
            return (n / 6);
        }

        return x;
    }
}
