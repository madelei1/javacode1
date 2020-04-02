package Sort;

import java.util.Arrays;

public class TestSort_1 {
    /**
     * 直接插入排序
     *
     * 时间复杂度：
     * 最坏情况下：O(n^2)   最好情况：O(n)
     * 空间复杂度：O(1)
     * 稳定性：稳定的排序
     * 特点：就是数据越有序用直接插入排序 ===》 越快
     * @param array
     * 直接插入排序：选第一个元素，从倒数第一个开始与前面比较，发现第一个小于他的就插入在其后面。
     */
    public static void insertSort(int[] array) {
        int j = 0;
        //后面的元素，
        for (int i = 1; i < array.length; i++) {
            int tmp = array[i];
            //前面的元素
            for ( j = i - 1; j >= 0; j--) {
                //array[j] >= tmp,这样写就代表不是稳定的排序
                if (array[j] > tmp) {
                    array[j+1] = array[j];
                } else {
                    break;
                }
            }
            //这里的j进行了--操作，所以j要+1
            array[j + 1] = tmp;
        }
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        insertSort(array);
        System.out.println(Arrays.toString(array));
    }
}
