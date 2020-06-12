package Review_001.Sort_001;

public class SelectSort {
    /**
     * 选择排序：从无序区间中选出最大或者最小的数放在无序区间的开头或者结尾。
     *
     */
    public static void main(String[] args) {
        int[] arr = {9,1,2,5,7,4,8,6,3,5};
        selectSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }

    }
    public static void selectSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            int tmp = arr[i];
            for (int j = i; j < arr.length; j++) {
                if (tmp < arr[j]) {
                    int x = arr[j];
                    arr[j] = tmp;
                    tmp = x;
                }
            }
            arr[i] = tmp;
        }
    }
}
