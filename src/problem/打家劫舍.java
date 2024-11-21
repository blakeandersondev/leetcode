package problem;

/**
 * @date 2024/11/21
 */

/*
    你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。

    给定一个代表每个房屋存放金额的非负整数数组，计算你 不触动警报装置的情况下 ，一夜之内能够偷窃到的最高金额。

示例 1：

输入：[1,2,3,1]
输出：4
解释：偷窃 1 号房屋 (金额 = 1) ，然后偷窃 3 号房屋 (金额 = 3)。
     偷窃到的最高金额 = 1 + 3 = 4 。
示例 2：

输入：[2,7,9,3,1]
输出：12
解释：偷窃 1 号房屋 (金额 = 2), 偷窃 3 号房屋 (金额 = 9)，接着偷窃 5 号房屋 (金额 = 1)。
     偷窃到的最高金额 = 2 + 9 + 1 = 12 。

输入：[2,1,1,2]
输出: 4
*/

public class 打家劫舍 {

   /*
   1. 定义状态
   dp[i] 表示偷到第i家的最大金额

   2. 状态转移
   (1) 如果偷第i家 金额=dp[i-2] + nums[i]
   (2) 如果不偷第i家 金额=dp[i-1] 即沿用偷到上一家的金额

   3. 状态转移方程
   Matg.max(dp[i-2] + nums[i], dp[i-1])

   4. 初始化
   dp[0] = nums[0]
   dp[1] = Math.max(nums[0], nums[1]) 两家房子时，偷金额大的那家

   5. 计算结果处于n-1位置 即偷到最后一家时的金额
    */

    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];

        int n = nums.length;

        int[] dp = new int[n + 1];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(nums[i] + dp[i - 2], dp[i-1]);
        }
        return dp[n - 1];
    }

    public static void main(String[] args) {
        打家劫舍 test = new 打家劫舍();
        int result1 = test.rob(new int[]{2, 1, 1, 2});
        System.out.println(result1);

//        System.out.println();
//
//        int result2 = test.rob(new int[]{2,7,9,3,1});
//        System.out.println(result2);
    }

}
