package problem;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 多数元素 {

    public int majorityElementBySort(int[] nums) {
        Arrays.sort(nums);

        int size = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                size++;
            } else {
                size = 1;
            }

            if (size > nums.length / 2) {
                return nums[i - 1];
            }
        }
        return nums[0];
    }

    public int majorityElementByHash(int[] nums) {
        Map<Integer, Integer> map = new HashMap();

        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > nums.length / 2) {
                return entry.getKey();
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        多数元素 inst = new 多数元素();

        int[] nums = new int[]{3, 2, 3};
        int result = inst.majorityElementByHash(nums);
        System.out.println(result);

        int[] nums2 = new int[]{1};
        int result2 = inst.majorityElementByHash(nums2);
        System.out.println(result2);
    }
}
