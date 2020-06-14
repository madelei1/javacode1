package A_Daily_Topic;

public class Solution_11_2 {

    /**
     * 给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],
     * 其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。不能使用除法。
     * （注意：规定B[0] = A[1] * A[2] * ... * A[n-1]，B[n-1] = A[0] * A[1] * ... * A[n-2];）
     * @param A
     * @return
     */

    public int[] multiply(int[] A) {

        int x = 0;
        int[] arr = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            x = 1;
            for (int j = 0; j < A.length; j++) {

                if (i != j) {
                    x = A[j]*x;
                }
            }
            arr[i] = x;
        }
        return arr;
    }
}
