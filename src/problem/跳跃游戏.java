package problem;

public class 跳跃游戏 {

    // 动态规划解法
    public boolean canJump(int[] nums) {
        int n = nums.length;

        boolean[] dp = new boolean[n];
        dp[0] = true;

        for (int i = 0; i < n; i++) {
            if (dp[i]) {
                int maxJump = Math.min(i + nums[i], n - 1);
                for (int j = i + 1; j <= maxJump; j++) {
                    dp[j] = true;
                }
            }
        }
        return dp[n - 1];
    }

    // 贪心解法
    public boolean canJump2(int[] nums) {
        int n = nums.length;
        int maxJump = 0;

        for (int i = 0; i < n; i++) {
            if (i > maxJump) {
                return false;
            }

            maxJump = Math.max(maxJump, i + nums[i]);
            if (maxJump >= n - 1) {
                return true;
            }
        }
        return false;
    }
}
