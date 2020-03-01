package String;
import java.util.*;
public  class Main {
    //逆置
    public static String reverse(String str,int left,int right) {
        char[] value = str.toCharArray();
        while (left < right) {
            char ch = value[left];
            value[left] = value[right];
            value[right] = ch;
            left++;
            right--;
        }
        //return new String(value);
        return String.copyValueOf(value);//将数组变为字符串
    }

    public static String func(String str,int k) {
        if(k < 0 ||k == 1){
            return str;
        }
        String i = reverse(str,0,k-1);
        String y = reverse(i,k,i.length()-1);
        String x = reverse(y,0,i.length()-1);
        return x;
    }

    public static void main(String[] args) {
        //输入的处理
        Scanner sc = new Scanner(System.in);
        int k  =sc.nextInt();
        String res = sc.next();
        String str = func(res,k);
        System.out.println(str);

    }


}
