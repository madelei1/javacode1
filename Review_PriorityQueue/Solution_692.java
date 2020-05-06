package Review_PriorityQueue;

import java.util.*;

public class Solution_692 {

    /**
     * 给一非空的单词列表，返回前 k 个出现次数最多的单词。
     *
     * 返回的答案应该按单词出现频率由高到低排序。如果不同的单词有相同出现频率，按字母顺序排序。
     * @param words
     * @param k
     * @return
     */
    public List<String> topKFrequent(String[] words, int k) {
        List<String> list = new ArrayList<>();
        Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            if (map.containsKey(words[i])) {
                map.put(words[i], map.get(words[i])+1);
            } else {
                map.put(words[i],1);
            }
        }



        return list;
    }
    class Solution {
        public List<String> topKFrequent(String[] words, int k) {
            Map<String, Integer> count = new HashMap();
            for (String word : words) {
                count.put(word, count.getOrDefault(word, 0) + 1);
            }
            List<String> candidates = new ArrayList(count.keySet());
            Collections.sort(candidates, (w1, w2) -> count.get(w1).equals(count.get(w2)) ?
                    w1.compareTo(w2) : count.get(w2) - count.get(w1));

            return candidates.subList(0, k);
        }


    }
}
