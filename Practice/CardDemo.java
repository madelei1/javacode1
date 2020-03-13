package Practice_list;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CardDemo {
    //定义常量花色
    public static final String[] x = {"♥","♠","♦","♣"};
    //创建一副扑克牌
    public static List<Card> buyCard() {
        List<Card> s = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= 13; j++) {
                String huaSe = x[i];
                int num = j;
                Card card = new Card(huaSe,j);
                s.add(card);
            }
        }
        return s;
    }
    //交换集合中的Card
    public static void  swap(List<Card> s, int index, int i) {
        Card tmp = s.get(index);
        s.set(index,s.get(i));
        s.set(i,tmp);
    }
    //打乱牌的顺序
    public static void  sortCard(List<Card> s) {
        Random random = new Random();
        for (int j = s.size()-1; j > 0; j--) {
            int index = random.nextInt(j);
            swap(s,index,j);////[0-i)之间的某个值   含义：下标   2   51
        }
    }

    public static void main(String[] args) {
        List<Card> p = buyCard();
        System.out.println(p);
        sortCard(p);
        System.out.println(p);

        /**
         * 3个人每个人揭牌5张
         * 1.每个人揭的牌放到哪里呀？--建立三个List集合来存放
         * 2、怎么揭牌？--按照顺序一个一个的抽五张存放
         * 实际上就是把这张牌从list当中删除了
         */

        List<List<Card>> head = new ArrayList<>();
        List<Card> head1 = new ArrayList<>();
        List<Card> head2 = new ArrayList<>();
        List<Card> head3 = new ArrayList<>();
        head.add(head1);
        head.add(head2);
        head.add(head3);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                head.get(j).add(p.remove(0));
            }
        }
        System.out.println("第一个人手里的牌：");
        System.out.println(head.get(0));
        //System.out.println(hands1);
        System.out.println("第二个人手里的牌：");
        System.out.println(head.get(1));
        System.out.println("第三个人手里的牌：");
        System.out.println(head.get(2));
        System.out.println("剩下的牌：");
        System.out.println(p);



    }


}
