package String;
/*
* A.行4，行6都不执行
B.行6执行，行4不执行
C.行4执行，行6不执行
D.行4，行6都将执行
选c*/
public class a {
    public static void main(String[] args) {
        String s1="abc"+"def";//1
        String s2=new String(s1);//2
        if(s1.equals(s2))//3
            System.out.println(".equals succeeded");//4
        if(s1==s2)//5
            System.out.println("==succeeded");//6
    }

}
