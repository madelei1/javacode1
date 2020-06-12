package Review_001.Sort_001;

public class BubbleSort1 {

    /**
     * 冒泡排序：从无序的区间通过相邻的元素比较，把较大的值排序到，区间后面的过程
     *
     */
    public static void main(String[] args) {

        int[] arr = {2,1,3,8,7,6,5,9,10};
        p(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
    public static void p(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    int tmp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }
}
