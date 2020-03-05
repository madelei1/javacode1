package Review;

import java.util.Arrays;

public class Shuzu {

    public static void main(String[] args) {
        int arr[]  = {1,2,3,4,5,9,7,8};
        int arr1[] = {1,2,3,4,5,6};
        String s = Arrays.toString(change(arr));
        System.out.println(s);
        System.out.println(koBei(arr));
        System.out.println(max(arr));
        System.out.println(pingJun(arr));
        System.out.println(find(arr,8));
        System.out.println(erFen(arr1,3));
        System.out.println(judge(arr));
        System.out.println(judge(arr1));

    }



    //将一个数组的内容都*2，且不改变数组的内容
    public static int[] change(int []arr) {
        int ret[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ret[i] = 2*arr[i];
        }
        return ret;

    }
    //数组的拷贝
    public static String koBei(int arr[]) {
        int[] newArray = Arrays.copyOf(arr,10);
        return Arrays.toString(newArray);
    }
    //数组的最大元素
    public  static int max(int arr[]) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return max;
    }
    //数组的平均值
    public static double pingJun(int[] arr) {
        double x = 0;
        for (int i = 0; i < arr.length; i++) {
            x += arr[i];
        }
        return x/arr.length;
    }
    //数组中顺序查找一个元素
    public static boolean find(int[] arr,int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return true;
            }
        }
        return false;
    }
    //查找---这个不是二分查找，二分查找的数组要是有序
    public static int find1(int[] arr, int x) {
        int left = 0;
        int right = arr.length -1;
        while (left < right) {
            if (arr[left] == x) {
                return left;
            }
            if (arr[right] == x) {
                return right;
            }
            left ++;
            right --;
        }
        return -1;

    }
    //折半查找/二分查找
    public static int erFen(int[] arr, int x) {
        int mid = arr.length/2;
        int left = 0;
        int right = arr.length;
        while (left <= right) {
            if (x < arr[mid]) {
                right = mid-1;
                mid = (right +left)/2;
            } else if (x > arr[mid]){
                left = mid +1;
                mid = (right +left)/2;
            } else {
                return mid;
            }

        }
        return -1;
    }
    //判断数组的有序性
    public static boolean judge(int[] arr) {
        if (arr[0] > arr[1]) {
            for (int i = 0; i < arr.length-1; i++) { //这里取arr.length-1因为有arr[i+1]防止数组越界
                if (arr[i] < arr[i+1]) {
                    return false;
                }
            }
        } else {
            for (int i = 0; i < arr.length-1; i++) {
                if (arr[i] > arr[i+1]) {
                    return false;
                }
            }
        }
        return true;

    }



}
