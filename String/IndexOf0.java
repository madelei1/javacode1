package String;
//返回子字符串的索引值，没有就返回-1
public class IndexOf0 {
    public static void main(String[] args) {
        String s = "hello world";
        String s1 = "world";
        int x = indexOf1(s,s1);
        System.out.println(x);
    }

    public static int indexOf1(String str, String str2) {
        int num = 0;
        int j = 0;
        int i = 0;
        for (i = 0; i < str.length(); i++) {
            if (str.charAt(i) == str2.charAt(0)) {
                num  = 0;
                for ( j = 0; j < str2.length(); j++) {
                    if (str.charAt(i+j) != str2.charAt(j)) {
                        break;
                    }
                    num ++;
                }
                if (num == str2.length()) {
                    return i;
                }
            }
        }
        return -1;
    }
}


