package Review_mapAndset;

import java.util.HashMap;
import java.util.Map;

public class Solution_136 {
        public int singleNumber(int[] nums) {

            Map<Integer,Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                if (!map.containsKey(nums[i])) {
                    map.put(nums[i],1);
                } else {
                    map.put(nums[i],map.get(nums[i])+1);
                }
            }
            int x = 0;
            for (int i = 0; i < nums.length; i++) {
                if ( map.get(nums[i]) == 1) {
                    x = nums[i];
                }

            }
            return x;
        }

}
