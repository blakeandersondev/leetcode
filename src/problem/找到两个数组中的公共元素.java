package problem;

public class 找到两个数组中的公共元素 {

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
