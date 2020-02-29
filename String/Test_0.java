package String;

public class Test_0 {
    public static void main(String[] args) {

        String str1 = new String("hello").intern() ;
        String str2 = "hello" ;
        System.out.println(str1 == str2);
    }
}
