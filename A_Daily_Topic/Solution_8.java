package A_Daily_Topic;

import java.util.Scanner;

public class Solution_8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int[] arr = new int[y];
        int i = 0;
        while (sc.hasNextInt()) {
            int x = sc.nextInt();
            arr[i] = x;
            i++;
        }
        System.out.println(p(arr));

    }
    public static int p(int[] arr) {
        int x = 0;

        for (int i = 0; i < arr.length; i++) {
            int m = arr[i];
            for (int j = 0; j < arr.length; j++) {
                m = m + arr[j];
                if (m == 40) {
                    x ++;
                    break;
                }  else if (m > 40) {
                    m = arr[i];
                }
            }
        }
        return  x;

    }
}
