package Compar;

import java.util.Comparator;

public class CardComparator implements Comparator<Card> {
    public int compare(Card o1, Card o2) {
        if (o1 == o2) {
            return 0;
        }
        if (o1 == null) {
            return -1;
        }
        if (o2 == null) {
            return 1;
        }
        return o1.rank - o2.rank;
    }
}
