package A_Daily_Topic;

import java.util.Scanner;

public class Solution_08_1 {
    public static void main(String[] args) {

        //Scanner sc = new Scanner(System.in);
        int x = 8;
        if (x >= 1000) {
            x = 999;
        }
        int[] arr = new int[x];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        int[] y = p(arr);
        while (y.length != 1) {

            y = p(y);
        }
        System.out.println(y[0]);

    }
    public static int[] p(int[] arr) {
        int x = 0;
        int b = 0;
        int c = arr.length /3;//c < 3 考虑情况 并且没有继续数，而是从头开始了.
        int[] a = new int[arr.length-c];
        for (int i = 0; i < arr.length; i++) {
            x ++;
            if (x != 3) {
                a[b] = arr[i];
                b ++;
            } else {
                x = 0;
            }

        }
        return a;
    }
}
