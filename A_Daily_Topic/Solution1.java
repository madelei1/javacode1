package ADailyTopic;
import java.util.*;
public class Solution1 {
    public static void main(String[] args) {
        int[] a = {1,3,5,2,2};
        System.out.println(findKth(a, 5, 3));
    }
    public static int findKth(int[] a, int n, int K) {
            // write code here

        return p(a,0,n-1,K);

    }
    public static int p(int[] a, int left,  int right,int K) {
        int mid = (left + right)/2;
        int x = 0;
        if (mid > K) {
            return p(a,left,mid-1,K);
        } else if (mid < K) {
            return p(a,mid+1,right,K);
        } else {
            return a[mid];
        }
    }



}
