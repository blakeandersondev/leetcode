package problem;

public class 删除有序数组中的重复项II {

    // 1, 1, 2, 2, 2, 3
    public int removeDuplicates(int[] nums) {
        int left = 2;
        int right = 2;

        while (right < nums.length) {
            if (nums[left - 2] != nums[right]) {
                nums[left++] = nums[right];
            }
            right++;
        }
        return left;
    }

    public static void main(String[] args) {
        删除有序数组中的重复项II inst = new 删除有序数组中的重复项II();
        int result = inst.removeDuplicates(new int[]{1, 1, 1, 2, 2, 3});
        System.out.println(result);
    }
}
