package Practice1;

import java.util.Arrays;

public class Shuzu {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] arr1 = Arrays.copyOf(arr,2);
        int[] arr2 = Arrays.copyOf(arr,4);
        int[] arr3 = Arrays.copyOf(arr,6);

       /* System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));*/
        //1,2,3,4--->1,0,2,3
        /*System.arraycopy(arr,1,arr,2,2);
        arr[1] = 0;
        System.out.println(Arrays.toString(arr));*/
        int[] arr4 = {1,2,3,4,5,6};
        //1,2,3,4,5,6--->1,4,5,6,2,3
        int[] arr5 = new int[6];
        System.arraycopy(arr4,1,arr5,1,2);
        System.out.println(Arrays.toString(arr5));
        System.arraycopy(arr4,3,arr4,1,3);
        System.out.println(Arrays.toString(arr4));
        System.arraycopy(arr5,1,arr4,4,2);
        System.out.println(Arrays.toString(arr4

        ));

    }
}
