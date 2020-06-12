package Review_001.Sort_001;

public class shellSort {

    /**
     * 希尔排序， 是对直接插入排序的优化。
     * 先选择一个正整数，来作为趟数（一般取3趟），然后规划每趟的间隔即（gap），最后一趟的gap一定是1.
     * 每一趟都是直接插入排序。
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = {9,1,2,5,7,4,8,6,3,5};

        int[] arr1 = {5,3,1};
        shellSort shellSort1 = new shellSort();

        for (int i = 0; i < arr1.length; i++) {
            shellSort1.shellSort1(arr,arr1[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
    public void shellSort1(int[] arr, int gap) {

        int j = 0;
        //这里的gap是指有序的区间后面第一个数，有序区间是第0个数，中间间隔gap个数字
        for (int i = gap; i < arr.length; i++) {
            int tmp = arr[i];
            for (j = i - gap; j >= 0; j -= gap) {
                if (tmp < arr[j]) {
                    arr[j+gap] = arr[j];
                } else {
                    break;
                }
            }
            arr[j+gap] = tmp;
        }
    }

}
