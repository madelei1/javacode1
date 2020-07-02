package Review_001.Map_Set;


import java.util.HashSet;
import java.util.Set;

public class Solution_771 {
    /**
     * 给定字符串J 代表石头中宝石的类型，和字符串 S代表你拥有的石头。
     * S 中每个字符代表了一种你拥有的石头的类型，你想知道你拥有的石头中有多少是宝石。
     * @param J
     * @param S
     * @return
     */
    public int numJewelsInStones(String J, String S) {
        int count = 0;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < J.length(); i++) {
            set.add(J.charAt(i));
        }
        for (int i = 0; i < S.length(); i++) {
            if (set.contains(S.charAt(i))) {
                count ++;
            }
        }
        return count;
    }
}
