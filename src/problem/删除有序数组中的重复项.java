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

    public static void main(String[] args) {
        删除有序数组中的重复项 inst = new 删除有序数组中的重复项();

        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int result = inst.removeDuplicates(nums);
        System.out.println(result);
        for (int n : nums) {
            System.out.print(n + " ");
        }
    }

}
