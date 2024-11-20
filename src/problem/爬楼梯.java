package problem;

/**
 * @date 2024/11/20
 */
public class 爬楼梯 {

    public int climbStairs(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    /**
     * 递归方法
     */
    public int climbStairs2(int n) {
        int[] memo = new int[n + 1];
        return dp(n, memo);
    }

    public int dp(int n, int[] memo) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 1;
        }
        if (memo[n] > 0) {
            return memo[n];
        }
        memo[n] = dp(n - 1, memo) + dp(n - 2, memo);
        return memo[n];
    }

}
