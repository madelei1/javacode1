package Review_001.Sort_001;

public class SelectSort1 {
    /**
     * 选择排序：就是在待排序区间中选择最大或者最小的数，放在数组的开头或者结尾。
     */

    public static void main(String[] args) {
        int[] arr = {9,1,2,5,7,4,8,6,3,5};
        p2(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }

    public static void p(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int x = arr[i];
            for (int j = 0; j < arr.length; j++) {
                if (x < arr[j]) {
                    int tmp = arr[j];
                    arr[j] = x;
                    x = tmp;
                }
            }
            arr[i] = x;
        }
    }
    //方法二：整个更加标准
    public static void p2(int[] a) {
        for (int i = 0; i < a.length; i++) {

            int max = 0;
            for (int j = 1; j < a.length-i; j++) {

                if (a[max] < a[j]) {
                    max = j;
                }
            }
            int x = a[max];
            a[max] = a[a.length-1-i];
            a[a.length-1-i] = x;
        }
    }
}
