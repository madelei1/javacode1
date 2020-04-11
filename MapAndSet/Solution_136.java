package MapAndSet;

import java.util.HashSet;
import java.util.Set;

public class Solution_136 {
    /**
     * 题目：给定一个非空整数数组，除了某个元素只出现一次以外，
     * 其余每个元素均出现两次。找出那个只出现了一次的元素。
     * @param nums
     * @return
     */
    public int singleNumber1(int[] nums) {
        int x = 0;
        for (int i = 0; i < nums.length; i++) {
            x =  nums[i] ^ x;
        }
        return x;
    }
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                set.remove(nums[i]);
            }else {
                set.add(nums[i]);
            }
        }
        int ret = 0;
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                ret = nums[i];
                break;
            }
        }
        return ret;
    }
}
