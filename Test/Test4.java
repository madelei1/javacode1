package Test;

import java.util.Arrays;

public class Test4 {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int[] a = Arrays.copyOf(arr,5);
        System.out.println(Arrays.toString(a));
        if (args.length == 0 || args[0].equals("-h")) {
            System.out.println("hello");
        } else if (args[0].equals("-g")) {
            System.out.println("goodbye");
            for (int i = 0; i < args.length; i++) {
                System.out.print(args[i]+" ");
                System.out.println("!");
            }
        }
    }
}
