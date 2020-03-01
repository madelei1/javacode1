package String;

import java.util.*;
public class Split_1{
    public static void main(String[] args) {

        /*Scanner sc = new Scanner(System.in);
        String i = sc.nextLine();

        String[] y = i.split(" ",2);
        for(String s: y) {
            System.out.print(s);

        }*/
        String str = "abcdef";
        String i = reverse(str,0,5);
        System.out.println(i);

    }
    public static String reverse(String str,int left,int right) {
        char[] i = str.toCharArray();
        for (int j = 0; j < i.length/2; j++) {
            char tep = i[left];
            i[left] = i[right];
            i[right] = tep;
            left ++;
            right --;
        }
        return new String(i);
    }

}
