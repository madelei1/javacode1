package A_Daily_Topic;

import java.util.Scanner;

public class Solution_08_2 {
    public static void main(String[] args) {
        //3 9 6 8 -10 7 -11 19 30 12 23 5
        //-11 -10 3 6 7
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int k = 0;
        int i = 0;
        //int m = 0;
        while (sc.hasNextInt()) {
            k = sc.nextInt();
            arr[i] = k;
            i ++;

        }
        print(arr);
        System.out.println(i);
        if (i >= 1) {
            i = i-1;
        }

        int[] y = new int[i];
        for (int j = 0; j < i; j++) {
            y[j] = arr[j];
        }
        /*int[] y = {3, 9 ,6 ,8 ,-10, 7, -11, 19 ,30 ,12, 23};
        int k = 5;*/
        print(p(y,k));
    }
    public static int[] p(int[] arr,int k) {
        int [] arr1 = new int[k];
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]  = tmp;
                }
            }
        }
        for (int i = 0; i < k; i++) {
            arr1[i] = arr[i];
        }
        return arr1;
    }
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
