package A_Daily_Topic;

import java.util.Scanner;

public class Solution_09_2 {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();*/
        int x = 1516000;
        String s = ""+x;
        char[] a = s.toCharArray();
        for(int i = a.length-1; i >= 0; i--) {

            System.out.print(a[i]);
        }

    }


}
