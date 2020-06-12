package Review_001.Sort_001;

public class InsertSort {
    /**
     * 直接插入排序：
     *  从无序区间第一个数，向有序数组插入，
     *  原理：第一个数据是有序的从第二个数据开始，把第二个数据放入tmp中，
     *  tmp与前面元素比较，如果比他小就直接插入。
     * @param args
     */
    public static void main(String[] args) {

        int[] arr = {2,1,3,8,7,6,5,9,10};
        InsertSort insertSort = new InsertSort();
        insertSort.insertSort1(arr);
        insertSort.print(arr);


    }
    public void insertSort1(int[] arr) {
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            int tmp = arr[i];
            for (j = i - 1; j >= 0; j--) {
                if (tmp < arr[j]) {
                    arr[j+1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j+1] = tmp;
        }
    }
    public void print(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
    }
}
