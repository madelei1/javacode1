package Review_002.Sort;

import java.util.Arrays;

public class BubbleSort {
    //思路：将待排序元素与后面元素比较如果比他大就交换，每一趟将待排序的最大元素排到最后

    /**
     * https://blog.csdn.net/weixin_43232955/article/details/102761799?ops_request_misc=%257B%2522request%255Fid%2522%253A%2522159642094619195162563807%2522%252C%2522scm%2522%253A%252220140713.130102334..%2522%257D&request_id=159642094619195162563807&biz_id=0&utm_medium=distribute.pc_search_result.none-task-blog-2~all~first_rank_ecpm_v3~pc_rank_v2-1-102761799.first_rank_ecpm_v3_pc_rank_v2&utm_term=%E5%86%92%E6%B3%A1%E6%8E%92%E5%BA%8F%E7%9A%84%E4%B8%89%E7%A7%8D%E4%BC%98%E5%8C%96&spm=1018.2118.3001.4187
     * @param args
     */

    public static void main(String[] args) {

        int[] arr = {2,1,3,8,7,6,5,9,10};

        /*这里是没有优化的
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }*/
        bubbleSort1(arr);
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean b = false;
            //j<arr.length-1-i,因为i代表多少趟，i趟后，后面的i个数是有序的了，不需要在排序
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                    b = true;
                }
            }
            //这里表示如果b = false；表示一趟结束没有交换，表示是由序的了
            if (b) {
                break;
            }
        }
    }
    //第三种优化

    public static void bubbleSort1(int[] arr) {

        boolean flag = false;
        int pos = 0;//用来记录最后一次交换的位置
        int k = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < k; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    flag = true;
                    pos = j+1;
                }

            }
            if (flag) {
                break;
            }
            k = pos;
        }
    }

}
