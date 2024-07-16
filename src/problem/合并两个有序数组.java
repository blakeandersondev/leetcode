package problem;

public class 合并两个有序数组 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int idx1 = 0;
        int idx2 = 0;

        int val = 0;
        int[] merge = new int[m + n];

        while (idx1 < m || idx2 < n) {
            if (idx1 >= m) {
                val = nums2[idx2++];
            } else if (idx2 >= n) {
                val = nums1[idx1++];
            } else if (nums1[idx1] > nums2[idx2]) {
                val = nums2[idx2++];
            } else {
                val = nums1[idx1++];
            }
            merge[idx1 + idx2 - 1] = val;
        }

        for (int i = 0; i < m + n; i++) {
            nums1[i] = merge[i];
        }
    }
}
