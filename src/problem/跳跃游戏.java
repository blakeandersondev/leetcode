package problem;

public class 跳跃游戏 {

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
}
