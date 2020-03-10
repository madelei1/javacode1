package String;

public class Contains0 {
    public static void main(String[] args) {
        String s = "hello world";
        String s1 = "wold";
        boolean x = contains0(s,s1);
        System.out.println(x);
    }
    public static boolean contains0(String s, String s1) {
        int count =0;
        for (int i = 0; i < s.length(); i++) {
            count = 0;
            if (s.charAt(i) == s1.charAt(0)) {
                for (int j = 0; j < s1.length(); j++) {
                    if (s.charAt(i+j) != s1.charAt(j)) {
                        break;
                    }
                    count ++;
                }
                if (count == s1.length()) {
                    return true;
                }
            }
        }
        return false;
    }
}
