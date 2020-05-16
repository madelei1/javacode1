package Compar;

import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        Compara_1 p = new Compara_1(1,"♠");
        Compara_1 q = new Compara_1(2,"♠");
        Compara_1 o = new Compara_1(1,"♦");
        int x = p.compareTo(q);//-1 小于0 说明p1比q1大
        int y = p.compareTo(o);//0  等于0 说明p1和q1相等
        int z = q.compareTo(p);//1  大于0 说明p1比q1小
        System.out.println(x+" "+y+" "+z);

        Comparator<Card> c = new CardComparator();
        Card p1= new Card(1,"♠");
        Card q1 = new Card(2,"♠");
        Card o1 = new Card(1,"♦");
        int x1 = c.compare(p1,q1);//-1  小于0 说明p1比q1大
        int y1 = c.compare(p1,o1);//0   等于0 说明p1和q1相等
        int z1 = c.compare(q1,p1);//1   大于0 说明p1比q1小

        System.out.println(x+" "+y+" "+z);
    }
}
