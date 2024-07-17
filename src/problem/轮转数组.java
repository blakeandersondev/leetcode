package problem;

public class 轮转数组 {

    public void rotate(int[] nums, int k) {
        int n = nums.length;

        int gcd = gcd(n, k);
        for (int count = 0; count < gcd; count++) {
            int idx = count;
            int nextVal = nums[count];

            do {
                int newIdx = (idx + k) % n;

                int tmp = nums[newIdx];
                nums[newIdx] = nextVal;

                nextVal = tmp;
                idx = newIdx;
            } while (idx != count);
        }
    }

    // 计算最大公约数
    private int gcd(int x, int y) {
        return y > 0 ? gcd(y, x % y) : x;
    }

    public static void main(String[] args) {
        轮转数组 inst = new 轮转数组();

        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        inst.rotate(nums, 3);
        for (int n : nums) {
            System.out.print(n + " ");
        }
    }
}
