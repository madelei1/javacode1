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
public class Solution_692 {
    /**
     * 给一非空的单词列表，返回前 k 个出现次数最多的单词。
     * <p>
     * 返回的答案应该按单词出现频率由高到低排序。如果不同的单词有相同出现频率，按字母顺序排序。
     *
     * @param words
     * @param k
     * @return
     */
    public List<String> topKFrequent(String[] words, int k) {
        LinkedList<String> res = new LinkedList<>();
        //单词和次数对应
        Map<String, Integer> map = new HashMap<>();
        //先将数组当中的每个单词存放至map当中
        for (String s : words) {
            if (map.get(s) == null) {
                map.put(s, 1);
            } else {
                map.put(s, map.get(s) + 1);
            }
        }

        PriorityQueue<Map.Entry<String, Integer>> minHeap = new PriorityQueue<>(k, new Comparator<Map.Entry<String, Integer>>() {
            //这个方法的作用是：放入元素之后，进行调整的。
            public int compare(Map.Entry<String, Integer> x, Map.Entry<String, Integer> y) {
                //频率相同：如果是小堆的形式是：i  love   出的时间就是love i 了
                if (x.getValue() == y.getValue()) {

                    return y.getKey().compareTo(x.getKey());
                    //return x.getKey().compareTo(y.getKey());
                }
                return x.getValue() - y.getValue();
            }
        });


        //每次添加的时候  触发上面的排序
        for (Map.Entry<String, Integer> i : map.entrySet()) {
            if (minHeap.size() < k) { // 未达到最大容量，直接添加
                minHeap.add(i);
            } else { // 队列已满
                Map.Entry<String, Integer> top = minHeap.peek();
                if (top.getValue() == i.getValue()) {
                    //相等之后，字母顺序小的入队
                    if (top.getKey().compareTo(i.getKey()) > 0) {
                        minHeap.poll();
                        minHeap.add(i);
                    }
                } else {
                    if (top.getValue() < i.getValue()) {
                        minHeap.poll();
                        minHeap.add(i);
                    }
                }
            }
        }
        System.out.println(minHeap);//可以看到结果和我们想要的是反着的。

        for (int i = 0; i < k; ++i) {
            String temp = minHeap.peek().getKey();
            res.add(0, temp);
            minHeap.poll();
        }
        return res;
    }
}
