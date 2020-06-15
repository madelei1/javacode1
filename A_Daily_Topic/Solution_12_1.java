package A_Daily_Topic;

public class Solution_12_1 {
    public static void main(String[] args) {

        int x = 3;
        int y = 4;
        x = x^y;
        y = x^y;
        x = x^y;
        System.out.println(x+"+"+y);
    }

    public int[] exchangeAB(int[] AB) {
        // write code here

        AB[0] = AB[0]^AB[1];
        AB[1] = AB[0]^AB[1];
        AB[0] = AB[0]^AB[1];
        return AB;
    }
}
