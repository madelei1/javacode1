package String;

public class CompareTo0 {
    public static void main(String[] args) {
        String s = "hello world";
        String s1 = "wold";
        String s2 = "hwllo world";
        int x = compareTo0(s,s1);
        System.out.println(compareTo0(s,s2));
        System.out.println(x);
    }
    public static int compareTo0(String s, String s1) {
        if (s.equals(s1)) {
            return 0;
        }
        char[] x = s.toCharArray();
        char[] y = s1.toCharArray();
        int l = 0;
        //int d = 0;
        if (x.length > y.length) {
            l = x.length;
           // d = y.length;
        } else {
           // d = x.length;
            l = y.length;
        }
        for (int i = 0; i < l; i++) {
            if(x[i] != y[i]) {
                return (int) x[i]- y[i];
            }
        }
        return 0;
    }
}
