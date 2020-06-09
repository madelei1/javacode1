package A_Daily_Topic;

import java.util.Scanner;

public class Solution_07_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println(p(A,B));
    }
    public static int p(int a,int b) {
        int x = a;
        while(true) {
            if(x % a == 0 && x % b == 0) {
                break;
            } else{
                x ++;
            }
        }
        return x;
    }
}
