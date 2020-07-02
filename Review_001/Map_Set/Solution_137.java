package Review_001.Map_Set;

import java.util.HashMap;
import java.util.Map;

public class Solution_137 {
    /**
     * 给定一个非空整数数组，除了某个元素只出现一次以外，
     * 其余每个元素均出现两次。找出那个只出现了一次的元素。
     * @param nums
     * @return
     */
    public int singleNumber(int[] nums) {
        int ret = 0;
        Map<Integer,Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i],map.get(nums[i])+1);
            } else {
                map.put(nums[i],1);
            }
        }
        for (int x: map.keySet()) {
            if (map.get(x) == 1) {
                return x;
            }
        }
        return ret;

    }
}
