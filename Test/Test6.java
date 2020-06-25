package Test;

import java.util.Arrays;

public class Test6 {
    public static void main(String[] args) {
        int[] arr = {9,8,7,1,2,3,4,5,6,};
        //如果直接这样改是错的
        //arr = {1,2,3,4,5,6,7,8,9,};
        arr = new int[] {1,2,3,4,5,6,7,8,9,};
        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.deepToString(a));
    }
}
