package Collection_0;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class CardDome {
    public static class Card {
        public int rank;//牌面值
        public String suit;//花色

        @Override
        public String toString() {
            return String.format("[%s %d]",suit,rank);
        }
    }
    private static final String[] SUITS = {"♠", "♥","♣","♦"};

    /**
     * 刚买回来的牌:
     * 思路：将花色和数字组合，放入list集合中，在返回list
     * @return
     */
    public static List<Card> buyCard() {
        List<Card> list = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= 13; j++) {
                String s = SUITS[i];
                int x = j;
                Card card = new Card();
                card.rank = x;
                card.suit = s;
                list.add(card);
            }
        }
        return list;
    }

    /**
     *二二交换
     */
    public static void swap(List<Card> list, int i,int j) {

       Card s = list.get(i);
       list.set(i,list.get(j));
       list.set(j,s);
    }

    /**
     * 打乱牌序
     * @param list
     */
    public static void swapCard (List<Card> list) {
        Random random = new Random();
        for (int i = list.size()-1; i > 0; i--) {
            int r = random.nextInt(i);
            swap(list,i,r);
        }
    }

    public static void main(String[] args) {
        List<Card> list = buyCard();
        System.out.println("-----刚买回来的牌-----");
        System.out.println(list);
        swapCard(list);
        System.out.println("-----洗过的牌------");
        System.out.println(list);
        //三个人，每个人轮流抓 5 张牌
        List<List<Card>> hands = new ArrayList<>();
        hands.add(new ArrayList<>());
        hands.add(new ArrayList<>());
        hands.add(new ArrayList<>());
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                hands.get(j).add(list.remove(0));
            }
        }
        System.out.println("A:手中的牌");
        System.out.println(hands.get(0));
        System.out.println("B:手中的牌");
        System.out.println(hands.get(1));
        System.out.println("C:手中的牌");
        System.out.println(hands.get(2));


    }

}
