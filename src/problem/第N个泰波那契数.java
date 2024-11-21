package problem;

/**
 * @date 2024/11/20
 */
public class 第N个泰波那契数 {

    // 循环
    public int tribonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 2;

        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }
        return dp[n];
    }

    // 递归 + 记忆
    public int tribonacci2(int n) {
        int[] memp = new int[n + 1];
        return dp(n, memp);
    }

    public int dp(int n, int[] memo) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 1;

        if (memo[n] > 0) {
            return memo[n];
        }
        return dp(n - 1, memo) + dp(n - 2, memo) + dp(n - 3, memo);
    }


    public static void main(String[] args) {
        第N个泰波那契数 test = new 第N个泰波那契数();
        int result = test.tribonacci2(4);
        System.out.println(result);

        System.out.println();
        int result2 = test.tribonacci2(25);
        System.out.println(result2);
    }
}
