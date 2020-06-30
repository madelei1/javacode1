package Review_001.Sort_001;

public class shellSort1 {
    /**
     * 希尔排序：先选择一个整数作为趟数，需要执行几趟，
     * 再进行选择每一趟的gap（间隔数）为多少，最后一趟的间隔数必须是1.
     * 其中分割出的用直接插入排序进行。
     *
     */
    public static void main(String[] args) {

        int[] arr = {9,1,2,5,7,4,8,6,3,5};

        int[] arr1 = {5,3,1};


        for (int i = 0; i < arr1.length; i++) {
           p(arr,arr1[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }

    public static void p(int[] arr,int gap) {

        //默认第一个数是有序的，间隔gap个数所以第二个数是gap
        for (int i = gap; i < arr.length; i += gap) {
            int tmp = arr[i];
            int j = 0;
            for (j = i-gap; j >= 0; j -= gap) {
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
