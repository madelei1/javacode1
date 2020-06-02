package A_Daily_Topic;
import java.util.*;
public class Solution2 {

    public static void main(String[] args) {
        int[] a = {1,2,3,5,6,7,0,4};
        p1(a);
        print(a);
        System.out.println();
        System.out.println(count(a, 8));
    }
    public static int count(int[] A, int n) {
            // write code here
        if (n == 0 && n == 1) {
            return 0;
        }
        p1(A);
        int x = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (A[i] - A[j] == 1) {
                    x ++;
                }
            }

        }
        return x;
    }
    public static void p1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int max = 0;
            for (int j = 0; j < arr.length-i; j++) {
                if (arr[j] > arr[max]) {
                    max = j;
                }
            }
            int x = arr[arr.length-i-1];
            arr[arr.length-i-1] = arr[max];
            arr[max] = x;
        }
    }
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
    }
}
