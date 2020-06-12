package Review_001.Sort_001;

public class BubbleSort {
    /**
     * 冒泡排序：在有关无序的区间，通过相邻元素的比较，把最大的数冒泡的最后的，持续整个过程，
     * 直到数组有序。
     */
    public static void main(String[] args) {

        int[] arr = {2,1,3,8,7,6,5,9,10};
        BubbleSort bubbleSort1 = new BubbleSort();
        bubbleSort1.bubbleSort(arr);
        bubbleSort1.print(arr);

    }
    public void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    int x = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = x;
                }
            }
        }
    }
    public void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }
    }
}
