package problem;

import java.util.HashMap;
import java.util.Map;

public class 两数之和 {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i]) && map.get(target-nums[i]) != i) {
                return new int[]{i, map.get(target - nums[i])};
            }
        }

        return new int[]{};
    }

    public static void main(String[] args) {
        两数之和 inst = new 两数之和();
        inst.twoSum(new int[]{3, 2, 4}, 6);
    }
}
