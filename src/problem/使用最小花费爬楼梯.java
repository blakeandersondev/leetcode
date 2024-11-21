package problem;

/**
 * @date 2024/11/21
 */

/*

输入：cost = [10,15,20]
输出：15
解释：你将从下标为 1 的台阶开始。
- 支付 15 ，向上爬两个台阶，到达楼梯顶部。
总花费为 15 。


输入：cost = [1,100,1,1,1,100,1,1,100,1]
输出：6
解释：你将从下标为 0 的台阶开始。
- 支付 1 ，向上爬两个台阶，到达下标为 2 的台阶。
- 支付 1 ，向上爬两个台阶，到达下标为 4 的台阶。
- 支付 1 ，向上爬两个台阶，到达下标为 6 的台阶。
- 支付 1 ，向上爬一个台阶，到达下标为 7 的台阶。
- 支付 1 ，向上爬两个台阶，到达下标为 9 的台阶。
- 支付 1 ，向上爬一个台阶，到达楼梯顶部。
总花费为 6 。
 */

public class 使用最小花费爬楼梯 {

    // 循环
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;

        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 0;

        for (int i = 2; i <= n; i++) {
            dp[i] = Math.min(dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 2]);
        }
        return dp[n];
    }


    // 无记忆递归
    public int minCostClimbingStairs2(int[] cost) {
        return Math.min(dp(0, cost), dp(1, cost));
    }

    public int dp(int i, int[] cost) {
        if (i >= cost.length) {
            return 0;
        }

        return Math.min(cost[i] + dp(i + 1, cost), cost[i] + dp(i + 2, cost));
    }

    // 增加记忆的递归
    public int minCostClimbingStairs3(int[] cost) {
        int[] memo = new int[cost.length + 1];
        return Math.min(dp2(0, cost, memo), dp2(1, cost, memo));
    }

    public int dp2(int i, int[] cost, int[] memo) {
        if (i >= cost.length) {
            return 0;
        }
        if (memo[i] != 0) {
            return memo[i];
        }
        memo[i] = Math.min(dp2(i + 1, cost, memo) + cost[i], dp2(i + 2, cost, memo) + cost[i]);
        return memo[i];
    }

}
