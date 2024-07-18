package problem;

public class 跳跃游戏II {

    public int jump(int[] nums) {
        int n = nums.length;

        int jumps = 0;
        // 当前跳跃的范围
        int currentEnd = 0;
        // 当前范围内能达到的最远距离
        int farthest = 0;

        for (int i = 0; i < n - 1; i++) {
            // 当前跳跃能达到的最远距离
            farthest = Math.max(farthest, i + nums[i]);

            if (i == currentEnd) {
                jumps++;
                // 更新当前跳跃的范围
                currentEnd = farthest;

                if (currentEnd >= n - 1) {
                    break;
                }
            }
        }
        return jumps;
    }
}
