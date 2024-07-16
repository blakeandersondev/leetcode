public class 找到两个数组中的公共元素 {

    /*
    给你两个下标从 0 开始的整数数组 nums1 和 nums2 ，它们分别含有 n 和 m 个元素。

    请你计算以下两个数值：

    统计 0 <= i < n 中的下标 i ，满足 nums1[i] 在 nums2 中 至少 出现了一次。
    统计 0 <= i < m 中的下标 i ，满足 nums2[i] 在 nums1 中 至少 出现了一次。
    请你返回一个长度为 2 的整数数组 answer ，按顺序 分别为以上两个数值。
     */

    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int res1 = 0;
        int res2 = 0;

        for (int n1 : nums1) {
            for (int n2 : nums2) {
                if (n1 == n2) {
                    res1++;
                    break;
                }
            }
        }

        for (int n1 : nums2) {
            for (int n2 : nums1) {
                if (n1 == n2) {
                    res2++;
                    break;
                }
            }
        }
        return new int[]{res1, res2};
    }

    public static void main(String[] args) {
        int[] nums1 = {4, 3, 2, 3, 1};
        int[] nums2 = {2, 2, 5, 2, 3, 6};

        找到两个数组中的公共元素 inst = new 找到两个数组中的公共元素();
        int[] result = inst.findIntersectionValues(nums1, nums2);
        System.out.println(result[0] + " " + result[1]);
    }
}
