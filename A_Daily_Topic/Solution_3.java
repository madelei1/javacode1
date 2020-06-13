package A_Daily_Topic;

import java.util.Scanner;

public class Solution_3 {
    /**
     * 汽水瓶
     * https://www.nowcoder.com/practice/fe298c55694f4ed39e256170ff2c205f?tpId=37&&tqId=21245&rp=1&ru=/activity/oj&qru=/ta/huawei/question-ranking
     */
    static int m = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = 0;
        int[] arr = new int[100];
        int i = 0;
        while (sc.hasNextInt()) {
            x = sc.nextInt();
            if (x == 0) {
                break;
            }
            arr[i] = x;
            i ++;
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != 0) {
                m = 0;
                int w = p(arr[j]);
                System.out.println(w);
            }

        }
        /*System.out.println(p(10));*/


    }

    public static int p(int n) {
        int x = n - n % 3;
        int z = n % 3;
        int y = 0;
        if (x >= 3) {
            y = x /3;
        }
        m = m + y;
        if (y+z == 1 || y+z == 0) {
            return m;
        } else if (y+z == 2) {
            m = m +1;
            return m;
        } else {
            p(y+z);
        }
        return m;
    }
}
