package problem;

public class 删除有序数组中的重复项 {

    public int removeDuplicates(int[] nums) {
        int idx = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                nums[idx++] = nums[i];
            }
        }
        return idx;
    }

    public int removeDuplicates2(int[] nums) {
        int left = 1;
        int right = 1;

        while (right < nums.length) {
            if (nums[left - 1] != nums[right]) {
                nums[left++] = nums[right];
            } else {
                right++;
            }
        }
        return left;
    }
}
