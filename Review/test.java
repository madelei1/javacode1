package Review;

public class test {
    public static void main(String[] args) {
        List x = new List(null, null, 0);
        x.addHead(1);
        x.addHead(2);
        x.addHead(3);
        x.addLast(4);
        x.addLast(5);//3 2 6 1 4 5
        //System.out.println(x.size());
        x.addIndex(2,6);
        System.out.println(x.size());
        x.addIndex(0,0);//0 3 2 6 1 4 5
        //x.traversal();
       // System.out.println();
        System.out.println(x.find(5));//true
        System.out.println(x.returnNum(3));
        //x.removeVal(0);
       // x.traversal();
        x.addHead(1);
        //x.traversal();//1 0 3 2 6 1 4 5
        x.removeAllVal(1);
        x.traversal();
    }
}
