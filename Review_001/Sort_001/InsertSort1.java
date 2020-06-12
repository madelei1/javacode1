package Review_001.Sort_001;

public class InsertSort1 {

    /**
     * 直接插入排序，从有序区间后面的第一个无序数开始，向有序的区间中插入，插入到第一个小于待插入的后面
     *
     */

    public static void main(String[] args) {
        int[] arr = {12,4,6,9,2};
        InsertSort1 insertSort1 = new InsertSort1();
        insertSort1.p(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public void p(int[] arr) {
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            int tmp = arr[i];
            for (j = i-1; j >= 0; j--) {
                if (tmp < arr[j]) {
                    arr[j+1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j+1] = tmp;
        }
    }



}
