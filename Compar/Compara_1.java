package Compar;

public class Compara_1 implements Comparable<Compara_1>{
    public int rank;
    public String suit;

    public Compara_1(int rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }
    public int compareTo(Compara_1 o) {
        if (o == null) {
            return 1;
        }
        return rank - o.rank;
    }
}
