package String;
/*
*
* A.true
  B.false
  C.1
  D.编译错误
选b
*/
public class SystemUtil{
    public static boolean isAdmin(String userId){
        //System.out.println(userId.toLowerCase());//admin
        return userId.toLowerCase()=="admin";

    }
    public static void main(String[] args){
        System.out.println(isAdmin("Admin"));
    }
}